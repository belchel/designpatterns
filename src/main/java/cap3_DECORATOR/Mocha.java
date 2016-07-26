package cap3_DECORATOR;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	public Mocha(Beverage bev){
		this.beverage = bev;
	}
	
	@Override
	public float cost() {
		return 2.5f*beverage.getSize().getValor() + beverage.cost();
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+", Mocha";
	}

	@Override
	public Size getSize() {
		return beverage.getSize();
	}
} 
