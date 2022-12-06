package com.miit.Singleton;

public enum SingletonWithEnum {  // enum is special class
	
	INSTANCE;   // here instance is  public static SingletonwithEnum getinstance() {} method in the back end
	int i;
	
	public void show() {
		System.out.println(i);
	}

}
