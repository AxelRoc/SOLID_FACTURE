package Delivery;

import Delivery.Delivery;

/**
 * Classe de la livraison en point relais
 */
public class RelayDelivery implements Delivery {

    /**
     * Identifiant du point relais
     */
    private int RelayPoint;

    /**
     * Constructeur de la classe RelayDelivery
     * @param RelayPoint    Identifiant du point relais
     */
    public RelayDelivery(int RelayPoint){
        this.RelayPoint = RelayPoint;
    }

    /**
     * Utilisation de la méthode de renvoi de prix de l'interface
     * @return Renvoie le prix en fonction de l'identifiant du point relais
     */
    @Override
    public double getPrice() {
        if (1 <= RelayPoint && RelayPoint <= 22){   // Si l'identifiant du point relais est compris entre 1 et 22 inclus
            return 0;
        }

        else if (23 <= RelayPoint && RelayPoint <= 47){     // Si l'identifiant du point relais est compris entre 23 et 47 inclus
            return 2.99;
        }

        else {  // S'il n'est pas compris dans les deux fourchettes précédentes
            return 4.99;
        }
    }

    /**
     * Utilisation de la méthode de l'interface qui renvoie le type de livraison
     * @return Renvoie le type de livraison
     */
    @Override
    public String getInfo() { return "RelayDelivery"; }
}
