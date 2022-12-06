package com.miit.enums;

enum Gender {
	MALE, FEMALE, OTHERS;
}

public class Enum2 {
	public static void main(String[] args) {

		
		Gender g = Gender.FEMALE;
		System.out.println(g);

		Gender[] gr = Gender.MALE.values();

		for (Gender gg : gr) {
			System.out.println(gg + " " + gg.ordinal());
		}

	}
}
