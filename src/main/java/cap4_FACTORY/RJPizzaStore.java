package cap4_FACTORY;

public class RJPizzaStore extends PizzaStore {
	

	@Override
	public Pizza createPizza(String type) {
		if(type == "cheese" ){
			return new CheesePizza();
		}else
			return null;
	}

}
