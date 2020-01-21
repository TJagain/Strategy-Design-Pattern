
public class Robot {
	protected String name;
	MoveBehavior moveBehavior;
	TalkBehavior talkBehavior;
	
	public Robot(String givenName) {
		name = givenName;
	}
	public String move() {
		return moveBehavior.move();
	}
	
	public String talk() {
		return talkBehavior.talk();
	}
	
	public void setMoveBehavior(MoveBehavior behavior) {
		moveBehavior = behavior;
	}
	
	public void setTalkBehavior(TalkBehavior behavior) {
		talkBehavior = behavior;
	}
}
