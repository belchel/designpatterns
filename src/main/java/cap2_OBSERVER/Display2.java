package cap2_OBSERVER;

import java.util.Observer;
import java.util.Observable;

public class Display2 implements Observer, DisplayElement {
	private int humid;
	private WheaterData wheaterData;

	public Display2(WheaterData wheaterData) {
		this.wheaterData = wheaterData;
		wheaterData.addObserver(this);
	}
//
//	public void update(Wheater w) {
//		humid = w.getHumidity();
//		display();
//	}

	public void display() {
		System.out.println("Current humidity: " + humid);
	}

	public void update(Observable o, Object arg) {
		if (o instanceof WheaterData){
			wheaterData = (WheaterData) o;
			humid = wheaterData.getData().getHumidity();
			display();
		}
	}

}
