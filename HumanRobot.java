
public class HumanRobot extends Robot  {
	
	public HumanRobot(String name) {
		super(name);
		moveBehavior = new Walk();
		talkBehavior = new Speak();
	}
	
	public String toString() {
		return this.name + " is a typical human robot";
	}
}
