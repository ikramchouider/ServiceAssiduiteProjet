public class Etudiant {
    private String nom;
    private String prenom;
    private String matricule;
    private String groupe;
    private Niveau niveau;
    private int[] nbAbsence = new int[10];

    public Etudiant(String nom, String prenom, String matricule, String groupe, Niveau niveau) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.groupe = groupe;
        this.niveau = niveau;
    }

    public String getnom() {
        return (nom);
    }

    public String getprenom() {
        return (prenom);
    }

    public String getmatricule() {
        return (matricule);
    }

    public String getgroupe() {
        return (groupe);
    }

    public Niveau getNiveau() {
        return (niveau);
    }

    public int getnbAbsence(int numModule) {
        return (nbAbsence[numModule]);
    }

    public void setnbAbsence(int numModule) {
        nbAbsence[numModule]++;
    }

    /*
     * public void afficher() {
     * System.out.println("Nom: " + nom + " Prenom: " + prenom + " Matricule: " +
     * matricule + " Niveau: " + niveau.code
     * + " Groupe: " + groupe);
     * for (int i = 0; i < niveau.NBmodules; i++) {
     * System.out.println(" Module: " + niveau.modules[i].module +
     * " Nombre d'absence : " + nbAbsence[i]);
     * 
     * }
     * 
     * }
     */

    public void afficher() {
        System.out.println(
                "Nom: " + nom + " Prenom: " + prenom + " Matricule: " + matricule + " Niveau: " + niveau.getcode()
                        + " Groupe: " + groupe);
    }

    public void afficher(int numModule) {
        System.out.println(
                "Nom: " + nom + " Prenom: " + prenom + " Matricule: " + matricule + " Niveau: " + niveau.getcode()
                        + " Groupe: " + groupe);
        System.out.println(" Nombre d'absence : " + nbAbsence[numModule]);

    }
}