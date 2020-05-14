package model; 
import java.util.*;

public abstract class Car extends Vehicle{
	
	public final static int SEDAN = 1; 
	public final static int VAN = 2; 
	public final static int POLARIZED = 1;
	public final static int NOT_POLARIZED = 2; 
	public final static int GASOLINE = 1; 
	public final static int ELECTRIC = 2;
	public final static int HYBRID = 3;
	
	private String classCar, typeCar, windows;
	private int doorsNumber;
	
	/*
	name: Car
	Its the constructor of Car
	@param: owner
	@param: salePrice
	@param: basePrice
	@param: brand
	@param: model
	@param: cylinderCapacity
	@param: mileage
	@param: type
	@param: plaque
	@param: typeVehicle
	@param: classCar
	@param: doorsNumber
	@param: windows
	@param: typeCar
	**/
	public Car(String owner,double salePrice, double	basePrice, String brand, int model, int cylinderCapacity, int mileage, String type,String plaque, int typeVehicle, String classCar, int doorsNumber, String windows, String typeCar){
		super(owner,salePrice,basePrice,brand,model,cylinderCapacity,mileage,type,plaque,typeVehicle);
		this.classCar = classCar; 
		this.doorsNumber = doorsNumber; 
		this.windows = windows; 
		this.typeCar = typeCar;
	}
	
	/*
	name: getClassCar
	show the class car of the car
	<b>pre:</b>the class car of the car must be entered
	<b>post:</b>show the class car of the vehicle saved in variable "classCar"
	**/
	public String getClassCar(){
		return classCar;
	}
	
	/*
	name: setClassCar
	allows entering a new class car for the car
	<b>post:</b>the new class car will be saved
	@param: classCar
	**/
	public void setClassCar(String ClassCar){
		this.classCar = classCar;
	}
	
	/*
	name: getDoorsNumber
	show the doors number of the car
	<b>pre:</b>the doors number of the car must be entered
	<b>post:</b>show the doors number of the vehicle saved in variable "doorsNumber"
	**/
	public int getDoorsNumber(){
		return doorsNumber; 
	}
	
	/*
	name: setDoorsNumber
	allows entering a new doors number for the car
	<b>post:</b>the new doors number will be saved
	@param: doorsNumber
	**/
	public void setDoorsNumber(int doorsNumber){
		this.doorsNumber = doorsNumber;
	}
	
	/*
	name: getWindows
	show the type of windows(polarized or not poarized) of the car
	<b>pre:</b>the windows of the car must be entered
	<b>post:</b>show the type of windows of the vehicle saved in variable "windows"
	**/
	public String getWindows(){
		return windows;
	}
	
	/*
	name: setWindows
	allows entering a new windows for the car
	<b>post:</b>the new windows will be saved
	@param: windows
	**/
	public void setWindows(String windows){
		this.windows = windows;
	}
	
	/*
	name: getTypeCar
	show the type of car of the car
	<b>pre:</b>the type of car of the car must be entered
	<b>post:</b>show the type of car of the vehicle saved in variable "typeCard"
	**/
	public String getTypeCar(){
		return typeCar;
	}
	
	/*
	name: setTypeCar
	allows entering a new type of car for the car
	<b>post:</b>the new type of car will be saved
	@param: typeCar
	**/
	public void setTypeCar(String typeCar){
		this.typeCar = typeCar;
	}
	
	/*
	name: getBasicInfo
	show the information of the vehicles 
	<b>pre:</b>there must be at least one vehicle entered 
	<b>post:</b>shows the main information of the vehicle object
	@return info
	**/
	public String getBasicInfo(){
		String info = super.getBasicInfo();
		info += "\nClase de carro: " + getClassCar() + "\nNumero de puertas: " + getDoorsNumber() + "\nVentanas: " + getWindows() + "\nTipo de carro: " + getTypeCar();
		return info;
	}
	
	public abstract String getConsume();
}