
public class Player {

	private Die die;
	private String name;
	private int score;
	private Round round;
	
	public Player() {
		this("Default");
	}
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
		this.round = new Round();
		this.die = new Die();
	}
	
	
}
