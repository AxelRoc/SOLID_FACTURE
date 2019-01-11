package Product;

import Product.Product;

/**
 * Classe Fridge héritée de Product
 */
public class Fridge extends Product {

    /**
     * Déclaration du volume et du booléen de capacité de congélation du réfrigérateur
     */
    private int liter;
    private boolean freezer;

    /**
     * Constructeur de la classe Fridge qui prend en argument le nom, la description, le prix, la contenance et la capacité de congélation du produit
     * @param name        Nom du produit
     * @param description Description du produit
     * @param price       Prix du produit
     * @param liter       Volume du réfrigérateur
     * @param freezer     Capacité de congélation
     */
    public Fridge(String name, String description, double price, int liter, boolean freezer) {
        super(name, description, price);
        this.liter = liter;
        this.freezer = freezer;
    }

    /**
     * Accesseur au volume du réfrigérateur
     * @return  Renvoi du volume de contenance du refrigérateur
     */
    public int getLiter() {
        return liter;
    }

    /**
     * Accesseur au booléen de confirmation des capacité de congélation du réfrigérateur
     * @return  Renvoi de la valeur du booléen
     */
    public boolean isFreezer() {
        return freezer;
    }
}

