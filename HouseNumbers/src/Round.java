public class Round {

	private int[] scores;
	private boolean[] set;

	public Round() {
		scores = new int[3];
		set = new boolean[3];
		init();
	}

	public void setOnes(int score) {
		setScore(score,0);
	}

	public void setTens(int score) {
		setScore(score,1);
	}

	public void setHundreds(int score) {
		setScore(score,2);
	}
	
	public void setScore(int score, int digit) {
		if ((digit<0) || (digit > 2)) {
			throw new IllegalArgumentException("Invalid Argument. Valid arguments are 0..2");
		}
		scores[digit] = score;
		set[digit] = true;
	}

	public int getScore() {
		int score = 0;
		for (int i = 2; i >= 0; i--) {
			score += (set[i]) ? scores[i] * (int) Math.pow(100.0, (double) i)
					: 0;
		}
		return score;
	}
	
	public void init() {
		for(int i=0; i<3;i++) {
			scores[i]=0;
			set[i]=false;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i >= 0; i--) {
			sb.append((set[i]) ? String.format("%1d", scores[i]) : " ");
		}
		return sb.toString();
	}
}
