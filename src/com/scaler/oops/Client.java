package com.scaler.oops;
/**
* This class is behaving as a client 
**/
public class Client {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		a.age=19;
		
		Dog d= new Dog();
		System.out.println(d.age);
		//d=a;
		d.bark();
		d.age=20;
		System.out.println(d.age);
		Husky h=new Husky();
		h.bark();
		h.run();
		
		Monkey m = new Monkey();
		m.run();
		
		Cat c = new Cat();
		c.run();
	    
	}

}
