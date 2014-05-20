public class Bateau {
	private int maxDeplacement = 1;
	private String nom;
	private int coordXbato;
	private int coordYbato;
	private int nbAvions = 5;

	public Bateau() {
		this.nom = "Inconnu";
		this.coordXbato = -1;
		this.coordYbato = -1;
		this.nbAvions = 5;
	}

	public Bateau(String nom) {
		this.nom = nom;
		this.coordXbato = -1;
		this.coordYbato = -1;
		this.nbAvions = 5;
	}

	public Bateau(String nom, int coordX, int coordY) {
		this.nom = nom;
		this.coordXbato = coordX;
		this.coordYbato = coordY;
		this.nbAvions = 5;
	}

	public Bateau(String nom, int coordX, int coordY, int nbAvions) {
		this.nom = nom;
		this.coordXbato = coordX;
		this.coordYbato = coordY;
		this.nbAvions = nbAvions;
	}

	public void afficheBateau(String nom, int coordX, int coordY) {
		this.coordXbato = coordX;
		this.coordYbato = coordY;
		this.nom = nom;
	}

	public void effaceBateau(String nom, int coordX, int coordY) {
		this.coordXbato = coordX;
		this.coordYbato = coordY;
		this.nom = nom;
	}

	public int getNbAvions() {
		return nbAvions;
	}

	public void setNbAvions(int nbAvions) {
		this.nbAvions = nbAvions;
	}

	public String getNomBato() {
		return nom;
	}

	public int getCoordXbato() {
		return coordXbato;
	}

	public int getCoordYBato() {
		return coordYbato;
	}

	public void setNomBato(String nom) {
		this.nom = nom;
	}

	public void setCoordXBato(int coordX) {
		this.coordXbato = coordX;
	}

	public void setCoordYBato(int coordY) {
		this.coordYbato = coordY;
	}

	public String toString() {
		return "Bateau \n Nom : " + getNomBato() + "\n X=" + getCoordXbato()
				+ "\n Y=" + getCoordYBato() + "\n Nb avions : " + getNbAvions()
				+ "\n";
	}
}
