package com.company;

public class Main {

    public static void main(String[] args) {
            int firstArray[][]={{8,9,10},{12,13,15}};
            int secondArray[][]={{30,31,33},{43},{4,5,6}};

        System.out.println("first array");
        display(firstArray);

        System.out.println("second array");
        display(secondArray);
    }
    public static void display(int x[][]){
        for(int row = 0; row<x.length; row++){
            for(int column = 0; column<x[row].length;column++){
                System.out.println(x[row][column]+"\t");
            }
            System.out.println();
        }
    }
}
