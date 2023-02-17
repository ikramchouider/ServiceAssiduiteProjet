public class Niveau {
    private String code;
    private Module[] modules = new Module[10];
    private int NBmodules;

    public Niveau(String code) {
        this.code = code;
    }

    public void AddModule(Module module) {
        this.modules[NBmodules] = module;
        NBmodules++;
    }

    public String getcode() {
        return (code);

    }

    public int getNBmodules() {
        return (NBmodules);
    }

    public void Afficher() {
        System.out.println("Niveau: " + this.code);
        for (int i = 0; i < NBmodules; i++) {
            modules[i].afficher();

        }

    }

}
