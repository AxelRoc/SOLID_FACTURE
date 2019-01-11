package Delivery;

/**
 * Interface qui permet de gérer les différents types de livraison
 */
public interface Delivery {

    /**
     * Méthode pour obtenir le prix en fonction du type de livraison
     */
    double getPrice();

    /**
     * Méthode pour obtenir le type de livraison
     */
    String getInfo();
}
