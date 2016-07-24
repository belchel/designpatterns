package cap2_OBSERVER;

public class Main {
	public static void main(String[] args) {
		
		WheaterData wd = new WheaterData();
		new Display1(wd);
		new Display2(wd);
		new Display3(wd);
		wd.setMeasures(new Wheater(1,2,3));
		wd.setMeasures(new Wheater(2,5,3));
		wd.setMeasures(new Wheater(4,2,3));
		wd.setMeasures(new Wheater(6,-2,7));
		wd.setMeasures(new Wheater(5,0,-3));
	}
}
