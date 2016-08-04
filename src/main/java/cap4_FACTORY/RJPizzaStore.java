package cap4_FACTORY;

public class RJPizzaStore extends PizzaStore {
	

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		IngredientsFactory ingredients = new RJIngredientsFactory();
		
		if(type == "cheese" ){
			pizza = new CheesePizza(ingredients);
			pizza.setDescription("RJ Cheese Pizza");
			
		}
		return pizza;
	}

}
