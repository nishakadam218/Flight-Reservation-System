package com.company;

public class RegularTicket extends Ticket{
        private String food;
        private String water;
        private String snacks;

//---------------------------CONSTRUCTORS-------------------------------------

    public RegularTicket(int pnrNumber, String departure, String destination, String date, String time, String arrival, String F,double price,String food,String water,String snacks) {
        super(pnrNumber, departure, destination, date, time, arrival,F,price);
        this.food=food;
        this.water=water;
        this.snacks=snacks;
    }
    //-----------------------METHODS----------------------------------------
    public String toCheckSpecialService(){
        return  food+ ", " +water + ", " +snacks;
}

//-----------------------------GETTERS AND SETTERS-----------------------------
public String getFood(){
    return food;
}
public void setFood(String food){
    this.food=food;
}
public String getWater(){
    return water;
}
public void setWater(String water){
    this.water=water;
}
public String getSnacks(){
    return snacks;
}
public void setSnacks(String snacks){
    this.snacks=snacks;
}
}
