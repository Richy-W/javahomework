/**
 * @author Richy
 *
 */
public class BaseballPlayer extends Player {

	//private variables
	private int numHits;
	private int atBat;
	
	/**
	 * 
	 */
	public BaseballPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id
	 * @param playerName
	 * @param teamName
	 * @param position
	 * @param salary
	 * @param commissionRate
	 * @param numHits
	 * @param atBat
	 */
	public BaseballPlayer(int id, String playerName, String teamName, String position, Double salary,
			Double commissionRate, int numHits, int atBat) {
		super(id, playerName, teamName, position, salary, commissionRate);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the numHits
	 */
	public int getNumHits() {
		return numHits;
	}
	/**
	 * @return the atBat
	 */
	public int getAtBat() {
		return atBat;
	}
	/**
	 * @param numHits the numHits to set
	 */
	public void setNumHits(int numHits) {
		this.numHits = numHits;
	}
	/**
	 * @param atBat the atBat to set
	 */
	public void setAtBat(int atBat) {
		this.atBat = atBat;
	}
	
	public double findStats () {
		return (double) numHits / atBat;
	}
	
	public boolean findStatus () {
		if (findStats() >.25) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
