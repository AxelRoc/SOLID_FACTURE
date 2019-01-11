package Writer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classe FileWriter qui permet d'écrire la facture dans un fichier
 */
public class FileWriter implements Writer {

    /**
     * Déclaration des attributs de la classe FileWriter : nom du fichier, chemin du fichier et contenu du fichier
     */
    private String filename;
    private Path path;
    private String content;

    /**
     * Constructeur de FileWriter avec le nom du fichier
     */
    public FileWriter(String filename) {
        this.filename = filename;
    }

    /**
     * Utilisation de la méthode d'initialisation de l'interface pour la génération d'une facture, ici on crée le chemin d'accés au fichier et on initialise le contenu
     */
    @Override
    public void start() {
        path = Paths.get(filename);     // On crée le chemin du fichier
        content = "";
    }

    /**
     * Remplissage du contenu du fichier
     * @param line  Ligne qui vient s'ajouter au contenu du fichier
     */
    @Override
    public void writeLine(String line) {
        content += line + "%n";     // On ajoute la ligne et un séparateur de ligne au contenu du fichier
    }

    /**
     * Utilisation de la fonction d'arrêt de l'interface pour terminer la facture, ici on vient écrire dans le fichier le contenu généré jusqu'ici ; si une erreur se produit, on prévient l'utilisateur dans le terminal
     */
    @Override
    public void stop() {
        try {   // On essaie d'ajouter au fichier le contenu de content
            Files.write(path, String.format(content).getBytes());
        } catch (IOException e) {   // Si une erreur se produit, on prévient l'utilisateur
            System.err.println("Impossible de rédiger la facture");
        }
    }
}