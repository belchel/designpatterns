package cap7_ADAPTER;

public class Main {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		duck.quack();
		duck.fly();
		WildTurkey turkey = new WildTurkey();
		Duck adapter = new TurkeyAdapter(turkey);
		duckBehavior(adapter);
	}

	
	public static void duckBehavior(Duck duck){
		duck.quack();
		duck.fly();
	}
}
