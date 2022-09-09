package com.scaler.oops;

public class Horse extends Animal implements Runnable {
 
	RunningBehaviour rb = new FastRunningBehaviour();
	private String tailColor;
	
	public void run() {
		rb.run();
	}

	
}
