package com.company;

import java.util.List;

public class Flight {

    public static String flight;
    private  int fNumber;
    private String airline;
    private String capacity;
    private int noOfBookedSeats;
    List<Flight> flights;




    public Flight(int fNumber,String airline,String capacity,int noOfBookedSeats){
        this.noOfBookedSeats=noOfBookedSeats;
        this.capacity=capacity;
        this.airline=airline;
        this.fNumber =fNumber;
    }
//---------------------------CONSTRUCTORS-------------------------------------//

    public Flight() {

    }

    public Flight(int fNumber, String arrival, String destination, String departure, int capacity, double price) {
        this.fNumber=fNumber;
        Ticket.arrival=arrival;
        Ticket.destination=destination;
        Ticket.departure=departure;
        Ticket.capacity=capacity;
        Ticket.price=price;
    }
    //-----------------------METHODS----------------------------------//
    public Flight getFlight(int fNumber) {
        int size = flights.size();
        for (int i = 0; i < size; i++) {
            if (flights.get(i).getFNumber() == fNumber) {
                return flights.get(i);
            }

        }
        return null;
    }

    public String getFlightDetails(){
       String one = "Flight " + getFNumber();
       String two = "," + getAirline();
       String three = "," + getCapacity();
       String four = ", number of booked seats: " + getNumberOfBookedSeats();
       return one + two + three + four;

   }
  public  void displayAvailableFlights(String arrival, String destination){
      int size, seats,numberOfSeatLeft;
      boolean flag = true;
      String o, d;
      size = flights.size();
      for (int i = 0; i < size; i++) {
          o = flights.get(i).getArrival();
          d = flights.get(i).getDestination();
          seats = flights.get(i).getNumberOfSeatsLeft();
          if ((o.equals(arrival)) && (d.equals(destination)) && seats > 0) {
              if (flag) {
                  System.out.println("List of available flights:");
                  flag = false;
              }
              System.out.println(flights.get(i));
          }
      }
      if (flag) {
          System.out.println("no available flights");
      }

  }

    private int getNumberOfSeatsLeft() {
     return noOfBookedSeats;
    }

    private String getDestination() {
return ","+getDestination();
    }

    private String getArrival() {
        return ","+getArrival();
    }


    public boolean bookASeat() {
        if (noOfBookedSeats > 0) {
            noOfBookedSeats = noOfBookedSeats - 1;
            return true;
        }
        return false;
    }

    //-----------------------------GETTERS AND SETTERS-----------------------------//
   public int getFNumber(){
    return fNumber;
    }
    public void setFNumber(int fNumber){
    this.fNumber =fNumber;
    }
    public String getAirline(){
       return airline;
    }
    public void setAirline(String airline){
       this.airline=airline;
    }
    public String getCapacity(){
       return capacity;
    }
    public void setCapacity(String capacity){
       this.capacity=capacity;
    }
    public int getNumberOfBookedSeats(){
       return noOfBookedSeats;
    }
    public void setNoOfBookedSeats(int noOfBookedSeats){
       this.noOfBookedSeats=noOfBookedSeats;
    }
    public String toString()
   {
       return "Flight{" +
               ", FlightNumber =" + getFNumber() + ", " + '\'' +
               ", Airline='" + getArrival() + '\'' +
               ", Capacity ='" +getCapacity() + '\'' +
               ", no of booked seats='" + getNumberOfBookedSeats() +"}" ;
   }
}


