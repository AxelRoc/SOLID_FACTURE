package Bill;

import Customer.Customer;
import Delivery.Delivery;
import Product.Product;
import Writer.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Création de la classe Bill
 */
public class Bill {

    /**
     * Déclaration du client, des produits et du type de livraison à afficher sur la facture
     */
    private Customer customer;
    private Map<Product, Integer> products;
    private Delivery delivery;

    /**
     * Constructeur de la classe Bill, on initialise une liste vide pour les produits
     * @param customer  Client à qui la facture va s'adresser
     * @param delivery  Type de livraison choisi par le client
     */
    public Bill(Customer customer, Delivery delivery){
        this.customer = customer;
        this.delivery = delivery;
        this.products = new HashMap<>();
    }

    /**
     * Méthode qui permet d'ajouter un produit, avec la quantité associée, à la liste des produits écrits sur la facture
     * @param product Produit à ajouter
     * @param integer Quantité du produit à ajouter
     */
    public void addProduct(Product product, Integer integer){
        this.products.put(product, integer);
    }

    /**
     * Méthode qui permet de générer la facture
     * @param writer    Paramètre qui permet de déterminer sous quel format on souhaite générer la facture (fichier texte, affichage dans le terminal, fichier pdf...)
     */
    public void generate(Writer writer) {

        writer.start();     // On appelle la méthode de Writer qui permet d'initialiser la génération de la facture

        /* Simulation d'une fausse entreprise */
        writer.writeLine("HomeShop compagnie");
        writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");
        writer.writeLine("");

        /* Adressage de la facture en fonction du nom et de l'adresse du client */
        writer.writeLine("Facture à l'attention de : ");
        writer.writeLine(customer.getFullname());   // On affiche l'identité du client
        writer.writeLine(customer.getAddress());    // On affiche l'adresse du client
        writer.writeLine("");

        writer.writeLine("Mode de livraison : " + delivery.getInfo());  // On affiche le mode de livraison choisi par le client
        writer.writeLine("");

        /* Constitution de la liste des produits que le client souhaite acheter avec leur nom, leur description, leur prix unitaire, et la quantité de produits désirée */
        writer.writeLine("Produits : ");
        writer.writeLine("-----------------------------------------------------");
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {     // Pour chaque produit
            Product product = entry.getKey();   // On sélectionne le produit (clef de la HashMap)
            Integer quantity = entry.getValue();    // On sélectionne la quantité de produit (valeur de la clef)
            writer.writeLine(product.getName() + " - " + product.getPrice() + " - " + quantity + " unité(s)");  // On affiche le nom, le prix unitaire et la quantité du produit
            writer.writeLine(product.getDescription());     // On affiche la description du produit
            writer.writeLine("");
        }

        writer.writeLine("Livraison : " + delivery.getPrice());     // Ajout du prix de la livraison
        writer.writeLine("-----------------------------------------------------");

        writer.writeLine("Total : " + this.getTotal());     // Affichage du prix total de la facture

        writer.stop();  // Utilisation de la méthode d'arrêt de la génération de la facture
    }

    /**
     * Méthode qui permet de calculer le montant total d'une facture
     * @return  Renvoi le montant total de la facture
     */
    public double getTotal() {

        double total = delivery.getPrice();     // Prise en compte du prix de la livraison

        /* Prise en compte du prix de chaque produit en fonction des quantités achetées */
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {     // Pour chaque produit
            Product product = entry.getKey();   // On sélectionne le produit (clef de la HashMap)
            Integer quantity = entry.getValue();    // On sélectionne la quantité (valeur de la clef)
            total += product.getPrice() * quantity;     // On ajoute au total le prix du lot de produits
        }

        return total;
    }

    /**
     * Accesseur vers le client
     * @return On renvoie le client
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Accesseur à la liste des produits et des quantités respectives
     * @return  Renvoie la liste des produits de la facture avec les quantités associées
     */
    public Map<Product, Integer> getProducts() {
        return products;
    }
}
