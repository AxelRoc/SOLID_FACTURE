package Writer;

/**
 * Classe TerminalWriter qui permet d'afficher la facture dans un terminal
 */
public class TerminalWriter implements Writer {

    /**
     * Déclaration de la variable contenant le contenu de la facture
     */
    private String contentFacture;

    /**
     * Constructeur de la classe TerminalWriter
     */
    public TerminalWriter() {
    }

    /**
     * Utilisation de la méthode d'initialisation de l'interface pour la génération d'une facture, ici on initialise le contenu de la facture
     */
    @Override
    public void start() {
        this.contentFacture = "";   // Initialisation du contenu de la facture
    }

    /**
     * Complétion du contenu de la facture
     * @param line  On ajoute au contenu de la facture la ligne line et un séparateur de ligne
     */
    @Override
    public void writeLine(String line) {
        contentFacture = contentFacture + line + "\n";
    }

    /**
     * Utilisation de la fonction d'arrêt de l'interface pour terminer la facture, ici on vient afficher la facture dans le terminal
     */
    @Override
    public void stop() {
        System.out.println("Affichage de la facture :");
        System.out.println(contentFacture);     // Affichage de la facture
    }

}
