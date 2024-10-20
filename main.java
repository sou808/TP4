package teststatic;

public class main {

	 public static void main(String[] args) {
	        
	        JCC jcc2021 = new JCC(2021);
	        
	        Film film1 = new Documentaire("Le dernier refuge", "Ousman", "Mali", 86, "La guerre civile");
	        film1.setNbPlacesRes(30); 
	        
	        Film film2 = new Film("Insurrection", "Jilani Saadi", "Tunisie", 105);
	        film2.setNbPlacesRes(45); 
	        
	        jcc2021.ajoutFilm(film1);
	        jcc2021.ajoutFilm(film2);

	        System.out.println("Films en compétition pour les JCC 2021 :");
	        jcc2021.listeFilmsJCC();
	        
	        int nbEtudFilm1 = 9; 
	        int nbEtudFilm2 = 17; 
	        
	        film1.setNbPlacesRes(nbEtudFilm1 + (30 - nbEtudFilm1)); 
	        film2.setNbPlacesRes(nbEtudFilm2 + (45 - nbEtudFilm2));
	    
	}

}