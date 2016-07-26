package cap3_DECORATOR;


public class Espresso extends Beverage {
	
	public Espresso(Size size){
		setSize(size);
		setDescription("Espresso");
	}
	
	@Override
	public float cost() {
		return 3.4f;
	}
	
}
