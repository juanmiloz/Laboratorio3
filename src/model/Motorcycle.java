package model; 
import java.util.*;

public class Motorcycle extends Vehicle implements GasolineEngine{
	public final static int ESTANDAR = 1;
	public final static int DEPORTIVA = 2;
	public final static int SCOOTER = 3;
	public final static int CROOS = 4;
	
	private String typeMotorcycle;
	private double capacityGasoline; 
	
	/*
	name: Motorcycle
	Its the constructor of Motorcycle
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
	@param: typeMotorcycle
	@param: capacityGasoline
	**/
	public Motorcycle(String owner,double salePrice, double	basePrice, String brand, int model, int cylinderCapacity, int mileage, String type,String plaque, int typeVehicle, String typeMotorcycle, double capacityGasoline){
		super(owner,salePrice,basePrice,brand,model,cylinderCapacity,mileage,type,plaque,typeVehicle);
		this.typeMotorcycle = typeMotorcycle;
		this.capacityGasoline = capacityGasoline; 
	}
	
	/*
	name: getTypeMotorcycle
	show the type of motorcycle of the motorcycle
	<b>pre:</b>the type of motorcycle of the motorcycle must be entered
	<b>post:</b>show the type of motorcycle of the motorcycle saved in variable "typeMotorcycle"
	**/
	public String getTypeMotorcycle(){
		return typeMotorcycle;
	}
	
	/*
	name: setTypeMotorcycle
	allows entering a new type of motorcycle for the motorcycle
	<b>post:</b>the new type of motorcycle will be saved
	@param: typeMotorcycle
	**/
	public void setTypeMotorcycle(String typeMotorcycle){
		this.typeMotorcycle = typeMotorcycle;
	}
	
	/*
	name: getCapacityGasoline
	show the capacity of gasoline of the motorcycle
	<b>pre:</b>the capacity of gasoline of the motorcycle must be entered
	<b>post:</b>show the capacity of gasoline of the motorcycle saved in variable "capacityGasoline"
	**/
	public double getCapacityGasoline(){
		return capacityGasoline;
	}
	
	/*
	name: setCapacityGasoline
	allows entering a new capacity of gasoline for the motorcycle
	<b>post:</b>the new capacity of gasoline of motorcycle will be saved
	@param: capacityGasoline
	**/
	public void setCapacityGasoline(double capacityGasoline){
		this.capacityGasoline = capacityGasoline;
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
		info += "\nTipo de moto: " + getTypeMotorcycle() + "\nCapacidad de tanque: " + getCapacityGasoline();
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
		double result = getCapacityGasoline() * (super.getCylinderCapacity()/90);
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