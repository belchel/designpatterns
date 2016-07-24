package cap2_OBSERVER;
import java.util.Observer;
import java.util.Observable;
public class Display3 implements Observer, DisplayElement {
	private int total;
	private WheaterData wheaterData;
	
	public Display3( WheaterData wheaterData) {
		this.wheaterData = wheaterData;
		wheaterData.addObserver(this);
	}

//	
//	public void update(Wheater w) {
//		total=w.getTemperature()+ w.getPressure() +w.getHumidity();
//		display();
//	}
	
	public void display() {
		System.out.println("Total  = "
				+ total);
	}



	public void update(Observable o, Object arg) {
		if (o instanceof WheaterData){
			wheaterData = (WheaterData) o;
			Wheater w = wheaterData.getData();
			total=w.getTemperature()+ w.getPressure() +w.getHumidity();
			display();
		}
	}

}
