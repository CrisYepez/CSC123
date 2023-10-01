package assignment_2;
import java.util.Random;
public class DiceClass {
	private int number;
	private Random random;
	
	public DiceClass() {
		random = new Random();
		cast();
	}
	public void cast() {
		number=random.nextInt(6) + 1;
	}
	@Override
	public String toString() {
		return "The number is: " + number;
	}
}
