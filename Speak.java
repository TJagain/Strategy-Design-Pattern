import java.util.Random;

public class Speak implements TalkBehavior{
	public String talk() {
		Random r = new Random();
		int randomInt = r.nextInt(3);
		if (randomInt == 0) {
			return "Hello";
		}else if(randomInt == 1) {
			return "How are you?";
		}else {
			return "Good Day";
		}
	}
}
