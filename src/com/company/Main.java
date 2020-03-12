package com.company;

public class Main {

    public static void main(String[] args) {
	Box box1=new Box();
	box1.depth=10;
	box1.height=15;
	box1.width=2;
	 box1.color=BoxColor.RED;
		Box box2=new Box( 10, 15,2,BoxColor.BLUE);
	double boxVolume =box1.flexibeVolume( 0.1);
	System.out.println(boxVolume);
	box2.printVolume();
	System.out.println(box1==box2);
		System.out.println(box1.color);
		System.out.println(box2.color);
    }
}
