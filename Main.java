package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println("Hello I am [Quan Xing]!");

        String moduleCode = "CSC1009";

        switch(moduleCode) {
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1007":
                System.out.println("Operating System");
                break;
            case "CSC1008":
                System.out.println("Data Structures and Algorithms");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;

            default:
                System.out.println("Welcome to Tir-Semester 2");
                break;
        }

        for(int i =102; i >= 66; i--){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }



}
