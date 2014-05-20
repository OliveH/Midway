public class Avion {
	private int maxDeplacement = 4;
	private int coordXavion;
	private int coordYavion;

	public void afficheAvion(int coordX, int coordY) {
		this.coordXavion = coordX;
		this.coordYavion = coordY;
	}

	public void effaceAvion(int coordX, int coordY) {
		this.coordXavion = coordX;
		this.coordYavion = coordY;
	}

	public int getCoordXAvion() {
		return coordXavion;
	}

	public int getCoordYAvion() {
		return coordYavion;
	}

	public void setCoordXAvion(int coordX) {
		this.coordXavion = coordX;
	}

	public void setCoordYAvion(int coordY) {
		this.coordYavion = coordY;
	}

}
