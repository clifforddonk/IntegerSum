package com.Clifford;

public class Multiple {
    public static void generator() {
        int x=0,sum=0;
        while(x<8){
            sum=0;
            sum=x+sum;
            x++;
        }
        System.out.println("Sum of the first 8 integers is" +sum);

    }
}
