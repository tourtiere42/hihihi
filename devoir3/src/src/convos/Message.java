package src.convos;

import java.io.Serializable;
import java.sql.Timestamp;

import src.Etudiant;

public class Message implements Serializable {
    public static final String MESSAGE_SUPPRIME = "Message supprimé";

    private Etudiant envoyeur;
    private String message;
    private Timestamp dateEnvoie;

    public Message(Etudiant envoyeur, String message, Timestamp dateEnvoie) {
        this.envoyeur = envoyeur;
        this.message = message;
        this.dateEnvoie = dateEnvoie;
    }

    public Etudiant getEnvoyeur() {
        return envoyeur;
    }

    //Laisse un message bidon
    public void supprimerContenu() {
        message = MESSAGE_SUPPRIME;
    }

    //Elimine l'utilisateur, tout en laissant un message bidon
    public void purge() {
        envoyeur = Etudiant.ETUDIANT_DELETED;
        supprimerContenu();
    }

    public String toString() {
        return dateEnvoie + " | " + envoyeur + "\n" + message;
    }
}

