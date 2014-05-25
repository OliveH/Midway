public class InitJeu {

	public static void initialize() {
		IGPA igpa = new IGPA(8, 8);
		igpa.declarerImage(0, "eau.png");
		igpa.declarerImage(1, "sable.png");
		igpa.declarerImage(10, "are.png");// avion sur la mer
		igpa.declarerImage(11, "art.png");// avion sur la terre
		igpa.declarerImage(12, "asre.png");// plusieurs avions sur la mer
		igpa.declarerImage(13, "asrt.png");// plusieurs avions sur la terre
		igpa.declarerImage(20, "porte-avion-eau.png");
		igpa.declarerImage(21, "porte-avion-avion-eau.png");// porta-avion + 1
															// avion
		igpa.declarerImage(22, "porte-avion-avions-eau.png");// porta-avion + x
																// avions

		int[][] init = { { 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 0, 0, 1, 1 },
				{ 0, 0, 0, 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 1 } };
		igpa.definirTerrain(init);
		igpa.creerFenetre();
		int nbPorteAvion = -1;
		int coordX = -1;
		int coordY = -1;
		String nomBato = "";
		int nbAvions = -1;
		Avion[] tabAvions = new Avion[4];// tableau d'avions pour un bateau

		while (nbPorteAvion <= 0 || nbPorteAvion > 4) {
			try {
				System.out.println("Combien de porte-avions (entre 1 et 4) ?");
				nbPorteAvion = Terminal.lireInt();
			} catch (TerminalException e) {
				System.out.println("Entrez un nombre svp !!\n");
			}
		}

		Bateau[] tabPorteAvions = new Bateau[nbPorteAvion]; // tableau de
															// bateaux
		int[] tabAvionsPorteAvion = new int[nbPorteAvion]; // tableau de nombre
															// d'avions par
															// bateau

		for (int i = 1; i <= nbPorteAvion; i++) {
			System.out.println("Porte-avions numéro " + i);

			do {
				System.out.println("Nom du bateau ?");
				nomBato = Terminal.lireString();
			} while (nomBato.equals(""));

			do {
				try {
					System.out.println("Coordonnée en X :");
					coordX = Terminal.lireInt();
				} catch (TerminalException e) {
					System.out.println("Entrez un nombre svp !!\n");
				}
			} while (coordX < 0 || coordX > init.length);

			do {
				try {
					System.out.println("Coordonnée en Y :");
					coordY = Terminal.lireInt();
				} catch (TerminalException e) {
					System.out.println("Entrez un nombre svp !!\n");
				}
			} while (coordY < 0 || coordY > init.length);

			if (init[coordX][coordY] == 1) {
				System.out
						.println("Un bateau sur la terre ? Bateau non pris en compte !!");
				igpa.modifierCase(coordX, coordY, 1);
			} else {
				igpa.modifierCase(coordX, coordY, 20);
				do {
					try {
						System.out
								.println("Nombre d'avions sur le porte-avions numéro "
										+ i + " ? (entre 0 et 5)");
						nbAvions = Terminal.lireInt();
					} catch (TerminalException e) {
						System.out.println("Entrez un nombre svp !!\n");
					}
				} while (nbAvions < 0 || nbAvions > 5);
				tabAvionsPorteAvion[i - 1] = nbAvions;// init chaque
														// porte-avions avec 5
														// avions
				Bateau bateau = new Bateau(nomBato, coordX, coordY, nbAvions);
				tabPorteAvions[i - 1] = bateau;
				for (int j = 0; j < nbAvions; j++) {
					// a voir
				}
				// System.out.println(bateau); // Verification contenu d'un
				// bateau
			}

			coordX = -1;
			coordY = -1;
		}
		igpa.reafficher();
	}
}
