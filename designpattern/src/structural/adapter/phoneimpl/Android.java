package structural.adapter.phoneimpl;

import structural.adapter.phoneiface.MicroUsbPhone;

public class Android implements MicroUsbPhone {
	private boolean connector;

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		if(connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
		}
		else {
			System.out.println("connect microusb");
		}
		

	}

	@Override
	public void useMicroUsb() {
		// TODO Auto-generated method stub
		connector=true;
		System.out.println("Microusb connected");
	}

}
