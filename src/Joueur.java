import java.util.ArrayList;

public class Joueur {

	private ArrayList<Carte> cartes = new ArrayList<Carte>();
	private String nom;
	private int points;

	public Joueur(String nom) {
		setPoints(0);
		this.nom = nom;
	}
	
	public void takeCard(Carte carte) {
		cartes.add(carte);
	}
	
	public Carte getCards(int index) {
		return cartes.get(index);
	}

	public int getPoints() {
		return points;
	}
	
	public String getName() {
		return nom;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
}
