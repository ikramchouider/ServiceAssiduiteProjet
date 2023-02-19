public class Groupe {
    private String code;
    protected Etudiant[] etudiants;

    public Groupe(String code, Etudiant[] etudiants) {
        this.code = code;
        this.etudiants = etudiants;
    }

    public int getEtudiant(Etudiant etudiant) {
        int i = 0;
        while (this.etudiants[i].getnom() != etudiant.getnom())
            i++;
        return (i);
    }

    public int getEtudiantlength() {
        return (etudiants.length);
    }

    public void Afficher() {
        System.out.println(code);
        for (int i = 0; i < this.etudiants.length; i++) {
            etudiants[i].afficher();
        }
    }

}