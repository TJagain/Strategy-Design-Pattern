
public class DogRobot extends Robot {
	
	public DogRobot(String name) {
		super(name);
		moveBehavior = new Crawl();
		talkBehavior = new Bark();
	}
	
	public String toString() {
		return this.name + " is a happy dog robot";
	}
}
