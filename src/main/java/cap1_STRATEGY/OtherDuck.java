package cap1_STRATEGY;

public class OtherDuck extends Duck {
	public OtherDuck() {
		setFlyduck(new NoFly());
		setQuackduck(new QuackDuck());
		setName("Other");
	}
}
