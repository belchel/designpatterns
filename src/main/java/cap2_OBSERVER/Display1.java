package cap2_OBSERVER;
import java.util.Observable;
import java.util.Observer;
public class Display1 implements Observer, DisplayElement{ 
	private int temp;
	private int press;
	private WheaterData wheaterData;
	
	
	
	public Display1( WheaterData wheaterData) {
		this.wheaterData = wheaterData;
		wheaterData.addObserver(this);
	}

	
//	public void update(Wheater w) {
//		temp=w.getTemperature();
//		press=w.getPressure();
//		display();
//	}
//	
	public void display() {
		System.out.println("Current conditions: Temperature = "
				+ temp +" Pressure: "+ press);
	}


	public void update(Observable o, Object arg) {
		if (o instanceof WheaterData){
			wheaterData = (WheaterData) o;
			temp=wheaterData.getData().getTemperature();
			press=wheaterData.getData().getPressure();
			display();
		}
	}


}
