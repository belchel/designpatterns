package cap4_FACTORY;

public abstract class PizzaStore {

	private String locale;
	
	public void orderPizza(String type){
		Pizza pizza;
		pizza=createPizza(type);
		pizza.prepare();
		pizza.bake();
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
