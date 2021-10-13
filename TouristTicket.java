package com.company;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String touristLocation;
    private int maximumLocations;
//---------------------------CONSTRUCTORS-------------------------------------//

 public TouristTicket(int pnrNumber, String departure, String destination, String date, String time, String arrival, String F,double price, String hotelAddress, String touristLocation, int maximumLocations) {
        super(pnrNumber, departure, destination, date, time, arrival, F,price);
        this.hotelAddress=hotelAddress;
        this.touristLocation=touristLocation;
        this.maximumLocations=maximumLocations;
    }
    //-----------------------METHODS----------------------------------//
public String addTouristLocation(){
        return touristLocation +"," +hotelAddress+ "," +maximumLocations  ;
}


    public String removeTouristLocation(){
       return hotelAddress +"," +maximumLocations;
   }
   //-----------------------------GETTERS AND SETTERS-----------------------------//
    public String getHotelAddress(){
        return hotelAddress;
    }
    public void setHotelAddress(String hotelAddress){
        this.hotelAddress=hotelAddress;
    }
    public String getTouristLocation(){
        return touristLocation;
    }
    public void setTouristLocation(String touristLocation){
        this.touristLocation= touristLocation;
    }
    public int getMaximumLocation(){
        return maximumLocations;
    }
    public void setMaximumLocations(int maximumLocations){
        this.maximumLocations=maximumLocations;
    }


}
