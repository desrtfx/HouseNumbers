import java.util.Random;

public class Die {

	private int[] sides = { 1, 2, 3, 6, 5, 4 };

	private int lastRoll;
	private Random rnd = new Random();

	public Die() {
		roll();
	}

	public int roll() {
		int numRolls = rnd.nextInt(80) + 20;
		int roll = 0;
		for (int i = 0; i < numRolls; i++) {
			roll = rnd.nextInt(6);
		}
		lastRoll = sides[roll];
		return lastRoll;
	}

	public int flip() {
		lastRoll = sides[(lastRoll + 3) % 6];
		return lastRoll;
	}

	public int getLastRoll() {
		return lastRoll;
	}

	@Override
	public String toString() {
		return String.format("%1d", lastRoll);
	}
}
