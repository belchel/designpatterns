package cap5_SINGLETON;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	public static ChocolateBoiler chocBoiler;
	
	private ChocolateBoiler(){
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance(){
		if (chocBoiler == null){
			chocBoiler = new ChocolateBoiler();
		}
		return chocBoiler;
	}
	public void fill(){
		if (isEmpty()){
			empty = false;
			boiled = false;
		}
		
	}
	
	public boolean isEmpty(){
		return this.empty;
	}
	
	public boolean isBoiled(){
		return this.boiled;
	}
	
}
