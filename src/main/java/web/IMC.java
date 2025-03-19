package web;

public class IMC {
	private double poids;
	private double taille;
	
	public IMC(double poids, double taille){
		this.poids = poids;
		this.taille = taille;
	}
	
	public double calcul() {
		return poids / (taille * taille);
	}
	
	public double getPoids() {
		return poids;
	}
	
	public double getTaille() {
		return taille;
	}

}
