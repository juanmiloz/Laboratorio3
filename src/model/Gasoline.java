package model;
import java.util.*;

public class Gasoline extends Car implements GasolineEngine{
	
	private int tankCapacity;
	private String typeGasoline;
	
	/*
	name: Gasoline
	Its the constructor of Gasoline
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
	@param: tankCapacity
	@param: typeGasoline
	**/
	public Gasoline(String owner,double salePrice, double 	basePrice, String brand, int model, int cylinderCapacity, int mileage, String type,String plaque, int typeVehicle, String classCar, int doorsNumber, String windows, String typeCar, int tankCapacity, String typeGasoline){
		super(owner,salePrice,basePrice,brand,model,cylinderCapacity,mileage,type,plaque,typeVehicle,classCar,doorsNumber,windows,typeCar);
		this.tankCapacity = tankCapacity;
		this.typeGasoline = typeGasoline;
	}
	
	/*
	name: getTankCapacity
	show the tank capacity of the car a gasoline
	<b>pre:</b>the tank capacity of the car a gasoline must be entered
	<b>post:</b>show the tank capacity of the car a gasoline saved in variable "tankCapacity"
	**/
	public int getTankCapacity(){
		return tankCapacity;
	}
	
	/*
	name: setTankCapacity
	allows entering a new tank capacity for the car a gasoline
	<b>post:</b>the new tank capacity will be saved
	@param: tankCapacity
	**/
	public void setTankCapacity(int tankCapacity){
		this.tankCapacity = tankCapacity;
	}
	
	/*
	name: getTypeGasoline
	show the type of gasoline of the car a gasoline
	<b>pre:</b>the type of gasoline of the car a gasoline must be entered
	<b>post:</b>show the type of gasoline of the car a gasoline saved in variable "typeGasoline"
	**/
	public String getTypeGasoline(){
		return typeGasoline;
	}
	
	/*
	name: setTypeGasoline
	allows entering a new type of gasoline for the car a gasoline
	<b>post:</b>the new type of gasoline will be saved
	@param: typeGasoline
	**/
	public void setTypeGasoline(String typeGasoline){
		this.typeGasoline = typeGasoline;
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
		info += "\nCapacidad del tanque: " + getTankCapacity() + "\nTipo de gasolina: " + getTypeGasoline();
		return info;
	}
	
	/*
	name: calculateGasolineConsumption
	allows to calculate the consume of gasoline of the vehicle
	<b>pre:</b>the capacity of gasoline must be entered
	<b>post:</b>the consume of gasoline was calculated
	@return: result
	**/
	@Override
	public double calculateGasolineConsumption(){
		double result = getTankCapacity() * (super.getCylinderCapacity()/100);
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
		String info = "Consumo Gasolina: " + calculateGasolineConsumption();
		return info;
	}
}