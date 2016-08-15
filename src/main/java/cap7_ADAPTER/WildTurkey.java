package cap7_ADAPTER;

public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("Gobbling as a turkey");		
	}

	@Override
	public void fly() {
		System.out.println("Flying as a turkey");		
	}

}
