package Delivery;

import Delivery.Delivery;

/**
 * Classe du retrait directement en entrepôt du magasin
 */
public class TakeAwayDelivery implements Delivery {

    /**
     * Constructeur de la classe TakeAwayDelivery
     */
    public TakeAwayDelivery(){}

    /**
     * Utilisation de la méthode de renvoi de prix de l'interface
     * @return  Renvoi le prix en fonction du type de livraison
     */
    @Override
    public double getPrice() {
        return 0;
    }

    /**
     * Utilisation de la méthode de l'interface qui renvoie le type de livraison
     * @return Renvoie le type de livraison
     */
    @Override
    public String getInfo() { return "TakeAwayDelivery"; }
}
