package Product;

import Product.Product;

/**
 * Classe Television héritée de Product
 */
public class Television extends Product {

    /**
     * Déclaration de la taille et du type de télévision
     */
    private int size;
    private String slabType;

    /**
     * Constructeur de la classe Television qui prend en argument le nom, la description, le prix, la taille et le type du produit
     * @param name        Nom du produit
     * @param description Description du produit
     * @param price       Prix du produit
     * @param size        Taille de la télévision
     * @param slabType    Type de télévision
     */
    public Television(String name, String description, double price, int size, String slabType) {
        super(name, description, price);
        this.size = size;
        this.slabType = slabType;
    }

    /**
     * Accesseur à la taille de la télévision
     * @return  Renvoi la taille de la télévision
     */
    public int getSize() {
        return size;
    }

    /**
     * Accesseur au type de télévision
     * @return  Renvoi le type de télévision
     */
    public String getSlabType() {
        return slabType;
    }
}
