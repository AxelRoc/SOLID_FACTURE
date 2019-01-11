package Delivery;

import Delivery.Delivery;

/**
 * Classe de la livraison express à domicile
 */
public class ExpressDelivery implements Delivery {

    /**
     * Variable qui va stocker l'adresse de livrason
     */
    private String address;

    /**
     * Constructeur de la classe ExpressDelivery
     * @param address  Adresse de la livraison
     */
    public ExpressDelivery(String address){
        this.address = address;
    }

    /**
     * Utilisation de la méthode de renvoi de prix de l'interface
     * @return  Renvoi du prix en fonction de la ville de livraison
     */
    @Override
    public double getPrice() {
        if (address.indexOf("Paris") >= 0){   // Si la livraison s'effectue dans Paris
            return 6.99;
        }

        else {  // Si la livraison s'effectue en dehors de Paris
            return 9.99;
        }
    }

    /**
     * Utilisation de la méthode de l'interface qui renvoie le type de livraison
     * @return Renvoie le type de livraison
     */
    @Override
    public String getInfo() { return "ExpressDelivery"; }
}
