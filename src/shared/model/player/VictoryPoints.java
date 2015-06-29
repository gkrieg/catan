package shared.model.player;

public class VictoryPoints {
	
	private int totalVictoryPoints;
	private int publicVictoryPoints;
	
	public int getTotalVictoryPoints() {
		return totalVictoryPoints;
	}
	public void addPrivateVictoryPoint() {
		totalVictoryPoints++;
	}
	public int getPublicVictoryPoints() {
		return publicVictoryPoints;
	}
	public void addPublicVictoryPoint() {
		totalVictoryPoints++;
		publicVictoryPoints++;
	}
	public void subtractPublicVictoryPoints(int numToSubtract){
		totalVictoryPoints -= numToSubtract;
		publicVictoryPoints -= numToSubtract;
	}
	
	
	

}
