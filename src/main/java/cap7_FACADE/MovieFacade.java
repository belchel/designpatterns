package cap7_FACADE;

public class MovieFacade {
	Amplifier amp ;
	DvdPlayer dvd;
	Television tv;
	
	
	public MovieFacade(	Amplifier amp ,	DvdPlayer dvd,	Television tv){
		this.amp = amp;
		this.tv = tv;
		this.dvd = dvd;
	}
	
	public void watchNow(){
		amp.turnOn();
		tv.turnOn();
		dvd.turnOn();
		tv.setTv();
		dvd.play();
	}
	
}
