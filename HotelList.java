package com.test;

import java.util.ArrayList;

public class HotelList {
	private ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	public ArrayList<Hotel> getHotelList() {
		return hotelList;
	}

	public void addHotel(Hotel hotel) {
		this.hotelList.add(hotel);
	}

	public String getBestHotel(String[] dates, String userType) {

		int numberOfBusinessDays = 0;
		int numberOfWeekendDays = 0;
		Hotel cheaperHotel = hotelList.get(0);
		double cheaperHotelPrice = 0;

		if (hotelList.size() == 0) {
			return "";
		}

		if (hotelList.size() == 1) {
			return hotelList.get(0).getName();
		}

		for (int i = 0; i < dates.length; i++) {
			String dayOfWeek = dates[i].split("\\(")[1].replaceAll("\\)", "");
			if (dayOfWeek.equals("sat") || dayOfWeek.equals("sun")) {
				numberOfWeekendDays++;
			} else {
				numberOfBusinessDays++;
			}
		}

		for (int i = 0; i < hotelList.size(); i++) {
			double value = 0;

			if (userType.equals("Regular")) {
				value = value + hotelList.get(i).getbDaysPriceRegular() * numberOfBusinessDays;
				value = value + hotelList.get(i).getWkdPriceRegular() * numberOfWeekendDays;
			} else {
				value = value + hotelList.get(i).getbDaysPriceReward() * numberOfBusinessDays;
				value = value + hotelList.get(i).getWkdPriceReward() * numberOfWeekendDays;
			}

			if (i == 0 || (value < cheaperHotelPrice
					|| (value == cheaperHotelPrice && hotelList.get(i).getRating() > cheaperHotel.getRating()))) {
				cheaperHotelPrice = value;
				cheaperHotel = hotelList.get(i);
			}
		}

		return cheaperHotel.getName();
	}

}
