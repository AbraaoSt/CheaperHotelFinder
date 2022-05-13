package com.test;

public class Main {

	public static void main(String[] args) {
		try {

			String input = "Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(sun)";
			String[] splittedInput = input.split(":");
			String clientType = splittedInput[0];
			String[] dates = splittedInput[1].split(",");

			HotelList hotelList = new HotelList();

			hotelList.addHotel(new Hotel("Lakewood", 3, 110, 80, 90, 80));
			hotelList.addHotel(new Hotel("Bridgewood", 4, 160, 110, 60, 50));
			hotelList.addHotel(new Hotel("Ridgewood", 5, 220, 100, 150, 40));

			System.out.println(hotelList.getBestHotel(dates, clientType));
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
	}

}
