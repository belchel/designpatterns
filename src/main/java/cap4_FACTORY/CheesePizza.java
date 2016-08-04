package cap4_FACTORY;

public class CheesePizza extends Pizza {
	IngredientsFactory ingredients;
	
	
	
	public CheesePizza(IngredientsFactory ingredients) {
		this.ingredients=ingredients;
		this.setDescription("CheesePizza");
	}
	

	@Override
	public void prepare() {
		System.out.println("Preparing ... "+ getDescription());
		setCheese(ingredients.createCheese());
		setDough(ingredients.createDough());
		setSouce(ingredients.createSouce());
	}

}
