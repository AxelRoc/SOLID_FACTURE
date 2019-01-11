package Delivery;

import Delivery.Delivery;

/**
 * Classe de la livraison à domicile
 */
public class DirectDelivery implements Delivery {

    /**
     * Constructeur de la classe DirectDelivery
     */
    public DirectDelivery(){}

    /**
     * Utilisation de la méthode de renvoi de prix de l'interface
     * @return Renvoie le prix en fonction du type de livraison
     */
    @Override
    public double getPrice() {
        return 4.99;
    }

    /**
     * Utilisation de la méthode de l'interface qui renvoie le type de livraison
     * @return Renvoie le type de livraison
     */
    @Override
    public String getInfo() { return "DirectDelivery"; }
}
