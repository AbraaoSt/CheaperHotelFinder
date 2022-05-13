package com.test;

public class Hotel {

	private String name;
	private double rating;
	private double bDaysPriceRegular;
	private double wkdPriceRegular;
	private double bDaysPriceReward;
	private double wkdPriceReward;

	public Hotel(String name, double rating, double bDaysPriceRegular, double bDaysPriceReward, double wkdPriceRegular,
			double wkdPriceReward) {
		this.name = name;
		this.rating = rating;
		this.wkdPriceRegular = wkdPriceRegular;
		this.bDaysPriceRegular = bDaysPriceRegular;
		this.bDaysPriceReward = bDaysPriceReward;
		this.wkdPriceReward = wkdPriceReward;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Double getbDaysPriceRegular() {
		return bDaysPriceRegular;
	}

	public void setbDaysPriceRegular(Double bDaysPriceRegular) {
		this.bDaysPriceRegular = bDaysPriceRegular;
	}

	public Double getWkdPriceRegular() {
		return wkdPriceRegular;
	}

	public void setWkdPriceRegular(Double wkdPriceRegular) {
		this.wkdPriceRegular = wkdPriceRegular;
	}

	public Double getbDaysPriceReward() {
		return bDaysPriceReward;
	}

	public void setbDaysPriceReward(Double bDaysPriceReward) {
		this.bDaysPriceReward = bDaysPriceReward;
	}

	public Double getWkdPriceReward() {
		return wkdPriceReward;
	}

	public void setWkdPriceReward(Double wkdPriceReward) {
		this.wkdPriceReward = wkdPriceReward;
	}

}
