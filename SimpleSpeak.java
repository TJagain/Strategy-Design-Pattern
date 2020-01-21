import java.util.Random;

public class SimpleSpeak implements TalkBehavior {
	public String talk() {
		Random r = new Random();
		int randomInt = r.nextInt(5);
		if (randomInt == 0) {
			return "Wall-E";
		}else if(randomInt == 1) {
			return "EVA!";
		}else if(randomInt == 2) {
			return "Pop";
		}else if(randomInt == 3) {
			return "Eva?";
		}else {
			return "Eee-va?";
		}
	}
}
