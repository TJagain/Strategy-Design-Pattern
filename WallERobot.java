
public class WallERobot extends Robot  {
	
	public WallERobot(String name) {
		super(name);
		moveBehavior = new Walk();
		talkBehavior = new SimpleSpeak();
	}
	
	public String toString() {
		return this.name + " is an environmentally friendly Wall-E Robot";
	}
}
