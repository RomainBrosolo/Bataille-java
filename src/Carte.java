public class Carte {

	public static String[] valeurs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As"};  //static car appartient � lui-m�me et non � une instance de ce type
	public static String[] couleurs = {"Pique", "Carreau", "Coeur", "Tr�fle"};  
	
	private String couleur;
	private int valeur;
	
	public Carte(String couleur, int valeur) {
		this.couleur = couleur;
		this.valeur = valeur;
	}
	
	public int isSuperior(Carte c2) {
		return (valeur == c2.getValue() ? 0 : (valeur > c2.getValue() ? 1 : -1));  //op�rateur conditionnel pour lib�rer espace
	}
	
	public int getValue() {
		return valeur;
	}
	
	public String getColor() { 
		return couleur;
	}
	
	public String toString() {
		return Carte.valeurs[valeur] + " de " + couleur;
	}
}
