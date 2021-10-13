public class Carte {

	public static String[] valeurs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As"};  //static car appartient à lui-même et non à une instance de ce type
	public static String[] couleurs = {"Pique", "Carreau", "Coeur", "Trèfle"};  
	
	private String couleur;
	private int valeur;
	
	public Carte(String couleur, int valeur) {
		this.couleur = couleur;
		this.valeur = valeur;
	}
	
	public int isSuperior(Carte c2) {
		return (valeur == c2.getValue() ? 0 : (valeur > c2.getValue() ? 1 : -1));  //opérateur conditionnel pour libérer espace
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
