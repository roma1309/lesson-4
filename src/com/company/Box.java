package com.company;

public class Box {
int width;
int height;
int depth;
public BoxColor color;
public Box() {
}
public Box(int width,int height,int depth,BoxColor color ){
this.width=width;
this.height=height;
this.depth=depth;
this.color=color;}

public int volume() {
    return width*height*depth;
}
public  double flexibeVolume(double drivider) {
    return width * drivider * height * drivider * depth * drivider;
}
public void printVolume(){
    int volume =volume();
    System.out.println(volume);
}
}