package Writer;

/**
 * Interface Writer qui va permettre de gérer les différents moyens de génération d'une facture
 */
public interface Writer {

    /**
     * Méthodes permettant de générer une facture
     */
    void start();
    void writeLine(String line);
    void stop();

}
