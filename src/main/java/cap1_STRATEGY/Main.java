package cap1_STRATEGY;

public class Main {
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.doFly(mallardDuck.getName());
		OtherDuck otherDuck = new OtherDuck();
		otherDuck.doFly(otherDuck.getName());
		mallardDuck.setFlyduck(new NoFly());
		mallardDuck.doFly(mallardDuck.getName());
		
	}
}
