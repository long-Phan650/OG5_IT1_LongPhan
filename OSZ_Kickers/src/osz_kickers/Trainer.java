package osz_kickers;

public class Trainer extends Personen {
	private char lizensklasse;
	public char getLizensklasse() {
		return lizensklasse;
	}
	public void setLizensklasse(char lizensklasse) {
		this.lizensklasse = lizensklasse;
	}
	public boolean isJahresbeitragBezahlt() {
		return jahresbeitragBezahlt;
	}
	public void setJahresbeitragBezahlt(boolean jahresbeitragBezahlt) {
		this.jahresbeitragBezahlt = jahresbeitragBezahlt;
	}
	private boolean jahresbeitragBezahlt;
	
}
