package com.scaler.oops;

public class Cat extends Animal implements Runnable{
	RunningBehaviour rb = new SlowRunningBehaviour();
	
	void makeNoise() {
		System.out.println("Cat Meow");
	}

	@Override
	public void run() {
		rb.run();
	}
}
