package cap4_FACTORY;

public class CrustDough implements Dough {
	private String description ;
	
	public  CrustDough() {
		setDescription("CrustDough");
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
