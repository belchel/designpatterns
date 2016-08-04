package cap4_FACTORY;

public class MarinaraSouce implements Souce {
	private String description ;
	
	public  MarinaraSouce() {
		setDescription("MarinaraSouce");
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
