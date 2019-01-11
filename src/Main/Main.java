package Main;

import Delivery.*;
import Product.*;
import Customer.*;
import Bill.*;
import Writer.*;

/**
 * Programme principal du projet
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Initialisation de 3 produits, d'un client et d'une facture
         */
        Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);   // initialisation du produit cafe
        Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");     // initialisation du produit Television
        Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);  // initialisation du produit Fridge
        Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");   // initialisation d'un client quelconque avec une identité et une adresse
        Bill bill = new Bill(customer, new ExpressDelivery(customer.getAddress()));     // initialisation d'une facture adressée au client précédent avec son choix de livraison

        /**
         * Ajout des 3 produits à la facture
         */
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);

        /**
         * Génération de la facture
         */
        bill.generate(new TerminalWriter());
    }
}
