package handGame;

public class RockPaperScissors {

	
	final public static RockPaperScissors ROCK = new RockPaperScissors(0);
	final public static RockPaperScissors PAPER = new RockPaperScissors(1);
	final public static RockPaperScissors SCISSORS = new RockPaperScissors(2);
	
	int value;

	public RockPaperScissors(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	
}
