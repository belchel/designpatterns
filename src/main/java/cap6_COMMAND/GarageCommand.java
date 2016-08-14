package cap6_COMMAND;

public class GarageCommand implements Command{
	Garage garage;
	
	public GarageCommand(Garage garage){
		this.garage = garage;
	}
	
	@Override
	public void execute() {
		garage.lightOn();
		garage.up();
		garage.stop();
		garage.down();
		garage.lightOff();
		
	}

	public void undo(){
		System.out.println("Undo garage command");
	};
}
