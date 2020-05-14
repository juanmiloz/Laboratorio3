package model;
import java.util.*;

public class Seller{
	
	private String nameSeller, lastNameSeller;
	private int identificationSeller, salesQuantity;
	public Client client []; 
	
	/*
	name: Seller
	Its the constructor of Seller
	@param: nameSeller
	@param: lastNameSeller
	@param: identificationSeller
	@param: salesQuantity
	**/
	public Seller(String nameSeller,String lastNameSeller, int identificationSeller, int salesQuantity){
		this.nameSeller =  nameSeller; 
		this.lastNameSeller = lastNameSeller;
		this.identificationSeller = identificationSeller;
		this.salesQuantity = salesQuantity;
		client = new Client [5];
	}
	
	/*
	name: increaseSales
	allows to increase customer sales by one
	<b>post:</b>the new salesQuantity is load
	**/
	public void increaseSales () {
		this.salesQuantity++;
	}
	
	/*
	name: getNameSeller
	show the name of the seller
	<b>pre:</b>the name of the seller must be entered
	<b>post:</b>show the name of the seller saved in variable "nameSeller"
	**/
	public String getNameSeller(){
		return nameSeller;
	}
	
	/*
	name: setNameSeller
	allows entering a new name for the Seller
	<b>post:</b>the new name will be saved
	@param: nameSeller
	**/
	public void setNameSeller(String nameSeller){
		this.nameSeller = nameSeller;
	}
	
	/*
	name: getLastNameSeller
	show the last name of the seller
	<b>pre:</b>the last name of the seller must be entered
	<b>post:</b>show the last name of the seller saved in variable "lastNameSeller"
	**/
	public String getLastNameSeller(){
		return lastNameSeller;
	}
	
	/*
	name: setLastNameSeller
	allows entering a new last name for the Seller
	<b>post:</b>the new last name will be saved
	@param: lastNameSeller
	**/
	public void setLasNameSeller(String lastNameSeller){
		this.lastNameSeller = lastNameSeller;
	}
	
	/*
	name: getIdentificationSeller
	show the number the identification of the seller
	<b>pre:</b>the number of identification of the seller must be entered
	<b>post:</b>show the number of identification of the seller saved in variable "identificationSeller"
	**/
	public int getIdentificationSeller(){
		return identificationSeller;
	}
	
	/*
	name: setIdentificationSeller
	allows entering a new number of identification for the Seller
	<b>post:</b>the new number of identification will be saved
	@param: identificationSeller
	**/
	public void setIdentificationSeller(int identificationSeller){
		this.identificationSeller = identificationSeller;
	}
	
	/*
	name: getSalesQuantity
	shows the sales number of the seller
	<b>pre:</b>the quantity of sales number of the seller must be entered
	<b>post:</b>show the quantity of sales number of the seller saved in variable "salesQuantity"
	**/
	public int getSalesQuantity(){
		return salesQuantity;
	}
	
	/*
	name: setSalesQuantity
	allows entering a quantity of sales number for the Seller
	<b>post:</b>the new quantity of sales number will be saved
	@param: salesQuantity
	**/
	public void setSalesQuantity(int salesQuantity){
		this.salesQuantity = salesQuantity;
	}
	
	/*
	name: addClient
	allows entering a new client to the seller
	<b>post:</b>the new client will be saved
	@param: newClient
	**/
	public void addClient(Client newClient){
		if(client [0] != null && client[1] != null && client[2] != null && client[3] != null && client[4] != null){
			System.out.println("\n!ADVERTENCIA!");
			System.out.println("Ya hay la cantidad maxima de Clientes");
		}
		
		for(int i = 0; i < client.length; i++){
			if(client [i] == null){
				client[i] = newClient;
				i = 6;
			}
		}
	}
	
	/*
	name: getClient
	call the client you select
	<b>pre:</b>there must be a client in the array
	<b>post:</b>gets the client in a position to later see their attributes
	**/
	public Client[] getClient(){
		return client;
	}
	
	/*
	name: setClient
	allows entering a client in the array
	<b>post:</b>the new client will be saved
	@param: client
	**/
	public void setClient(Client[] client){
		this.client = client; 
	}
}