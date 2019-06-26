package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Book b= new Book(" Queen Temi", "Temi is cool", 25.99, "Makeup", "389584939");
        b.setIsbn("kdkdkkv");
        //print summary
        String message= b.summary();
        System.out.println(message);
        //System.out.println(b.pricePlusShipping());
        System.out.println(b.priceSummary("The book will cost you"));
    }
}
