public class ServiceAssiduite {
    private Seance[] seances = new Seance[100];
    private int NBseances;

    public ServiceAssiduite() {

    }

    public void AddSeance(Seance seance) {
        seances[NBseances] = seance;
        NBseances++;

    }

    public void Afficher() {
        for (int i = 0; i < NBseances; i++) {
            seances[i].afficher();
        }
    }

    public void Afficher(Module module) {
        module.afficher();
    }

    public void Afficher(Etudiant etudiant) {
        for (int i = 0; i < NBseances; i++) {
            seances[i].afficher(etudiant);
        }
    }

}
