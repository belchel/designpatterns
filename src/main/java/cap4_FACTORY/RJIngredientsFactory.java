package cap4_FACTORY;

public class RJIngredientsFactory implements IngredientsFactory{

	@Override
	public Dough createDough() {
		return new CrustDough();
	}

	@Override
	public Cheese createCheese() {
		return new ParmesanoCheese();
	}

	@Override
	public Souce createSouce() {
		return new MarinaraSouce();
	}

}
