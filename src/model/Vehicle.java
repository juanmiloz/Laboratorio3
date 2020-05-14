package model;
import java.util.*;

public abstract class Vehicle{
	
	private double salePrice, basePrice;
	private String brand, plaque, type, owner;
	private int model, cylinderCapacity, mileage, typeVehicle;
	public ArrayList<Documents> docs;
	
	/*
	name: Vehicle
	Its the constructor of Vehicle
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
	**/
	public Vehicle(String owner, double salePrice, double	basePrice, String brand, int model, int cylinderCapacity, int mileage, String type,String plaque, int typeVehicle){
		this.owner = owner;
		this.salePrice = salePrice;
		this.basePrice = basePrice; 
		this.brand = brand; 
		this.model = model; 
		this.cylinderCapacity = cylinderCapacity; 
		this.mileage = mileage; 
		this.type = type; 
		this.plaque = plaque;
		this.typeVehicle = typeVehicle;
		docs = new ArrayList<Documents>(); 
	}
	
	/*
	name: getOwner
	show the owner of the vehicle
	<b>pre:</b>the owner of the vehicle must be entered
	<b>post:</b>show the owner of the vehicle saved in variable "owner"
	**/
	public String getOwner(){
		return owner;
	}
	
	/*
	name: setOwner
	allows entering a new owner for the vehicle
	<b>post:</b>the new owner will be saved
	@param: owner
	**/
	public void setOwner(String owner){
		this.owner = owner;
	}
	
	/*
	name: getSalePrice
	show the sale price of the vehicle
	<b>pre:</b>the sale price of the vehicle must be entered
	<b>post:</b>show the sale price of the vehicle saved in variable "salePrice"
	**/
	public double getSalePrice(){
		return salePrice;
	}
	
	/*
	name: setSalePrice
	allows entering a new sale price for the vehicle
	<b>post:</b>the new sale price will be saved
	@param: salePrice
	**/
	public void setSalePrice(double salePrice){
		this.salePrice = salePrice; 
	}
	
	/*
	name: getBasePrice
	show the base price of the vehicle
	<b>pre:</b>the base price of the vehicle must be entered
	<b>post:</b>show the base price of the vehicle saved in variable "basePrice"
	**/
	public double getBasePrice(){
		return basePrice; 
	}
	
	/*
	name: setBasePrice
	allows entering a new base price for the vehicle
	<b>post:</b>the new base price will be saved
	@param: basePrice
	**/
	public void setBasePrice(double basePrice){
		this.basePrice = basePrice;
	}
	
	/*
	name: getBrand
	show the brand of the vehicle
	<b>pre:</b>the brand of the vehicle must be entered
	<b>post:</b>show the brand of the vehicle saved in variable "brand"
	**/
	public String getBrand(){
		return brand;
	}
	
	/*
	name: setBrand
	allows entering a new brand for the vehicle
	<b>post:</b>the new brand will be saved
	@param: brand
	**/
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	/*
	name: getModel
	show the model of the vehicle
	<b>pre:</b>the model of the vehicle must be entered
	<b>post:</b>show the model of the vehicle saved in variable "model"
	**/
	public int getModel(){
		return model;
	}
	
	/*
	name: setModel
	allows entering a new model for the vehicle
	<b>post:</b>the new model will be saved
	@param: model
	**/
	public void setModel(int model){
		this.model = model; 
	}
	
	/*
	name: getCylinderCapacity
	show the cylinder capacity of the vehicle
	<b>pre:</b>the cylinder capacity of the vehicle must be entered
	<b>post:</b>show the cylinder capacity of the vehicle saved in variable "cylinderCapacity"
	**/
	public int getCylinderCapacity(){
		return cylinderCapacity;
	}
	
	/*
	name: setCylinderCapacity
	allows entering a new cylinder capacity for the vehicle
	<b>post:</b>the new cylinder capacity will be saved
	@param: cylinderCapacity
	**/
	public void setCylinderCapacity(int cylinderCapacity){
		this.cylinderCapacity = cylinderCapacity;
	}
	
	/*
	name: getMileage
	show the mileage of the vehicle
	<b>pre:</b>the mileage of the vehicle must be entered
	<b>post:</b>show the mileage of the vehicle saved in variable "mileage"
	**/
	public int getMileage(){
		return mileage;
	}
	
	/*
	name: setMileage
	allows entering a new mileage for the vehicle
	<b>post:</b>the new mileage will be saved
	@param: mileage
	**/
	public void setMileage(int mileage){
		this.mileage = mileage;
	}
	
	/*
	name: getType
	show the type of the vehicle
	<b>pre:</b>the type of the vehicle must be entered
	<b>post:</b>show the type of the vehicle saved in variable "type"
	**/
	public String getType(){
		return type;
	}
	
	/*
	name: setType
	allows entering a new type for the vehicle
	<b>post:</b>the new type will be saved
	@param: type
	**/
	public void setType(String type){
		this.type = type; 
	}
	
	/*
	name: getPlaque
	show the plaque of the vehicle
	<b>pre:</b>the plaque of the vehicle must be entered
	<b>post:</b>show the plaque of the vehicle saved in variable "plaque"
	**/
	public String getPlaque(){
		return plaque;
	}
	
	/*
	name: setPlaque
	allows entering a new plaque for the vehicle
	<b>post:</b>the new plaque will be saved
	@param: plaque
	**/
	public void setPlaque(String plaque){
		this.plaque = plaque;
	}
	
	/*
	name: getTypeVehicle
	show the type of the vehicle of the vehicle
	<b>pre:</b>the type of the vehicle of the vehicle must be entered
	<b>post:</b>show the type of the vehicle of the vehicle saved in variable "typeVehicle"
	**/
	public int getTypeVehicle(){
		return typeVehicle;
	}
	
	/*
	name: setTypeVehicle
	allows entering a new type of the vehicle for the vehicle
	<b>post:</b>the new type of the vehicle will be saved
	@param: typeVehicle
	**/
	public void setTypeVehicle(int typeVehicle){
		this.typeVehicle = typeVehicle;
	}
	
	/*
	name: getBasicInfo
	show the information of the vehicles 
	<b>pre:</b>there must be at least one vehicle entered 
	<b>post:</b>shows the main information of the vehicle object
	@return info
	**/
	public String getBasicInfo(){
		String info = "\nDueno del vehiculo: " + getOwner() + "\nPrecio de venta: " + getSalePrice() + "\nPrecio base: " + getBasePrice() + "\nMarca: " + getBrand() + "\nModelo: " + getModel() + "\nCilindraje: " + getCylinderCapacity() + "\nKilometraje: " + getMileage() + "\nTipo: " + getType() + "\nPlaca: " + getPlaque();
		return info;
	}
	
	/*
	name: addDocuments
	add a new document to the vehicle
	<b>post:</b>the new document of vehicle will be saved
	**/
	public void addDocuments(Documents doc){
		docs.add(doc);
	}
	
	/*
	name: getBasicInfo
	show the information of the vehicles 
	<b>pre:</b>there must be at least one vehicle entered 
	<b>post:</b>shows the main information of the vehicle object
	@return info
	**/
	public String getInfoDocs(){
		String info = "Informacion de documentos del vehiculo\n";
		for(int i = 0; i < docs.size(); i++){
			info += docs.get(i).getInfoDocs() + "\n";
		}
		return info;
	}
	
	public abstract String getConsume();
}
