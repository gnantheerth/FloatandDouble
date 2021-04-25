package com.company;

public class Main {

    public static void main(String[] args) {
	double myMinFloatValue= Float.MIN_VALUE;
	float myMaxFloatValue= Float.MAX_VALUE;
        System.out.println("Float minimum value=" + myMinFloatValue);
        System.out.println("Float maximum value="+ myMaxFloatValue);
        double myMinDoubleValue= Double.MIN_VALUE;
        double myMaxDoubleValue= Double.MAX_VALUE;
        System.out.println("Double minimum value=" + myMinDoubleValue);
        System.out.println("Double maximum value="+ myMaxDoubleValue);

        int myIntvalue= 5/3;
        float myFloatvalue= (float) 5/3;
        double myDoublevalue = 5/3d;
        System.out.println(myIntvalue);
        System.out.println(myFloatvalue);
        System.out.println(myDoublevalue);


    }
}
