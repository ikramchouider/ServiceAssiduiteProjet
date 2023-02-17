public class Module {
    private String module;
    private Groupe groupe;
    private int numModule;

    public Module(String module, int numModule) {
        this.module = module;
        this.numModule = numModule;
    }

    public void setgroupe(Groupe groupe) {
        this.groupe = groupe;

    }

    public String getmodule() {
        return (module);
    }

    public void setnbAbsence(Etudiant etudiant) {
        int i = this.groupe.getEtudiant(etudiant);
        this.groupe.etudiants[i].setnbAbsence(numModule);
    }

    public int getnbAbsence(Etudiant etudiant) {
        int i = this.groupe.getEtudiant(etudiant);
        return (this.groupe.etudiants[i].getnbAbsence(numModule));
    }

    public void afficher() {
        System.out.println("*******Module : " + module + " *************");
        for (int i = 0; i < groupe.getEtudiantlength(); i++) {
            groupe.etudiants[i].afficher(numModule);

        }

    }

}
