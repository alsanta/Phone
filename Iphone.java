package com.Santana.phone;

public class Iphone extends Phone implements Ringable{
	
	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	public String ring() {
		return String.format("Iphone says " + this.getRingTone());
	}
	
	public String unlock() {
		return String.format("Iphone unlocks with facial recognition");
	}
	
	public void displayInfo(){
    	System.out.println(String.format("Version: %s\n Battery Percentage: %s\n Carrier: %s\n Ring Tone: %s", this.getVersionNumber(), this.getBatteryPercentage(),this.getCarrier(),this.getRingTone()));
    }
}