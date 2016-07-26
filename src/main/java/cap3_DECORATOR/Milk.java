package cap3_DECORATOR;

public class Milk extends CondimentDecorator {
	Beverage beverage;
	
	public Milk(Beverage bev){
		this.beverage = bev;
	}
	
	@Override
	public float cost() {
		return 3f*beverage.getSize().getValor() + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+", Milk";
	}

	@Override
	public Size getSize() {
		return beverage.getSize();
	}

}
