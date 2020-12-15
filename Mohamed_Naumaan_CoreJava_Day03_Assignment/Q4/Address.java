package com.sonata.Q4;

public class Address {
	int Doorno;
	String Street;
	String city;
	@Override
	public String toString() {
		return "Address [Doorno=" + Doorno + ", Street=" + Street + ", city=" + city + ", pin=" + pin + "]";
	}
	public int getDoorno() {
		return Doorno;
	}
	public void setDoorno(int doorno) {
		Doorno = doorno;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	int pin;

}
