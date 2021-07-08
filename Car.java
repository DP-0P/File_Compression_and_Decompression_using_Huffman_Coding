package question_three;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Car{
	private static String chasno;
	private static String color;
	private static int maxSpeed;
	Car(String chasno, String color, int maxSpeed) throws InvalidChassisException{
		this.chasno = chasno;
		this.color = color;
		this.maxSpeed = maxSpeed;
		if(chasno.length()<10) {
			throw new InvalidChassisException();
		}
		else display();
		
		Pattern p = Pattern.compile("\\p{Alnum}");
		Matcher m = p.matcher(chasno);
		if(m.find()) {
			display();
		}
		else {
			throw new InvalidChassisException();
		}
	}
	static void display() {
		System.out.println("Car chassis no is: " + chasno);
		System.out.println("Car color is: " + color);
		System.out.println("Car max speed is: " + maxSpeed );
	}
}