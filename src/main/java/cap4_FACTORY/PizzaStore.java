package cap4_FACTORY;

public abstract class PizzaStore {
//	private PizzaFactory factory ;
//	
//	
//	public PizzaStore(PizzaFactory factory){
//		this.factory= factory;
//	}
	private String locale;
	
	public void orderPizza(String type){
		Pizza pizza;
//		 pizza = this.factory.createPizza(type);
		pizza=createPizza(type);
		pizza.bake();
		pizza.cut();
		pizza.cut();
		pizza.box();
		
	}
	
	public abstract Pizza createPizza(String type);

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}
	
}
