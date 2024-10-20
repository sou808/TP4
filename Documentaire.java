package teststatic;

public class Documentaire {
    private String sujet;
    private static final float tarif = 2 ;

    public Documentaire(String titre, String realisateur, String pays, int duree, String sujet) {
        super();
        this.sujet = sujet;
    }

   
    public String toString() {
        return super.toString() + " Sujet: " + sujet;
    }


    public float totalVenteBillets(int placesEtudiants) {
        return tarif * getNbrePlacesRes();
    }


}

