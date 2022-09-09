package com.scaler.oops;

public class Monkey extends Animal implements Runnable {
	
	RunningBehaviour rb = new FastRunningBehaviour();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		rb.run();
		
	}
	
	

}
