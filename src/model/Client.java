package model; 
import java.util.*;

public class Client{
	
	private String nameClient, lastNameClient, mail, phoneNumber,identificationClient;
	public ArrayList<Vehicle> interestedVehicles;
	
	/*
	name: Client
	Its the constructor of Client
	@param: nameClient
	@param: lastNameClient
	@param: identificationClient
	@param: phoneNumber
	@param: mail
	**/
	public Client(String nameClient, String lastNameClient, String identificationClient, String phoneNumber, String mail){
		this.nameClient = nameClient; 
		this.lastNameClient = lastNameClient; 
		this. identificationClient = identificationClient;
		this.phoneNumber = phoneNumber; 
		this.mail = mail;
		interestedVehicles = new ArrayList<Vehicle>();
	}
	
	/*
	name: getNameClient
	show the name of the client
	<b>pre:</b>the name of the client must be entered
	<b>post:</b>show the name of the client saved in variable "nameClient"
	**/
	public String getNameClient(){
		return nameClient;
	}
	
	/*
	name: setNameClient
	allows entering a new name for the client 
	<b>post:</b>the new name will be saved
	@param: nameClient
	**/
	public void setNameClient(String nameClient){
		this.nameClient = nameClient; 
	}
	
	/*
	name: getLastNameClient
	show the last name of the client
	<b>pre:</b>the last name of the client must be entered
	<b>post:</b>show the last name of the client saved in variable "lastNameClient"
	**/
	public String getLastNameClient(){
		return lastNameClient;
	}
	
	/*
	name: setLastNameClient
	allows entering a new last name for the client 
	<b>post:</b>the new last name will be saved
	@param: lastNameClient
	**/
	public void setLastNameClient (String lastNameClient){
		this.lastNameClient = lastNameClient; 
	}
	
	/*
	name: getIdentificationClient
	show the number of identification of the client
	<b>pre:</b>the number of identification of the client must be entered
	<b>post:</b>show the number of identification of the client saved in variable "identificationClient"
	**/
	public String getIdentificationClient(){
		return identificationClient;
	}
	
	/*
	name: setIdentificationClient
	allows entering a new number of identification for the client 
	<b>post:</b>the new number of identification will be saved
	@param: identificationClient
	**/
	public void setIdentificationClient(String identificationClient){
		this.identificationClient = identificationClient;
	}
	
	/*
	name: getPhoneNumber
	show the phone number of the client
	<b>pre:</b>the phone number of the client must be entered
	<b>post:</b>show the phone number of the client saved in variable "phoneNumber"
	**/
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	/*
	name: setPhoneNumber
	allows entering a new phone number for the client 
	<b>post:</b>the new phone number will be saved
	@param: phoneNumber
	**/
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	/*
	name: getMail
	show the mail of the client
	<b>pre:</b>the mail of the client must be entered
	<b>post:</b>show the mail of the client saved in variable "mail"
	**/
	public String getMail(){
		return mail;
	}
	
	/*
	name: setMail
	allows entering a new mail for the client 
	<b>post:</b>the new mail will be saved
	@param: mail
	**/
	public void setMail(String mail){
		this.mail = mail; 
	}
	
	/*
	name: addInterestedVehicles
	add a new vehicle of interest to a customer
	<b>post:</b>the new vehicle of interest will be saved
	**/
	public void addInterestedVehicles(Vehicle newInterestedVehicles){
		interestedVehicles.add(newInterestedVehicles);
	}
	
	/*
	name: getMail
	show a vehicle of interest
	<b>pre:</b>the vehicle of interes of the client must be entered
	<b>post:</b>show the vehicle of interest of the client saved in variable "interestedVehicles"
	**/
	public ArrayList<Vehicle> getInterestedVehicles(){
		return interestedVehicles;
	}
}