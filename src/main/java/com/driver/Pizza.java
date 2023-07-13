package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public int paper_bag;
    public int chese_price;
    public int extra_toping_price;
    public int total_price ;

    public boolean bag ;
    public boolean chese ;
    public boolean bill_generated;
     public boolean extra_Toping_b ;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if( isVeg){
            total_price = 300;

            extra_toping_price = 70;
          bill = "Base Price Of The Pizza: 300\n";
        }
        else{
            // non veg
            total_price = 400;
            bill = "Base Price Of The Pizza: 400\n" ;
            extra_toping_price = 120;
        }
        paper_bag = 20;
        chese_price = 80;

        chese = false;
        bag = false;
        extra_Toping_b = false;
        bill_generated = false;

    }

    public int getPrice(){
        return this.total_price;
    }

    public void addExtraCheese(){
        // your code goes here
         if( chese == false) {
             total_price += chese_price;
             chese = true;
         }

    }

    public void addExtraToppings(){
        // your code goes here
        if( extra_Toping_b == false) {
            total_price += extra_toping_price;
            extra_Toping_b = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(bag == false) {
            total_price += paper_bag;
            bag= true;
        }
    }

    public String getBill(){
        // your code goes here

        if( bill_generated == false) {

            if(chese == true){
                bill += "Extra Cheese Added: "+chese_price+"\n";
            }
           if( extra_Toping_b == true){
               bill += "Extra Toppings Added: " + extra_toping_price+ "\n";
           }
           if(bag == true){
               bill += "Paperbag Added: " + paper_bag + "\n";
           }

           bill += "Total Price: "+ total_price+ "\n";

            bill_generated = true;
        }


        return this.bill;
    }
}
