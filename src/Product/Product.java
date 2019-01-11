package Product;

import Bill.*;

/**
 * Déclaration de la classe Product
 */
public class Product {
    /**
     * Déclaration des attributs d'un produit
     */
    private String name;
    private String description;
    private double price;

    /**
     * Constructeur de la classe Product qui prend en argument le nom, la description et le prix du produit
     * @param name  Nom du produit
     * @param description Description du produit
     * @param price     Prix du produit
     */
    public Product(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Méthode qui permet d'afficher le nom, la description et le prix du produit
     */
    public void look() {
        System.out.println("    Nom : " + name);
        System.out.println("    Description : " + description);
        System.out.println("    Prix unitaire : " + price);
    }

    /**
     * Méthode qui permet d'acheter un produit et de l'ajouter à la facture
     * @param bill  On fournit la facture à modifier
     * @param integer   On fournit la quantité du produit acheté
     */
    public void buy(Bill bill, Integer integer) {
        bill.addProduct(this, integer);
    }

    /**
     * Accesseur au nom du produit
     * @return  Rnevoie le nom du produit
     */
    public String getName() {
        return name;
    }

    /**
     * Accesseur à la description du produit
     * @return  Renvoie la description du produit
     */
    public String getDescription() {
        return description;
    }

    /**
     * Accesseur au prix du produit
     * @return  Renvoie le prix du produit
     */
    public double getPrice() {
        return price;
    }

    /**
     * Mutateur du prix du produit
     * @param price     Nouvelle valeur du prix
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
