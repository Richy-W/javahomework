/**
 * 
 */

/**
 * @author Richy
 *
 */
public class BasketballPlayer extends Player {

	private int shotsMade;
	private int shotsAttempt;
	
	

	public BasketballPlayer() {
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
	 * @param shotsMade
	 * @param shotsAttempt
	 */
	public BasketballPlayer(int id, String playerName, String teamName, String position, Double salary,
			Double commissionRate, int shotsMade, int shotAttempt) {
		super(id, playerName, teamName, position, salary, commissionRate);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the shotsMade
	 */
	public int getShotsMade() {
		return shotsMade;
	}
	/**
	 * @return the shotsAttempt
	 */
	public int getShotsAttempt() {
		return shotsAttempt;
	}
	/**
	 * @param shotsMade the shotsMade to set
	 */
	public void setShotsMade(int shotsMade) {
		this.shotsMade = shotsMade;
	}
	/**
	 * @param shotsAttempt the shotsAttempt to set
	 */
	public void setShotsAttempt(int shotsAttempt) {
		this.shotsAttempt = shotsAttempt;
	}
	
	public double findStats () {
	return (double) shotsMade / shotsAttempt;
	}
	
	public boolean findStatus (){
		if (findStats() > .32) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
