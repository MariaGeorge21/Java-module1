package strategy.impl;

import strategy.iface.ISocialMediaStrategy;

public class GooglePlusStrategy implements ISocialMediaStrategy {

	@Override
	public void connectTo(String friendName) {
		// TODO Auto-generated method stub
		 {
			    System.out.println("Connecting with " + friendName + " through GooglePlus");
			  }
	}

}
