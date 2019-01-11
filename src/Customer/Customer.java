package Customer;

/**
 * Déclaration de la classe customer
 */
public class Customer {

    /**
     * Déclaration de l'identité du client et de son adresse
     */
    private String fullname;
    private String address;

    /**
     * Constructeur du client avec son identité et son adresse
     * @param fullname  Identité du client
     * @param address   Adresse du client
     */
    public Customer(String fullname, String address) {
        this.fullname = fullname;
        this.address = address;
    }

    /**
     * Accesseur à l'adresse
     * @return  Renvoie l'adresse du client
     */
    public String getAddress() {
        return address;
    }

    /**
     * Accesseur à l'identité du client
     * @return  Renvoie l'identité du client
     */
    public String getFullname() {
        return fullname;
    }

}
