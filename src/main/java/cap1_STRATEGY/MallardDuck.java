package cap1_STRATEGY;

public class MallardDuck extends Duck {
	public MallardDuck() {
		setFlyduck(new FlyDuck());
		setQuackduck(new QuackDuck());
		setName("Mallard");
	}
}
