package cap6_COMMAND;

public class LightCommand implements Command{
	Light light;
	
	public LightCommand (Light li){
		this.light=li;
	}
	
	public void execute(){
		light.on();
	}
	
	public void undo(){
		System.out.println("Undo light command");
	};
}
