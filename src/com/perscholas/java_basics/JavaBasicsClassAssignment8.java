package com.perscholas.java_basics;

public class JavaBasicsClassAssignment8 {
    public static void main(String[] args) {


        String Product1 = "Coffee";
        double Price1 = 5.5;
        String Product2 = "Tea";
        double Price2 = 9.5;
        String Product3 = "cappuccino";
        double Price3 = 7.5;

        double subTotal;
        double totalSale;
        int salesTax=10;
        subTotal = 3* Price1+ 4*Price2+2*Price3;
        totalSale= subTotal+ salesTax;
        System.out.println("Total Sale amount is  " +totalSale);

    }
}