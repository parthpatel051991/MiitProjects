package com.miit.enums;


enum Results {
	PASS, FAIL, NR;

	//public final static Results PASS = new Results();
	
	int marks;

	Results() {
		System.out.println("constructor is getting called");
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

}

public class Enums1 {

	enum Week {
		MON, TUE, WED, THU, FRI, SAT, SUN;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Results.PASS.setMarks(90);

		int marks = Results.PASS.getMarks();

		System.out.println(marks);

		Week m = Week.MON;

		System.out.println(m);

		Week[] w = Week.FRI.values();

		for (Week wk : w) {
			System.out.println(wk + " " + wk.ordinal());
		}

	}

}
