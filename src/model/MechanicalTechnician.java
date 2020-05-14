package model;
import java.util.*;

public class MechanicalTechnician extends Documents{
	
	private double gas;
	
	/*
	name: Documents
	Its the constructor of Documents
	@param: price
	@param: year
	@param: code
	@param: gas
	**/
	public MechanicalTechnician(double price, int year, String code, double gas){
		super(price,year,code);
		this.gas = gas;
	}
	
	/*
	name: getGas
	show the quantitu of gas of the mechanical technician
	<b>pre:</b>the gas of the mechanical technician must be entered
	<b>post:</b>show the gas of the mechanical technician saved in variable "gas"
	**/
	public double getGas(){
		return gas;
	}
	
	/*
	name: setGas
	allows entering a new gas for the mechanical technician
	<b>post:</b>the new gas will be saved
	@param: gas
	**/
	public void setGas(double gas){
		this.gas = gas; 
	}
	
	/*
	name: getBasicInfo
	show the information of the vehicles 
	<b>pre:</b>there must be at least one vehicle entered 
	<b>post:</b>shows the main information of the vehicle object
	@return info
	**/
	public String getInfoDocs(){
		String info = super.getInfoDocs();
		info += "\nGases emitidos: " + getGas();
		return info;
	}
}