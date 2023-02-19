public class Seance {
    private String date;
    private Module module;
    private boolean[] abscence = new boolean[10];
    private Etudiant[] etudiants;

    public Seance(String date, Module module, Etudiant[] etudiants) {
        this.date = date;
        this.module = module;
        this.etudiants = etudiants;
        for (int i = 0; i < this.etudiants.length; i++) {
            abscence[i] = true;
        }

    }

    public void setAbsence(Etudiant[] etudiant) {

        for (int i = 0; i < etudiant.length; i++) {
            int j = 0;
            while (this.etudiants[j].getnom() != etudiant[i].getnom()) {
                j++;
            }
            abscence[j] = false;
            module.setnbAbsence(etudiants[j]);
        }

    }

    public void afficher() {
        System.out.println("Date : " + date + "Module:" + module.getmodule());
        for (int i = 0; i < etudiants.length; i++) {
            etudiants[i].afficher();
            if (abscence[i])
                System.out.println(" present(e)");
            else
                System.out.println("abscent(e)");
        }

    }

    public void afficher(Etudiant etudiant) {
        int i = 0;
        while (this.etudiants[i].getnom() != etudiant.getnom()) {
            i++;
        }

        if (!abscence[i]) {
            System.out.println("Date : " + date + "Module:" + module.getmodule());
            System.out.println("abscent(e)");
        }

    }

}
