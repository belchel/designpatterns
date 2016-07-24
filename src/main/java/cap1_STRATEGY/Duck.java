package cap1_STRATEGY;

public abstract class Duck {
	private FlyBehavior flyduck;
	private QuackBehavior quackduck;
	private String name;
	
	public void doQuack(String name){
		quackduck.quack(name);
	}
	
	public void doFly(String name){
		flyduck.fly(name);
	}
	
	public FlyBehavior getFlyduck() {
		return flyduck;
	}

	public void setFlyduck(FlyBehavior flyduck) {
		this.flyduck = flyduck;
	}

	public QuackBehavior getQuackduck() {
		return quackduck;
	}

	public void setQuackduck(QuackBehavior quackduck) {
		this.quackduck = quackduck;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
