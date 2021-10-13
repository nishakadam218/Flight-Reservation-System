package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* for a testing purpose-------------------------------------------
		Flight flight =new Flight(12,"indigo","12",12);
		System.out.println(flight.getFlightDetails());

		Ticket ticket=new Ticket(21,"abc","mumbai","21","12:10","goa","indigo");
		System.out.println(ticket);

		Address address =new Address("nashik","nashik","maharashtra");
		System.out.println(address.getAddressDetails());
		System.out.println(address.updateAddressDetails());

		Contact contact=new Contact("avinash","1234567890","nk@gmail.com");
		System.out.println(contact.getContactDetails());

		Passenger passenger=new Passenger("new","mumbai","maharashtra","142354624","523514","nk@gmail.com");
		System.out.println(passenger.getAddressDetails());
		System.out.println(passenger.getContactDetails());


		TouristTicket TT=new TouristTicket(423,"abc","mumbai","12","3:12","goa","taj","ab1...","panaji",10);
		System.out.println(TT.addTouristLocation());
		System.out.println(TT.removeTouristLocation());

		RegularTicket rt =new RegularTicket(423,"abc","mumbai","12","3:12","goa","indigo","dairy foods","coco","cookies");
		System.out.println(rt.toCheckSpecialService());


*/
		TouristTicket TT=new TouristTicket(423,"abc","mumbai","12","3:12","goa","taj",1200,"ABCD","GSF",12);
		System.out.println(TT.addTouristLocation());
		System.out.println(TT.removeTouristLocation());

		RegularTicket rt =new RegularTicket(423,"abc","mumbai","12","3:12","goa","indigo",1200,"FROUTS","COCO","CHIPS");
		System.out.println(rt.toCheckSpecialService());

		Ticket t = new Ticket();
		Flight F=new Flight();

		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		String input, destination, origin, name ,phoneNumber;
		int fNumber, email;
		boolean flag = false;

		while (flag != true){
			System.out.println("Enter c if you would like to create a flight (createFlight method)");
			System.out.println("Enter d if you would like to display all flights (displayAvailableFlights method)");
			System.out.println("Enter g if you would like to get information on a flight (getFlight method)");
			System.out.println("Enter b if you would like to book a seat (bookSeat method)");
			input = scan1.nextLine();
			switch (input) {
				case "c":
					t.createFlights();
					break;
				case "d":
					System.out.println("Enter flight arrival");
					origin = scan1.nextLine();
					System.out.println("Enter flight destination");
					destination = scan1.nextLine();
					t.displayAvailableFlights(origin, destination);
					break;
				case "g":
					System.out.println("Enter Flight number");
					fNumber= scan2.nextInt();
					String l = t.getFlight(fNumber);
					if (F == null) {
						System.out.println("Flight " + fNumber + " does not exist");
					} else {
						System.out.println("Info for Flight " + fNumber + ":");
						System.out.println(l);
					}
					break;
				case "b":
					System.out.println(" Passenger details");
					System.out.println("Enter passengers name");
					name = scan2.next();
					System.out.println(name);
					System.out.println("Enter passengers phoneNumber");
					phoneNumber = scan1.nextLine();
					System.out.println(phoneNumber);
					System.out.println("Enter flight email");
					email = scan2.nextInt();
					System.out.println(email);
			}
		}
	}
}
