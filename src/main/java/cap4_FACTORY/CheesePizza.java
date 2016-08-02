package cap4_FACTORY;

public class CheesePizza implements Pizza {
	
	private String description;
	
	public CheesePizza() {
		this.setDescription("CheesePizza");
	}
	
	@Override
	public void prepare() {
		System.out.println(this.description + " preparing ... ");
	}

	@Override
	public void bake() {
		System.out.println(this.description + " baking ... ");

	}

	@Override
	public void cut() {
		System.out.println(this.description + " cutting ... ");

	}

	@Override
	public void box() {
		System.out.println(this.description + " boxing ... ");

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
