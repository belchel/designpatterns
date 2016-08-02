package cap4_FACTORY;

public class PizzaFactory {

	public Pizza createPizza(String type) {
		if(type == "cheese" ){
			return new CheesePizza();
		}else
			return null;
	}

}
