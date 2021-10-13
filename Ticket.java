package com.company;

import java.util.Scanner;

public class Ticket{
    public static String arrival;
    public static String destination;
    public static String departure;
    public static int capacity;
    public static double price;
    private static String flight;
    private int pnrNumber;
    private static String date;
    private String time;
    private Object Flight;
//---------------------------CONSTRUCTORS-------------------------------------//
    public Ticket() {
    }

    public Ticket(int pnrNumber, String departure, String destination, String date, String time, String arrival, String F,double price){
        this.pnrNumber=pnrNumber;
        Ticket.departure =departure;
        Ticket.destination =destination;
        Ticket.date =date;
        this.time=time;
        Ticket.arrival = arrival;
        flight=F;
        Ticket.price =price;

    }

    //-----------------------METHODS----------------------------------//

    public void createFlights() {
        int fNumber, c;
        double p;
        String arrival, destination, dt;
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter flight Number");
        fNumber = scan1.nextInt();
        System.out.println("Enter flight arrival");
        arrival = scan2.nextLine();
        System.out.println("Enter flight destination");
        destination = scan2.nextLine();
        System.out.println("Enter flight departure time and date");
        dt = scan2.nextLine();
        System.out.println("Enter flight capacity");
        c = scan1.nextInt();
        System.out.println("Enter price");
        p = scan3.nextDouble();
        Flight F = new Flight(fNumber, arrival, destination, dt, c, p);
         System.out.println("The following flight has been created:");
        System.out.println(F);
    }


    public void displayAvailableFlights(String arrival, String destination) { }
    public boolean isCancelled(){
        return true;
    }
  // public String checkStatus(){

  // }
   // public String checkDuration(){
    //   return
    //}

    public String getTicketDetails(){
        String one = getPnrNumber() + ", Flight ";
        String two = ", " + getArrival() + " to " + getDestination();
        String three = "Time: " +getTime()+ " date: " +getDate();
        return one + two + three ;
    }

    //-----------------------------GETTERS AND SETTERS-----------------------------//

    public int getPnrNumber(){
        return pnrNumber;
    }
    public void setPnrNumber(int pnrNumber){
        this.pnrNumber=pnrNumber;
    }
    public static String getDeparture(){
        return departure;
    }
    public void setDeparture(String departure){
        Ticket.departure =departure;
    }
    public String getDestination(){
        return destination;
    }
    public void setDestination(String destination){
        Ticket.destination =destination;
    }
    public static String getDate(){
        return date;
    }
    public void setDate(String date){
        Ticket.date =date;
    }

    public String getTime(){
        return time;
    }
    public void setTime(String time){
        this.time=time;
    }
    public String getArrival(){
        return arrival;
    }
    public void setArrival(String arrival){
        Ticket.arrival = arrival;
    }

    public String getFlight(int fNumber) {
    return (String) Flight;
}
    public void setFlight(String F) {
    Ticket.flight=F;
}
}

