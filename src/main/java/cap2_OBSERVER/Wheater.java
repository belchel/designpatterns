package cap2_OBSERVER;

public class Wheater {
	
	private int temperature;
	private int humidity;
	private int pressure;
	
	
	public Wheater(int t, int h, int p) {
		temperature = t;
		humidity = h;
		pressure = p;
	}
	

	
	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
}