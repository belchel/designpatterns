package cap3_DECORATOR;

public abstract class Beverage {
	private String description;
	
	private Size size;
	
	public abstract float cost();
	
	public  String getDescription() {
		return description;
	}
	
	public Size getSize(){
		return this.size;
	}
	
	public void setSize(Size size){
		this.size = size;
	}
	
	public void setDescription(String desc){
		this.description = desc;
	}

	
}
