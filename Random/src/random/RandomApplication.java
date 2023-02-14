package random;
import java.util.Random;

public class RandomApplication {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int integerValue = random.nextInt(6)+ 1;
		double doubleValue = random.nextDouble(30);
		boolean booleanValue = random.nextBoolean();
		
		System.out.println(integerValue + "\n" + doubleValue + "\n" + booleanValue);

	}

}
