package cap4_FACTORY;

public class ParmesanoCheese implements Cheese{
	private String description ;
	
	public  ParmesanoCheese() {
		setDescription("ParmesanoCheese");
	}
	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public void setDescription(String desc) {
		this.description = desc;	
	}
}
