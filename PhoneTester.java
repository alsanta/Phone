package com.Santana.phone;

public class PhoneTester {

	public static void main(String[] args) {
		Galaxy alex = new Galaxy("S9", 100, "T-mobile", "Jungle");
		Iphone jannet = new Iphone("X", 100, "Sprint", "Holiday");
		
		alex.displayInfo();
		System.out.println(alex.ring());
		System.out.println(alex.unlock());
		
		jannet.displayInfo();
		System.out.println(jannet.ring());
		System.out.println(jannet.unlock());
	}

}
