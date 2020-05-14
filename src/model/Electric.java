package model; 
import java.util.*;

public class Electric extends Car implements ElectricEngine{
	
	private String typeCharger;
	private double batteryLife;
	
	/*
	name: Electric
	Its the constructor of Electric
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
	@param: typeCharger
	@param: batteryLife
	**/
	public Electric(String owner,double salePrice, double	basePrice, String brand, int model, int cylinderCapacity, int mileage, String type,String plaque, int typeVehicle, String classCar, int doorsNumber, String windows, String typeCar, String typeCharger, double batteryLife){
		super(owner,salePrice,basePrice,brand,model,cylinderCapacity,mileage,type,plaque,typeVehicle,classCar,doorsNumber,windows,typeCar);
		this.typeCharger = typeCharger;
		this.batteryLife = batteryLife;
	}
	
	/*
	name: getTypeCharger
	show the type charger of the car electric
	<b>pre:</b>the type charger of the car electric must be entered
	<b>post:</b>show the type charger of the car electric saved in variable "typeCharger"
	**/
	public String getTypeCharger(){
		return typeCharger;
	}
	
	/*
	name: setTypeCharger
	allows entering a new type charger for the car
	<b>post:</b>the new type charger will be saved
	@param: typeCharger
	**/
	public void setTypeCharger(String typeCharger){
		this.typeCharger = typeCharger;
	}
	
	/*
	name: getBatteryLife
	show the battery life of the car electric
	<b>pre:</b>the battery life of the car electric must be entered
	<b>post:</b>show the battery life of the car electric saved in variable "typeCharger"
	**/
	public double getBatteryLife(){
		return batteryLife;
	}
	
	/*
	name: setBatteryLife
	allows entering a new battery life for the car
	<b>post:</b>the new battery life will be saved
	@param: batteryLife
	**/
	public void setBatteryLife(double batteryLife){
		this.batteryLife = batteryLife;
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
		info += "\nTipo de cargador: " + getTypeCharger() + "\nVida de bateria: " + getBatteryLife();
		return info;
	}
	
	/*
	name: calculateBatteryConsumption
	allows to calculate the consume of battery of the vehicle
	<b>pre:</b>the life of battery must be entered
	<b>post:</b>the life of battery was calculated
	@return: result
	**/
	@Override
	public double calculateBatteryConsumption(){
		double result;
		if(getTypeCharger().equalsIgnoreCase("rapido")){
			result = (super.getCylinderCapacity()/100) * (getBatteryLife()+10);
		}else{
			result = (super.getCylinderCapacity()/100) * (getBatteryLife()+15);
		}
		return result;
	}
	
	/*
	name: getConsume
	allows allows to obtain gasoline consumption
	<b>pre:</b>the method calculateGasolineConsumption it has to be done
	<b>post:</b>consumption information was obtained
	@return: info
	**/
	public String getConsume(){
		String info = "Consumo de bateria: " + calculateBatteryConsumption();
		return info;
	}
	
}