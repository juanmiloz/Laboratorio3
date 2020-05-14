package model; 
import java.util.*;

public abstract class Documents{
	
	public final static int WIDTH = 5;
	public final static int HIGH = 5;
	
	private double price; 
	private int year; 
	private String code;
	private int [][] image;
	
	/*
	name: Documents
	Its the constructor of Documents
	@param: price
	@param: year
	@param: code
	**/
	public  Documents(double price, int year, String code){
		this.price = price;
		this.year = year;
		this.code = code; 
		image = new int [HIGH][WIDTH];
		Random ran = new Random();
	}
	
	/*
	name: getPrice
	show the price of the document
	<b>pre:</b>the price of the document must be entered
	<b>post:</b>show the price of the document saved in variable "price"
	**/
	public double getPrice(){
		return price;
	}
	
	/*
	name: setPrice
	allows entering a new price for the document
	<b>post:</b>the new price will be saved
	@param: price
	**/
	public void setPrice(double price){
		this.price = price;
	}
	
	/*
	name: getYear
	show the year of the document
	<b>pre:</b>the year of the document must be entered
	<b>post:</b>show the year of the document saved in variable "year"
	**/
	public int getYear(){
		return year;
	}
	
	/*
	name: setYear
	allows entering a new year for the document
	<b>post:</b>the new year will be saved
	@param: year
	**/
	public void setYear(int year){
		this.year = year;
	}
	
	/*
	name: getCode
	show the code of the document
	<b>pre:</b>the code of the document must be entered
	<b>post:</b>show the code of the document saved in variable "code"
	**/
	public String getCode(){
		return code;
	}
	
	/*
	name: setCode
	allows entering a new code for the document
	<b>post:</b>the new code will be saved
	@param: code
	**/
	public void setCode(String code){
		this.code = code;
	}
	
	/*
	name: getBasicInfo
	show the information of the vehicles 
	<b>pre:</b>there must be at least one vehicle entered 
	<b>post:</b>shows the main information of the vehicle object
	@return info
	**/
	public String getInfoDocs(){
		String info = "\nPrecio: " + getPrice() + "\nAno: " + getYear() + "\nCodigo: " + getCode();
		return info;
	}
	
}