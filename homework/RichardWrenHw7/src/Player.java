/**
 * 
 */

/**
 * @author Richy
 *
 */
public class Player {
	
	//variables
	private int id;
	private String playerName;
	private String teamName;
	private String position;
	private Double salary;
	private Double commissionRate;
	
	/**
	 * 
	 */
	public Player() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param playerName
	 * @param teamName
	 * @param position
	 * @param salary
	 * @param commissionRate
	 */
	public Player(int id, String playerName, String teamName, String position, Double salary, Double commissionRate) {
		this.id = id;
		this.playerName = playerName;
		this.teamName = teamName;
		this.position = position;
		this.salary = salary;
		this.commissionRate = commissionRate;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}


	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}


	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}


	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}


	/**
	 * @return the commissionRate
	 */
	public Double getCommissionRate() {
		return commissionRate;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}


	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}


	/**
	 * @param commissionRate the commissionRate to set
	 */
	public void setCommissionRate(Double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	/**
	 * 
	 */
	public double findCommission() {
		return salary * commissionRate;
	}




}
