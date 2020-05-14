package model;
import java.util.*;

public class SOAT extends Documents{
	
	private double accidents;
	
	/*
	name: Documents
	Its the constructor of Documents
	@param: price
	@param: year
	@param: code
	@param: accidents
	**/
	public SOAT(double price, int year, String code, double accidents){
		super(price,year,code);
		this.accidents = accidents;
	}
	
	/*
	name: getAccidents
	show the accident coverage of the SOAT
	<b>pre:</b>the accident coverage of the SOAT must be entered
	<b>post:</b>show the accident coverage of the SOAT saved in variable "accidents"
	**/
	public double getAccidents(){
		return accidents;
	}
	
	/*
	name: setAccidents
	allows entering a new accident coverage for the SOAT
	<b>post:</b>the new accident coverage will be saved
	@param: accidents
	**/
	public void setAccidents(double accidents){
		this.accidents = accidents; 
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
		info += "\nCobertura por accidentes: " + getAccidents();
		return info;
	}
}