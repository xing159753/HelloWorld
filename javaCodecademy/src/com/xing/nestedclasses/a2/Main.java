package com.xing.nestedclasses.a2;

 class VendingMachine {
     public static String name = "#1 Vending Machine!";

     public static class ChocolateBar {
         public String getName() {
             return "Cadbury";
         }

         public double getPrice() {
             return 3.95;
         }
     }

     public static class BagOfChips {
         public String getName() {
             return "Doritos";
         }

         public double getPrices() {
             return 5.99;
         }
     }
 }

public class Main {
    public static void main(String[] args) {

        VendingMachine.ChocolateBar mikesChocolateBar = new VendingMachine.ChocolateBar();
        VendingMachine.BagOfChips gabbyBagOfChips = new VendingMachine.BagOfChips();

        String mike = "Mike`s " + mikesChocolateBar.getName() + " chocolate bar costs " + mikesChocolateBar.getPrice();
        String gabby = "Gabby`s" + gabbyBagOfChips.getName() + " bag of chips costs " + gabbyBagOfChips.getPrices();

        System.out.println(mike);
        System.out.println(gabby);
    }
}
