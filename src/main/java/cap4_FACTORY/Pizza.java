package cap4_FACTORY;

public abstract class Pizza {
	
	private String description;
	private Dough dough;
	private Cheese cheese;
	private Souce souce;
	
	

	public abstract void prepare() ;
	
	public void bake() {
		System.out.println("Baking ... " +  this.description );

	}

	
	public void cut() {
		System.out.println( "Cutting ... "+ this.description );

	}

	
	public void box() {
		System.out.println("Boxing ... "+ this.description);

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		System.out.println(" Setting dough: "+ dough.getDescription());
		this.dough = dough;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		System.out.println(" Setting cheese: "+ cheese.getDescription());
		this.cheese = cheese;
	}

	public Souce getSouce() {
		return souce;
	}

	public void setSouce(Souce souce) {
		System.out.println(" Setting souce: "+ souce.getDescription());
		this.souce = souce;
	}
	
}
