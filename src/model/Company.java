package model;
import java.util.*;

public class Company{
	
	public final static int HIGH = 15;
	public final static int WIDTH = 5;
	public final static int YEAR = 2020;
	private String nameCompany; 
	private int nit, salesNumber;
	private double totalEarnings;
	public Seller seller [];
	public ArrayList<Vehicle> vehicles;
	public Vehicle parqueadero [][];
	
	/*
	name: Company
	Its the constructor of Company
	@param: nameCompany
	@param: nit
	@param: salesNumber
	@param: totalEarnings
	**/
	public Company (String nameCompany, int nit, int salesNumber, double totalEarnings){
		this.nameCompany = nameCompany;
		this.nit = nit; 
		this.salesNumber = salesNumber; 
		this.totalEarnings = totalEarnings; 
		seller = new Seller [10];
		vehicles = new ArrayList<Vehicle>();
		parqueadero = new Vehicle[HIGH][WIDTH];
	}
	
	/*
	name: getNameCompany
	show the name of the company
	<b>pre:</b>the name of the company must be entered
	<b>post:</b>show the name of the company saved in variable "nameCompany"
	**/
	public String getNameCompany(){
		return nameCompany;
	}
	
	/*
	name: setNameCompany
	allows entering a new name for the company
	<b>post:</b>the new name will be saved
	@param: nameCompany
	**/
	public void setNameCompany (String nameCompany){
		this.nameCompany = nameCompany;
	}
	
	/*
	name: getNit
	show the number of the nit
	<b>pre:</b>the number of the nit must be entered
	<b>post:</b>show the number of the company saved in variable "nit"
	**/
	public int getNit(){
		return nit;
	}
	
	/*
	name: setNit
	allows entering a new number of the nit
	<b>post:</b>the new nit will be saved
	@param: nit
	**/
	public void setNit(int nit){
		this.nit = nit;
	}
	
	/*
	name: getSalesNumber
	show the quantity of the sales 
	<b>pre:</b>the quantity of the sales must be entered
	<b>post:</b>show the quantity of the sales saved in variable "salesNumber"
	**/
	public int getSalesNumber(){
		return salesNumber;
	}
	
	/*
	name: setSalesNumber
	allows entering a new quantity of the sales
	<b>post:</b>the new sales will be saved
	@param: salesNumber
	**/
	public void setSalesNumber(int salesNumber){
		this.salesNumber = salesNumber; 
	}
	
	/*
	name: getTotalEarnings
	show the quantity of the total earnings
	<b>pre:</b>the quantity of the total earnings must be entered
	<b>post:</b>show the quantity of the total earnings saved in variable "totalEarnings"
	**/
	public double getTotalEarnings(){
		return totalEarnings;
	}
	
	/*
	name: setTotalEarnings
	allows entering a new quantity of the total earnings
	<b>post:</b>the new total earnings will be saved
	@param: totalEarnings
	**/
	public void setTotalEarnings(double totalEarnings){
		this.totalEarnings = totalEarnings;
	}
	
	/*
	name: addSeller
	allows entering a new Seller to the company
	<b>post:</b>the new Seller will be saved
	@param: nameSeller
	@param: lastNameSeller
	@param: identificationSeller
	@param: salesQuantity
	**/
	public void addSeller(String nameSeller,String lastNameSeller, int identificationSeller, int salesQuantity){
		Seller newSeller = new Seller( nameSeller, lastNameSeller, identificationSeller, salesQuantity);
		
		if(seller [0] != null && seller [1] != null && seller [2] != null && seller [3] != null && seller [4] != null && seller [5] != null && seller [6] != null && seller [7] != null && seller [8] != null && seller [9] != null){
				System.out.println("\n!ADVERTENCIA!");
				System.out.println("Ya hay la cantidad maxima de vendedores");
		}
		
		for(int i = 0; i < seller.length; i++){
			if(seller [i] == null){
				seller[i] = newSeller;
				i = 11;
			}
		}
	}
	
	/*
	name: getSeller
	call the seller you select
	<b>pre:</b>there must be a seller in the array
	<b>post:</b>gets the seller in a position to later see their attributes
	**/
	public Seller[] getSeller(){
		return seller;
	}
	
	/*
	name: addVehicle
	allows entering a new Vehicle to the company
	<b>post:</b>the new Vehicle will be saved
	@param: vehicle
	**/
	public void addVehicle(Vehicle vehicle){
		vehicles.add(vehicle);
	}
	
	/*
	name: getInfoVehicles
	show the all information of the vehicles 
	<b>pre:</b>there must be at least one vehicle entered
	<b>post:</b>shows the main information of the vehicle object
	@return info
	**/
	public String getInfoVehicles(){
		String info = "\nVEHICULOS DISPONIBLES\n\n";
		for(int i = 0; i < vehicles.size(); i++){
			if(vehicles.get(i).getOwner().equalsIgnoreCase(getNameCompany())){
				info += "\n\nVEHICULO NUMERO " + (i+1) + "\n" + "-----------------------------------------------\n" + vehicles.get(i).getBasicInfo() + "\n" + vehicles.get(i).getConsume() + "\n" + vehicles.get(i).getInfoDocs() + "\n";
			}
		}
		return info;
	}
	
	/*
	name: getInfoVehiclesModel
	show the all information of the vehicles of a specific model
	<b>pre:</b>there must be at least one vehicle entered
	<b>post:</b>displays the main information of the vehicle object with a specific model
	@return info
	**/
	public String getInfoVehiclesModel(int model){
		int num = 1;
		String info = "\nVEHICULOS DISPONIBLES\n\n";
		for(int i = 0; i < vehicles.size(); i++){
			if(vehicles.get(i).getOwner().equalsIgnoreCase(getNameCompany()) && vehicles.get(i).getModel() == model){
				info += "\n\nVEHICULO NUMERO " + num + "\n" + "-----------------------------------------------\n" + vehicles.get(i).getBasicInfo() + "\n" + vehicles.get(i).getConsume() + "\n" + vehicles.get(i).getInfoDocs() + "\n";
				num += 1;
			}
		}
		return info;
	}
	
	/*
	name: getInfoVehiclesModel
	show the all information of the vehicles of a specific price
	<b>pre:</b>there must be at least one vehicle entered
	<b>post:</b>displays the main information of the vehicle object with a specific price
	@return info
	**/
	public String getInfoVehiclesPrice(double price){
		int num = 1;
		String info = "\nVEHICULOS DISPONIBLES\n\n";
		for(int i = 0; i < vehicles.size(); i++){
			if(vehicles.get(i).getOwner().equalsIgnoreCase(getNameCompany()) && vehicles.get(i).getSalePrice() <= price){
				info += "\n\nVEHICULO NUMERO " + num + "\n" + "-----------------------------------------------\n" + vehicles.get(i).getBasicInfo() + "\n" + vehicles.get(i).getConsume() + "\n" + vehicles.get(i).getInfoDocs() + "\n";
				num += 1;
			}
		}
		return info;
	}
	
	/*
	name: getInfoVehiclesLessDocuments
	shows only vehicle information without documents
	<b>pre:</b>there must be at least one vehicle entered
	<b>post:</b>shows the main information of the vehicle object
	@return info
	**/
	public String getInfoVehiclesLessDocuments(){
		
		String info = "\nVEHICULOS DISPONIBLES\n\n";
		for(int i = 0; i < vehicles.size(); i++){
			if(vehicles.get(i).getOwner().equalsIgnoreCase(getNameCompany())){
				info += "\n\nVEHICULO NUMERO " + (i+1) + "\n" + "-----------------------------------------------\n" + vehicles.get(i).getBasicInfo() + "\n" + vehicles.get(i).getConsume() + "\n";
			}
		}
		return info;
	}
	
	/*
	name: getInfoVehiclesParking
	shows only the information of the vehicle located in the parking lot without the documents
	<b>pre:</b>there must be at least one vehicle entered
	<b>post:</b>shows the main information of the vehicle object stored in the parking lot
	@return info
	**/
	public String getInfoParking(){
		String info = "\nVEHICULO DEL PARQUEADERO\n\n";
		for(int i = 0; i < parqueadero.length; i++){
			for(int j = 0; j < parqueadero[i].length;j++){
				if(parqueadero[i][j] != null){
					info += "\n\nVEHICULO EN POSICION: " + i + "." + j + "\n" + "-----------------------------------------------\n" + parqueadero[i][j].getBasicInfo() + "\n" + parqueadero[i][j].getConsume() + "\n";
				}
			}
		}
		return info;
	}
}