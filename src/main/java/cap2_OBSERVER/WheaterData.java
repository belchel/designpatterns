package cap2_OBSERVER;

import java.util.Observable;

public class WheaterData extends Observable{
//implements Subject{
	
	private Wheater data ;
	
//	public List<Observer> observers;
	
	public WheaterData (){
//		observers = new ArrayList<Observer>();
	}
	
//	public void registerObserver(Observer o) {
//		observers.add(o);		
//	}

//	public void removeObserver(Observer o) {
//		observers.remove(o);		
//	}

//	public void notifyObservers() {
//		for(Observer o:observers){
//			o.update(data);
//		}
//		
//	}
	
	public  void measureChanged(){
		setChanged();
		notifyObservers();
	}

	public void setMeasures(Wheater w){
		setData(w);
		measureChanged();
	}

	public Wheater getData() {
		return data;
	}

	public void setData(Wheater data) {
		this.data = data;
	}

}
