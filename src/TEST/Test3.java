package TEST;

import jdk.jfr.Category;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Test3 {
    private PersistenceManager persistenceManager;

    public MigrationService(PersistenceManager persistenceManager) {
        this.persistenceManager = persistenceManager;
    }

    public void migrate(Being object, Group group, Type type) {
        switch (type) {
            case COPY_SINGLE:
                copySingle(object, group);
                break;
            case MOVE_SINGLE:
                if (object instanceof Product) {
                    moveProductSingle((Product) obj, group);
                } else if (object instanceof Category) {
                    moveCategorySingle((Category) obj, group);
                } else {
                    throw new IllegalArgumentException("");
                }
                break;
            case COPY_MANY:
                copyAll(object, group);
                break;
            case MOVE_MANY:
                copyAll(object, group);
                deleteOriginAll(object);
                break;
        }
    }

    private void moveCategorySingle(Category category, Group group) {
        final String originalName = category.getName();
        final String tmpName = originalName + "~moving";

        try {
            this.persistenceManager.updateCategory(category, tmpName);

            this.persistenceManager.createCategory(originalName, group);

            this.persistenceManager.deleteCategory(category);

        } catch (IOException e) {
            System.out.println("[moveCategorySingle] 실패: " + e.getMessage());
        }
    }

    private void copyAll(Being object, Group group) {
        Set<String> madeCats = new HashSet<>();
        Set<String> madeProds = new HashSet<>();

        try {
            if (object instanceof Category) {
                Category c = (Category) object;

                String cNewName = c.getName() + "-copy";
                if (madeCats.add(cNewName)) {
                    this.persistenceManager.createCategory(cNewName, target);
                }

                for (Product p : pm.getProducts(c)) {
                    String pNewName = p.getName() + "-copy";
                    if (madeProds.add(pNewName)) {
                        this.persistenceManager.createProduct(pNewName, target);
                    }

                    this.persistenceManager.addProductToCategory(new ProductStub(pNewName),
                            new CategoryStub(cNewName));
                }

            } else if (object instanceof Product) {
                Product p = (Product) object;

                for (Category c : pm.getCategories(p)) {
                    String cNewName = c.getName() + "-copy";
                    if (madeCats.add(cNewName)) {
                        this.persistenceManager.createCategory(cNewName, target);
                    }

                    for (Product q : this.persistenceManager.getProducts(c)) {
                        String qNewName = q.getName() + "-copy";
                        if (madeProds.add(qNewName)) {
                            this.persistenceManager.createProduct(qNewName, target);
                        }
                        this.persistenceManager.addProductToCategory(new ProductStub(qNewName),
                                new CategoryStub(cNewName));
                    }
                }

            } else {
                throw new IllegalArgumentException("Unsupported Being");
            }
        } catch (IOException e) {
            System.out.println("[copyAll] 실패: " + e.getMessage());
        }
    }


    private void moveProductSingle(Product product, Group group) {
        String originalName = product.getName();
        String tmpName = originalName + "~moving-";

        try {
            this.persistenceManager.updateProduct(product, tmpName);
            this.persistenceManager.createProduct(originalName, group);
            this.persistenceManager.deleteProduct(product);
        } catch (IOException e) {
            System.out.println("[moveProductSingle] 실패: " + e.getMessage());
        }
    }

    private void copySingle(Being object, Group target) {
        try {
            if (object instanceof Product) {
                this.persistenceManager.createProduct(object.getName() + "-copy", target);
            } else if (object instanceof Category) {
                this.persistenceManager.createCategory(object.getName() + "-copy", target);
            } else {
                throw new IllegalArgumentException("Unsupported Being");
            }
        } catch (IOException e) {
            System.out.println("복사 실패: " + e.getMessage());
        }
    }

    private void deleteOrigin(Being object) {

    }

    private void copyAll(Being object, Group target) {

    }

    private void deleteOriginAll(Being object) {

    }

    public enum Type {
        COPY_SINGLE,
        MOVE_SINGLE,
        COPY_MANY,
        MOVE_MANY
    }
}
