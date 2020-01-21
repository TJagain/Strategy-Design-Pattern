
public class iRobot extends Robot  {
	
	public iRobot(String name) {
		super(name);
		moveBehavior = new Run();
		talkBehavior = new Speak();
	}
	
	public String toString() {
		return this.name + " is a scary iRobot!!!";
	}
}
