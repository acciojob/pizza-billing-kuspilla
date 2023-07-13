package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean chese = false;
    boolean Toppings = false;
    boolean bag_price = false;
    boolean Paperbag = false;
    boolean Extra_Toppings = false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price += 300;
        }
        else{
            price += 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

          price += 80;
          this.chese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if( this.isVeg)
        price += 70;
        else {
            price += 120;
        }
        Extra_Toppings = true;

    }

    public void addTakeaway(){
        // your code goes here
        if(!Paperbag) {
            price += 20;
            this.Paperbag = true;
        }
    }

    public String getBill(){
        // your code goes here
       /* Base Price Of The Pizza: 300
        Extra Cheese Added: 80
        Extra Toppings Added: 70
        Paperbag Added: 20
        Total Price: 470    */


        String temp = "";
        if(isVeg ){
            temp += "Base Price Of The Pizza: 300\n";
        }
        else{
            temp += "Base Price Of The Pizza: 400\n";
        }

        // Extra chese
        if( chese)
        temp += "Extra Cheese Added: 80\n";

        // topings extra
        if( Extra_Toppings) {
            if (isVeg) {
                temp += "Extra Toppings Added: 70\n";
            } else {
                temp += "  Extra Toppings Added: 120\n";
            }
        }

        // paper bag
        if( this.bag_price){
            temp += "Paperbag Added: 20\n";
        }

//        else{
//            temp += "Paperbag Added: 0\n";
//        }

        // total print
        temp += "Total Price: "+this.price;
           this.bill = temp;
           System.out.println();

        return this.bill;
    }
}
