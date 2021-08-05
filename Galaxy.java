package com.Santana.phone;

public class Galaxy extends Phone implements Ringable{
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	public String ring() {
		return String.format("Galaxy says " + this.getRingTone());
	}
	
	public String unlock() {
		return String.format("Unlocking via fingerprint");
	}
	
	public void displayInfo(){
    	System.out.println(String.format("Version: %s\n Battery Percentage: %s\n Carrier: %s\n Ring Tone: %s", this.getVersionNumber(), this.getBatteryPercentage(),this.getCarrier(),this.getRingTone()));
    }
}
