package com.miit.Inheritance;

class Animal
{
	public void eat()
	{
		System.out.println("Animal always like to eat");
	}
}

class Dog extends Animal
{
	public void chew()
	{
		System.out.println("Dog loves to chew");
	}
}
class Cat extends Animal
{
	public void meow()
	{
		System.out.println("cat make noice like meow");
	}
}


public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		Cat c = new Cat();
		
		if(d instanceof Animal)
		{
			d.eat();
			d.chew();
		}
		
		
		
		if(c instanceof Animal)
		{
			c.meow();
			c.eat();
		}
		
		
	}

}
