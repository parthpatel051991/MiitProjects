package com.miit.practice;

class Alien {

	public void build(Laptop obj)
	{
		obj.code();
	}

	public void build(Computer obj)
	{
		obj.code();
		obj.compute();
		obj.playVideo();
	}
}
