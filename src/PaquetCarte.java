import java.util.Collections;
import java.util.ArrayList;

public class PaquetCarte {
	
	private ArrayList<Carte> paquet;

	public PaquetCarte() {
		paquet = new ArrayList<Carte>();
		initPaquet();
	}

	private void initPaquet() {
		int i = 0;
		
		while ( i < 52 ) {
			for ( int j = 0; j < Carte.couleurs.length; j++ ) {
				for ( int k = 0; k < Carte.valeurs.length; k++ ) {
					paquet.add(new Carte(Carte.couleurs[j], k));
					i++;
				}
			}
		}
		
		Collections.shuffle(paquet); //mélange au hasard les éléments
	}
	
	
	public int size() {
		return paquet.size();
	}
	
	public Carte getCard(int indexcard) {
		return paquet.get(indexcard);
	}
}