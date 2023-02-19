public class App {
    public static void main(String[] args) {
        /* Creation d'un Niveau 2CPI */
        Niveau Deux_CPI = new Niveau("2CPI");
        /* Creation d'un module POO */
        Module POO = new Module("POO", 1);
        Deux_CPI.AddModule(POO);
        /* Creation d'un module ANA4 */
        Module ANA4 = new Module("ANA4", 2);
        Deux_CPI.AddModule(ANA4);
        /* Creation d'un groupe d'etudiants */
        Etudiant e1 = new Etudiant("chouider", "ikram", "20217", "groupe6_2CPI", Deux_CPI);
        Etudiant e2 = new Etudiant("chouder", "ikram", "20218", "groupe6_2CPI", Deux_CPI);
        Etudiant e3 = new Etudiant("choider", "ikram", "20219", "groupe6_2CPI", Deux_CPI);
        Etudiant e4 = new Etudiant("kouider", "ikram", "20220", "groupe6_2CPI", Deux_CPI);
        Etudiant e5 = new Etudiant("chouidet", "ikram", "20221", "groupe6_2CPI", Deux_CPI);
        Etudiant[] g1 = { e1, e2, e3, e4, e5 };
        // e1.afficher();
        Groupe groupe_un = new Groupe("2CPI_Groupe1", g1);
        /* Ajout d'un groupe a le module POO et le module ANA4 */
        POO.setgroupe(groupe_un);
        // groupe_un.Afficher();
        // POO.afficher();
        ANA4.setgroupe(groupe_un);
        // ANA4.afficher();
        /* Creation de deux seances TPTD1 TPTD2 pour le module POO */
        Seance TPTD1 = new Seance("14/02/2023", POO, g1);
        // TPTD1.afficher();
        Seance TPTD2 = new Seance("15/02/2023", POO, g1);
        Etudiant[] AbsTPTD1 = { e1, e2, e3 };
        Etudiant[] AbsTPTD2 = { e1, e3 };
        TPTD1.setAbsence(AbsTPTD1);
        TPTD2.setAbsence(AbsTPTD2);
        // TPTD1.afficher();
        // POO.afficher();
        /* Creation de deux seances TD1 TD2 pour le module ANA4 */
        Seance TD1 = new Seance("14/02/2023", ANA4, g1);
        Seance TD2 = new Seance("15/02/2023", ANA4, g1);
        Etudiant[] AbsTD1 = { e4, e5, e3 };
        Etudiant[] AbsTD2 = { e4, e2 };
        TD1.setAbsence(AbsTD1);
        TD2.setAbsence(AbsTD2);
        // TD1.afficher();
        // TD2.afficher();
        // ANA4.afficher();
        /* Creation du service assiduite */
        ServiceAssiduite serviceESI = new ServiceAssiduite();
        serviceESI.AddSeance(TD2);
        serviceESI.AddSeance(TD1);
        serviceESI.AddSeance(TPTD1);
        serviceESI.AddSeance(TPTD2);
        // Deux_CPI.Afficher();
        // serviceESI.Afficher(POO);
        // serviceESI.Afficher();
        // serviceESI.Afficher(e3);

    }

}
