package teststatic;

public class JCC {

    private Film[] competition;
    private int annee;
    private static final int NMAX = 30;
    private int nbF;

    public JCC(int annee) {
        this.annee = annee;
        this.competition = new Film[NMAX];  
        this.nbF = 0;
    }

    public void ajoutFilm(Film f) {
        if (f == null) {
            System.out.println("Film invalide");
            return;
        }
        if (nbF < NMAX) {
            competition[nbF] = f;
            nbF++;
        } else {
            System.out.println("La compétition est au complet");
        }
    }

    public void listeFilmsJCC() {
        for (int i = 0; i < nbF; i++) {
            System.out.println(competition[i])
        }
    }

    public float totalVenteBilletsJCC(int[] PEtud) {
        if (PEtud.length != nbF) {
            System.out.println("Erreur : le nombre d'entrées des étudiants ne correspond pas au nombre de films.");
            return 0;
        }

        float total = 0;
        for (int i = 0; i < nbF; i++) {
            total += competition[i].total
