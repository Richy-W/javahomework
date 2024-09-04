/**
 * 
 */

/**
 * @author Richy
 *
 */
public class AppRunner {

	/**
	 * 
	 */
	public AppRunner() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasketballPlayer jordan1 = new BasketballPlayer(0, null,null, null, null, null, 0, 0);
		BasketballPlayer pippen = new BasketballPlayer(0, null, null, null, null, null, 0, 0);
		BaseballPlayer jordan2 = new BaseballPlayer(0, null, null, null, null, null, 0, 0);
		BaseballPlayer sosa = new BaseballPlayer(0, null, null, null, null, null, 0, 0);
		
		//basketball players
		jordan1.setId(23);
		jordan1.setPlayerName("Michael Jordan");
		jordan1.setTeamName("Chicago Bulls");
		jordan1.setPosition("Shooting Guard");
		jordan1.setSalary(33100000.00);
		jordan1.setCommissionRate(0.05);
		jordan1.setShotsAttempt(1100);
		jordan1.setShotsMade(547);
		
		pippen.setId(33);
		pippen.setPlayerName("Scottie Pippen");
		pippen.setTeamName("Chicago Bulls");
		pippen.setPosition("Small Forward");
		pippen.setSalary(18000000.00);
		pippen.setCommissionRate(0.03);
		pippen.setShotsAttempt(1000);
		pippen.setShotsMade(300);
		
		//baseball players
		
		jordan2.setId(45);
		jordan2.setPlayerName("Michael Jordan");
		jordan2.setTeamName("White Socks");
		jordan2.setPosition("Outfuilder");
		jordan2.setSalary(3000000.00);
		jordan2.setCommissionRate(0.02);
		jordan2.setAtBat(495);
		jordan2.setNumHits(114);
		
		sosa.setId(21);
		sosa.setPlayerName("Sammy Sosa");
		sosa.setTeamName("Texas Rangers");
		sosa.setPosition("Outfuilder");
		sosa.setSalary(17875000.00);
		sosa.setCommissionRate(0.04);
		sosa.setAtBat(8820);
		sosa.setNumHits(2408);
		
		//basketball players
		System.out.println("|----Player Stats----|");
		System.out.printf("Player ID: %d%n", jordan1.getId());
		System.out.printf("Player Name: %s%n", jordan1.getPlayerName());
		System.out.printf("Team: %s%n", jordan1.getTeamName());
		System.out.printf("Salary: %.2f%n", jordan1.getSalary());
		System.out.printf("Commission Rate: %.2f%n", jordan1.getCommissionRate());
		System.out.printf("Commission: %.2f%n", jordan1.findCommission());
		System.out.printf("Shots Attempted: %d%n", jordan1.getShotsAttempt());
		System.out.printf("Shots Made: %d%n", jordan1.getShotsMade());
		System.out.printf("Statistics: %.3f%n" , jordan1.findStats());
		System.out.printf("Status: %b%n", jordan1.findStatus());
		System.out.println(" ");
		
		System.out.println("|----Player Stats----|");
		System.out.printf("Player ID: %d%n", pippen.getId());
		System.out.printf("Player Name: %s%n", pippen.getPlayerName());
		System.out.printf("Team: %s%n", pippen.getTeamName());
		System.out.printf("Salary: %.2f%n", pippen.getSalary());
		System.out.printf("Commission Rate: %.2f%n", pippen.getCommissionRate());
		System.out.printf("Commission: %,2f%n", pippen.findCommission());
		System.out.printf("Shots Attempted: %d%n", pippen.getShotsAttempt());
		System.out.printf("Shots Made: %d%n", pippen.getShotsMade());
		System.out.printf("Statistics: %.3f%n", pippen.findStats());
		System.out.printf("Status: %b%n", pippen.findStatus());
		System.out.println(" ");

		//baseball players
		
		System.out.println("|----Player Stats----|");
		System.out.printf("Player ID: %d%n", jordan2.getId());
		System.out.printf("Player Name: %s%n", jordan2.getPlayerName());
		System.out.printf("Team: %s%n", jordan2.getTeamName());
		System.out.printf("Salary: %.2f%n", jordan2.getSalary());
		System.out.printf("Commission Rate: %.2f%n", jordan2.getCommissionRate());
		System.out.printf("Commission: %.2f%n", jordan2.findCommission());
		System.out.printf("Shots Attempted: %d%n", jordan2.getAtBat());
		System.out.printf("Shots Made: %d%n", jordan2.getNumHits());
		System.out.printf("Statistics: %.3f%n", jordan2.findStats());
		System.out.printf("Status: %b%n", jordan2.findStatus());
		System.out.println(" ");
		
		System.out.println("|----Player Stats----|");
		System.out.printf("Player ID: %d%n", sosa.getId());
		System.out.printf("Player Name: %s%n", sosa.getPlayerName());
		System.out.printf("Team: %s%n", sosa.getTeamName());
		System.out.printf("Salary: %.2f%n", sosa.getSalary());
		System.out.printf("Commission Rate: %.2f%n", sosa.getCommissionRate());
		System.out.printf("Commission: %.2f%n" , sosa.findCommission());
		System.out.printf("Shots Attempted: %d%n", sosa.getAtBat());
		System.out.printf("Shots Made: %d%n", sosa.getNumHits());
		System.out.printf("Statistics: %.3f%n", sosa.findStats());
		System.out.printf("Status: %b%n", sosa.findStatus());
		System.out.println(" ");
	}

}
