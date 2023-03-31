package observer.consumers;

import observer.iface.WeatherObserver;

public class TVChannel implements WeatherObserver {

	@Override
	public void doUpdate(int temperature) {
		System.out.println("TV channel are updating temperature as" +temperature);
		
	}
}