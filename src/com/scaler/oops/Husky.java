package com.scaler.oops;

public class Husky extends Dog implements Runnable {

	RunningBehaviour rb = new FastRunningBehaviour();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		rb.run();
	}

}
