public class Main {

	public static void main(String[] args) {
		
		PaquetCarte paquet = new PaquetCarte();
		Joueur j1 = new Joueur("Pablo");
		Joueur j2 = new Joueur("Juan");
		
		System.out.println( "Début de la partie...\n");	
		for ( int i = 0; i < paquet.size(); i += 2 ) {
			j1.takeCard(paquet.getCard(i));
			j2.takeCard(paquet.getCard(i + 1));
		}
		
		for ( int i = 0; i < ( paquet.size() / 2 ); i++ ) {
			int compteur = i+1;
			System.out.println( "Manche "+ compteur +"...\n");
			System.out.println( j1.getName() + " pose " + j1.getCards(i).toString() );
			System.out.println( j2.getName() + " pose " + j2.getCards(i).toString() +"\n" );
			
			if ( j1.getCards(i).isSuperior(j2.getCards(i)) == 1 ) {
				j1.setPoints((j1.getPoints() + 1));
				System.out.println(j1.getName() + " gagne la manche !");
			}
			else if ( j1.getCards(i).isSuperior(j2.getCards(i)) == -1 ) {
				j2.setPoints((j2.getPoints() + 1));
				System.out.println(j2.getName() + " gagne la manche !");
			}
			else {
				System.out.println("Match nul");
			}
			
			System.out.println("Points = " + j1.getName() + " : " + j1.getPoints() + " | " + j2.getName() + " : " + j2.getPoints() +"\n" );
			
			
			if ( i == (paquet.size() / 2 - 1) ) {
				System.out.println("Fin de la partie...");
				if ( j1.getPoints() > j2.getPoints() )
					System.out.println("Résultat : " + j1.getName() + " a gagné la partie !");
				else if ( j1.getPoints() < j2.getPoints() )
					System.out.println("Résultat : " + j2.getName() + " a gagné la partie !");
				else
					System.out.println("Match nul !");
			}

		}
	}

}