package osz_kickers;

public class Mannschaftsleiter extends Spieler{
	
	private String rabatt;
	private String mannschaftsName;
	private boolean organisieren;
	public String getRabatt() {
		return rabatt;
	}
	public void setRabatt(String rabatt) {
		this.rabatt = rabatt;
	}
	public String getMannschaftsName() {
		return mannschaftsName;
	}
	public void setMannschaftsName(String mannschaftsName) {
		this.mannschaftsName = mannschaftsName;
	}
	public boolean isOrganisieren() {
		return organisieren;
	}
	public void setOrganisieren(boolean organisieren) {
		this.organisieren = organisieren;
	}
	
	
}
