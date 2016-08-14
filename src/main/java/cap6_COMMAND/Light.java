package cap6_COMMAND;

public class Light {
	private boolean on;
	
	public boolean isOn() {
		return on;
	}

	public void on() {
		this.on = true;
		System.out.println("Light status: " + on) ;
	}

}
