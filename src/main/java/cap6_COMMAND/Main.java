package cap6_COMMAND;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		List<Command> list = new ArrayList<>();
		Light li = new Light();
		Garage garage = new Garage();
		list.add(new LightCommand(li));
		list.add(new GarageCommand(garage));
		rc.setCommands(list);
		rc.buttomPressed(0);
		rc.undoPressed();
		rc.buttomPressed(1);
		rc.undoPressed();
	}
}







