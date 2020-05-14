package ui;
import model.*;
import java.util.*;

public class Menu{

	private Scanner in = new Scanner(System.in);
	private final static int ADD_NEW_VEHICLE = 1;
	private final static int ADD_NEW_SELLER = 2;
	private final static int ADD_NEW_CLIENT_INTERESED = 3;
	private final static int NEW_VEHICLE_INTERESTED = 4;
	private final static int ADD_NEW_SALE = 5;
	private final static int UPDATE_PARKING_LOT = 6;
	private final static int SHOW_VEHICLE_PARKING = 7;
	private final static int PERSONAL_INFORMATION_SELLERS =8;
	private final static int MOSTRAR_VEHICULOS = 9;
	private final static int EXIT = 11;

	private boolean volver = true;
	private int cont;

	private String nameCompany;
	private int nit, salesNumber;
	private double totalEarnings;
	private Company company = new Company(nameCompany,nit,salesNumber,totalEarnings);

	/*
	name: informationPrincipal
	allows entering main information
	**/
	public void informationPrincipal(){
		String name;
		int ID;

		System.out.println("Ingrese el nombre de la compania");
		name = in.nextLine();
		company.setNameCompany(name);
		System.out.println("Ingrese el ID de la compania");
		ID = in.nextInt();
		company.setNit(ID);

		company.addSeller("Juan","Zorrilla",1007150034,0);
		company.addSeller("Benito","Camela",1928477782,0);
		company.addSeller("Alfonso","Bonilla",1938463726,0);
		company.addSeller("Juanito","Alimana",1294738264,0);
		company.addSeller("Pablo","Escobilla",1927365129,0);
		company.addSeller("Rosa","Garcia",1928364537,0);
		company.addSeller("Adonai","Restrepo",1192837263,0);
		company.addSeller("Ana","Cardenas",1293729302,0);
		company.addSeller("Mary","Melo",1928346253,0);
		company.addSeller("Sofia","Hidalgo",1918236523,0);
		cont = 9;

		Gasoline c1 = new Gasoline(company.getNameCompany(),90000000,90000000,"AUDI",2020,2000,100,"NUEVO","",1,"VAN",4,"POLARIZADAS","CARRO A GASOLINA",10,"CORRIENTE");
		MechanicalTechnician c1M2020 = new MechanicalTechnician(209045,2020,"219029783973",2196);
		SOAT c1S2020 = new SOAT (500000,2020,"123842873729",784525600);
		
		Electric c2 = new Electric(company.getNameCompany(),118800000,110000000,"MERCEDEZ",2018,2200,1000,"USADO","KMS253",1,"SEDAN",4,"POLARIZADAS","CARRO ELECTRIC0","RAPIDA",10);
		MechanicalTechnician c2M2018 = new MechanicalTechnician(200045,2018,"2192303442973",2196);
		SOAT c2S2018 = new SOAT (450000,2018,"123842345349",780525600);
		MechanicalTechnician c2M2019 = new MechanicalTechnician(203045,2019,"2192303442973",2196);
		SOAT c2S2019 = new SOAT (480600,2019,"123842345349",782525600);
		MechanicalTechnician c2M2020 = new MechanicalTechnician(205045,2020,"2192303442973",2196);
		SOAT c2S2020 = new SOAT (500000,2020,"123842345349",785525600);
		
		Hybrid c3 = new Hybrid(company.getNameCompany(),149500000,13000000,"AUDI",2020,2500,98,"NUEVO","",1,"VAN",4,"POLARIZADAS","CARRO HIBRIDO",12,"EXTRA","RAPIDA",6);
		MechanicalTechnician c3M2020 = new MechanicalTechnician(209045,2020,"31298783973",2196);
		SOAT c3S2020 = new SOAT (500000,2020,"2897363727",784525600);
		
		Motorcycle m1 = new Motorcycle(company.getNameCompany(),20384000,20000000,"KAWASAKI",2017,1000,5000,"USADO","KMS23R",2,"DEPORTIVA",6);
		MechanicalTechnician m1M2017 = new MechanicalTechnician(160342,2017,"64478523793283",2196);
		SOAT m1S2017 = new SOAT (306000,2017,"823979734773",600525600);
		MechanicalTechnician m1M2018 = new MechanicalTechnician(162342,2018,"64478523793283",2196);
		SOAT m1S2018 = new SOAT (318000,2018,"823979734773",600525600);
		MechanicalTechnician m1M2019 = new MechanicalTechnician(165342,2019,"64478523793283",2196);
		SOAT m1S2019 = new SOAT (330000,2019,"823979734773",600525600);
		MechanicalTechnician m1M2020 = new MechanicalTechnician(170342,2020,"64478523793283",2196);
		SOAT m1S2020 = new SOAT (350000,2020,"823979734773",600525600);
		
		company.addVehicle(c1);
		company.vehicles.get(0).addDocuments(c1M2020);
		company.vehicles.get(0).addDocuments(c1S2020);
		
		company.addVehicle(c2);
		company.vehicles.get(1).addDocuments(c2M2018);
		company.vehicles.get(1).addDocuments(c2S2018);
		company.vehicles.get(1).addDocuments(c2M2019);
		company.vehicles.get(1).addDocuments(c2S2019);
		company.vehicles.get(1).addDocuments(c2M2020);
		company.vehicles.get(1).addDocuments(c2S2020);
		
		company.addVehicle(c3);
		company.vehicles.get(2).addDocuments(c3M2020);
		company.vehicles.get(2).addDocuments(c3S2020);
		
		company.addVehicle(m1);
		company.vehicles.get(3).addDocuments(m1M2017);
		company.vehicles.get(3).addDocuments(m1S2017);
		company.vehicles.get(3).addDocuments(m1M2018);
		company.vehicles.get(3).addDocuments(m1S2018);
		company.vehicles.get(3).addDocuments(m1M2019);
		company.vehicles.get(3).addDocuments(m1S2019);
		company.vehicles.get(3).addDocuments(m1M2020);
		company.vehicles.get(3).addDocuments(m1S2020);
		
	}

	/*
	name: menu
	allows you to choose an action to take
	**/
	public void menu(){
		int option;

		System.out.println("\n================================");
		System.out.println("||Bienvenido a " + company.getNameCompany() + "||");
		System.out.println("================================");
		System.out.println("\nQue opcion desea realizar");
		System.out.println("\n(1) Ingresar un nuevo vehiculo al consesionario");
		System.out.println("\n(2) Ingresar un nuevo vendedor");
		System.out.println("\n(3) Ingresar un nuevo cliente a algun vendedor");
		System.out.println("\n(4) Ingresar algun nuevo interes de un vehiculo");
		System.out.println("\n(5) Ingresar una venta nueva realizada por algun vendedor");
		System.out.println("\n(6) Actualizar parqueadero");
		System.out.println("\n(7) Mostrar vehiculos del parqueadero");
		System.out.println("\n(8) Mostrar informacion personal vendedores, junto con sus clientes interesados");
		System.out.println("\n(9) Mostrar carros disponibles (SOLO AQUI PODRA VER LOS DOCUMENTOS DE LOS VEHICULOS)");
		System.out.println("\n(10) Mostrar el total  y numero de las ventas");
		System.out.println("\n(11) Salir");
		option = in.nextInt();


		switch(option){

			case ADD_NEW_VEHICLE:
				addNewVehicle();
			break;

			case ADD_NEW_SELLER:
				addNewSeller();
			break;

			case ADD_NEW_CLIENT_INTERESED:
				addClient();
			break;

			case NEW_VEHICLE_INTERESTED:
				addNewVehicleInterested();
			break;

			case ADD_NEW_SALE:
				addNewSale();
			break;
			
			case UPDATE_PARKING_LOT:
				UpdateParking();
			break;

			case SHOW_VEHICLE_PARKING:
				showVehiclesParking();
			break;
			
			case PERSONAL_INFORMATION_SELLERS:
				mostrarVendedores();
			break;

			case MOSTRAR_VEHICULOS:
				mostrarVehiculos();
			break;
			
			case 10:
				infoCompany();
			break;
			
			case EXIT:
				volver = false;
			break;
			
		}
	}

	/*
	name: infoCompany
	allows you to view company information
	**/
	public void infoCompany(){
		System.out.println("Valor total de ventas: " + company.getTotalEarnings());
		System.out.println("Numero de ventas: " + company.getSalesNumber());
	}
	
	/*
	name: addCompany
	allows to enter a new customer
	**/
	public void addClient(){
		String nameClient, lastNameClient, mail, phoneNumber, identificationClient;
		int numberSeller;

		System.out.println("Ingrese el nombre del cliente");
		in.nextLine();
		nameClient = in.nextLine();
		System.out.println("Ingrese el apellido del cliente");
		lastNameClient = in.nextLine();
		System.out.println("Ingrese la cedula del cliente");
		identificationClient = in.nextLine();
		System.out.println("Ingrese el numero telefonico del cliente");
		phoneNumber = in.nextLine();
		System.out.println("Ingrese el mail del cliente");
		mail = in.nextLine();

		System.out.println("\nIngrese el numero del asesor comercial que atendera a este cliente");
		for(int i = 0; i < company.seller.length ;i++){
			if(company.getSeller()[i].getClient()[0] == null || company.getSeller()[i].getClient()[1] == null || company.getSeller()[i].getClient()[2] == null || company.getSeller()[i].getClient()[3] == null || company.getSeller()[i].getClient()[4] == null){
				System.out.println("El vendedor numero: " + (i+1) + " llamado " + company.getSeller()[i].getNameSeller() + " " + company.getSeller()[i].getLastNameSeller());
			}
		} 
		numberSeller = in.nextInt();

		Client newClient = new Client(nameClient, lastNameClient, identificationClient, phoneNumber, mail);
		company.getSeller()[numberSeller-1].addClient(newClient);

	}

	/*
	name: addNewVehicleInterested
	allows to enter a new vehicle interest to a customer
	**/
	public void addNewVehicleInterested(){
		int numSeller, numClient, numVehicle, count = 0;

		do{
			System.out.println("Quien de los sigueintes es el asesor comercial del cliente");
			for(int i = 0; i < company.seller.length; i++){
				System.out.println("(" + (i+1) + ") " + company.getSeller()[i].getNameSeller() + " " + company.getSeller()[i].getLastNameSeller());
			}
			numSeller = in.nextInt();
		}while(numSeller > 10);

		do{
			System.out.println("Ingrese el numero del cliente interesado");
			for(int i = 0; i < company.getSeller()[numSeller-1].client.length; i++){
				if(company.getSeller()[numSeller-1].getClient()[i] != null){
					System.out.println("(" + (i+1) +") " + company.getSeller()[numSeller-1].getClient()[i].getNameClient() + " " + company.getSeller()[numSeller-1].getClient()[i].getLastNameClient());
					count += 1;
				}
			}if(company.getSeller()[numSeller-1].getClient()[0] == null && company.getSeller()[numSeller-1].getClient()[1] == null && company.getSeller()[numSeller-1].getClient()[2] == null && company.getSeller()[numSeller-1].getClient()[3] == null && company.getSeller()[numSeller-1].getClient()[4] == null){
				System.out.println("No hay clientes ingresados para este vendedor");
			}
			numClient = in.nextInt();
		}while(numClient > count);

		System.out.println(company.getInfoVehiclesLessDocuments());

		System.out.println("Ingrese el numero del vehiculo que le intereso");
		numVehicle = in.nextInt();

		Vehicle newInterestedVehicles = company.vehicles.get(numVehicle-1);
		company.getSeller()[numSeller-1].getClient()[numClient-1].addInterestedVehicles(newInterestedVehicles);
	}

	/*
	name: addNewVehicle
	allows to enter a new vehicle to the list
	**/
	public void addNewVehicle(){
		int n = 1;
		double salePrice,basePrice;
		String brand,plaque = "",type = "", owner;
		int model, cylinderCapacity, mileage, typeVehicle;

		owner = company.getNameCompany();
		salePrice = 0;
		System.out.println("Ingrese el precio base");
		basePrice = in.nextDouble();
		System.out.println("Ingrese la marca del vehiculo");
		in.nextLine();
		brand = in.nextLine();
		System.out.println("Ingrese el modelo del vehiculo");
		model = in.nextInt();
		System.out.println("Ingrese el cilindraje del vehiculo");
		cylinderCapacity = in.nextInt();
		System.out.println("Ingrese el kilometraje del vehiculo");
		mileage = in.nextInt();

		while (n == 1){
		System.out.println("Indique que tipo de vehiculo es: \ningrese N si el vehiculo es nuevo \ningrese U si es usado");
		in.nextLine();
		type = in.nextLine();
			if(type.equalsIgnoreCase("N")){
				type = "NUEVO";
				plaque = "";
				n = 0;
			}else if(type.equalsIgnoreCase("U")){
				type = "USADO";
				System.out.println("Ingrese la placa del vehiculo");
				plaque = in.nextLine();
				n = 0;
			}else{
				System.out.println("Ingrese un tipo de vehiculo valido");
			}
		}
		System.out.println("Ingrese que tipo de vehiculo: \n(1) si el vehiculo es un carro \n(2) si el vehiculo es una moto");
		typeVehicle = in.nextInt();
		if(typeVehicle == 1){
			car(owner,salePrice, basePrice, brand, model, cylinderCapacity, mileage, type, plaque, typeVehicle);
		}else if(typeVehicle == 2){
			motorcycle(owner,salePrice, basePrice, brand, model, cylinderCapacity, mileage, type, plaque, typeVehicle);
		}
	}
	
	/*
	name: randomDocuments
	Allows you to create random documents from information
	**/
	public void randomDocuments(int model){
		double price, gas = 0, accidents = 0; 
		double p = 0, g = 0, a = 0;
		String codeS = "", codeR = "";
		int [][] image;
		int year, pos, docs2020;
		
		
		Random ran = new Random();
		
		image = new int [Documents.HIGH][Documents.WIDTH];
		
		pos = company.vehicles.size()-1;
		
		for(int i = model;i < company.YEAR; i++){
			if(i == model){				
				System.out.println("Ingrese el precio del documento del ano " + i);
				price = in.nextDouble();
				System.out.println("Ingrese la cantidad de gases toxicos que emite el carro por litro en el ano " + i);
				gas = in.nextDouble();
				System.out.println("Ingrese el monto de cobertura en accidentes del ano " + i);
				accidents = in.nextDouble();
				p = price;
				g = gas;
				a = accidents;
				
			}else{
				price = p + (p*0.1);
				gas = g + (g*0.01);
				accidents = a + (a*0.02);
				p = price;
				g = gas;
				a = accidents;
			}
			
			year = i;	
			
			for(int j = 0; j < Documents.HIGH; j++){
				for(int k = 0; k < Documents.WIDTH; k++){
					int value = ran.nextInt(100);
					image[j][k] = value; 
				}
			}
			
			for(int j = 0; j < image.length ; j++){
				codeS += image[j][0] + " ";
			}
			for(int j = 1; j < image.length ; j++){
				codeS += image[4][j] + " ";
			}
			
			for(int j = 0; j < image.length ; j++){
				codeR += image[1][j] + " ";
			}
			for(int j = 1; j < image.length ; j++){
				codeR += image[j][Documents.WIDTH-1-j] + " ";
			}
			for(int j = 1; j < image.length ; j++){
				codeR += image[4][j] + " ";
			}
			
			MechanicalTechnician newMechanical = new MechanicalTechnician (price, year, codeR, gas);
			
			SOAT newSOAT = new SOAT (price, year, codeS, accidents);
			
			company.vehicles.get(pos).addDocuments(newSOAT);
			company.vehicles.get(pos).addDocuments(newMechanical);
			codeR = "";
			codeS = "";
		}
		
		System.out.println("Desea ingresar los documentos del 2020\n(1)SI \n(2)NO");
		docs2020= in.nextInt();
		if(docs2020 == 1){
			System.out.println("Ingrese el precio del documento del ano 2020");
			price = in.nextDouble();
			System.out.println("Ingrese la cantidad de gases toxicos que emite el carro por litro en el ano 2020");
			gas = in.nextDouble();
			System.out.println("Ingrese el monto de cobertura en accidentes del ano 2020");
			accidents = in.nextDouble();
			year = 2020;
			for(int j = 0; j < Documents.HIGH; j++){
				for(int k = 0; k < Documents.WIDTH; k++){
					int value = ran.nextInt(100);
					image[j][k] = value; 
				}
			}
			
			for(int j = 0; j < image.length ; j++){
				codeS += image[j][0] + " ";
			}
			for(int j = 1; j < image.length ; j++){
				codeS += image[4][j] + " ";
			}
			
			for(int j = 0; j < image.length ; j++){
				codeR += image[1][j] + " ";
			}
			for(int j = 1; j < image.length ; j++){
				codeR += image[j][Documents.WIDTH-1-j] + " ";
			}
			for(int j = 1; j < image.length ; j++){
				codeR += image[4][j] + " ";
			}
			
			MechanicalTechnician newMechanical = new MechanicalTechnician (price, year, codeR, gas);
			
			SOAT newSOAT = new SOAT (price, year, codeS, accidents);
			
			company.vehicles.get(pos).addDocuments(newSOAT);
			company.vehicles.get(pos).addDocuments(newMechanical);
		}
		
	}
	
	/*
	name: car
	allows entering the information of a car
	**/
	public void car(String owner,double salePrice, double basePrice, String brand, int model, int cylinderCapacity, int mileage, String type, String plaque, int typeVehicle){
		String classCar = "", typeCar = "", windows = "";
		int doorsNumber, num1, num2, num3;

		do{
		System.out.println("Ingrese que clase de carro es:\n(1) Sedan \n(2) Van");
		num1 = in.nextInt();

			if(num1 == Car.SEDAN){
				classCar = "SEDAN";
			}else if(num1 == Car.VAN){
				classCar = "VAN";
			}else{
				System.out.println("Ingrese un numero valido");
			}
		}while(num1 > 2);

		System.out.println("Ingrese el numero de puertas del carro");
		doorsNumber = in.nextInt();

		do{
		System.out.println("Ingrese el tipo de ventanas:\n(1) Polarizada\n(2) No polarizada");
		num2 = in.nextInt();

			if(num2 == Car.POLARIZED){
				windows = "POLARIZADAS";
			}else if(num2 == Car.NOT_POLARIZED){
				windows = "NO POLARIZADAS";
			}else{
				System.out.println("Ingrese un numero valido");
			}
		}while(num2 > 2);

		do{
		System.out.println("Ingrese que tipo de carro es:\n(1) si es un vehiculo a gasolina\n(2) si es un vehiculo electrico \n(3) si es un vehiculo hibrido");
		num3 = in.nextInt();

			if(num3 == Car.GASOLINE){
				typeCar = "CARRO A GASOLINA";
				gasoline(owner,salePrice, basePrice, brand, model, cylinderCapacity, mileage, type, plaque, typeVehicle, classCar, doorsNumber, windows, typeCar);
			}else if(num3 == Car.ELECTRIC){
				typeCar = "CARRO ELECTRICO";
				electric(owner,salePrice, basePrice, brand, model, cylinderCapacity, mileage, type, plaque, typeVehicle, classCar, doorsNumber, windows, typeCar);
			}else if(num3 == Car.HYBRID){
				typeCar = "CARRO HIBRIDO";
				hybrid(owner,salePrice, basePrice, brand, model, cylinderCapacity, mileage, type, plaque, typeVehicle, classCar, doorsNumber, windows, typeCar);
			}else{
				System.out.println("ADVERTENCIA\n ingrese un tipo de carro existente");
			}
		}while(num3 > 3);
		randomDocuments(model);
	}

	/*
	name: gasoline
	allows entering the information of a gasoline car
	**/
	public void gasoline(String owner,double salePrice, double basePrice, String brand, int model, int cylinderCapacity, int mileage, String type, String plaque, int typeVehicle, String classCar, int doorsNumber, String windows, String typeCar){
		boolean p = false;
		int tankCapacity;
		String typeGasoline = "";

		System.out.println("Ingrese la capacidad del tanque");
		tankCapacity = in.nextInt();

		while(p == false){
			System.out.println("Ingrese el tipo de gasolina que usa el vehiculo\nDigite C para corriente\nDigite D para diesel");
			in.nextLine();
			typeGasoline = in.nextLine();
			if(typeGasoline.equalsIgnoreCase("c")){
				typeGasoline = "CORRIENTE";
				p = true;
			}else if(typeGasoline.equalsIgnoreCase("d")){
				typeGasoline = "DIESEL";
				p = true;
			}else{
				System.out.println("!ADVERTENCIA!\nIngrese un tipo de gasolina valido");
			}
		}

		salePrice = basePrice;
		
		if(type.equalsIgnoreCase("usado")){
			salePrice = salePrice - (salePrice*0.1);
		}
		
		Gasoline carGasoline = new Gasoline(owner,salePrice, basePrice, brand, model, cylinderCapacity, mileage, type, plaque, typeVehicle, classCar, doorsNumber, windows, typeCar, tankCapacity, typeGasoline);
		company.addVehicle(carGasoline);
	}

	/*
	name: gasoline
	allows entering the information of a electric car
	**/
	public void electric(String owner,double salePrice, double basePrice, String brand, int model, int cylinderCapacity, int mileage, String type, String plaque, int typeVehicle, String classCar, int doorsNumber, String windows, String typeCar){
		int num1;
		String typeCharger = "";
		double batteryLife;

		do{
			System.out.println("Ingrese el tipo de cargador: \n(1) Cargador rapido\n(2) Cargador normal");
			num1 = in.nextInt();

			if(num1 == 1){
				typeCharger = "RAPIDO";
			}else if(num1 == 2){
				typeCharger = "NORMAL";
			}else{
				System.out.println("!ADVERTENCIA!\nIngrese un tipo de cargador valido");
			}
		}while(num1 > 2);

		System.out.println("Ingrese la vida de su bateria por km");
		batteryLife = in.nextDouble();
		
		salePrice = basePrice + (basePrice * 0.2);
		
		if(type.equalsIgnoreCase("usado")){
			salePrice = salePrice - (salePrice*0.1);
		}

		Electric carElectric = new Electric(owner,salePrice, basePrice, brand, model, cylinderCapacity, mileage, type, plaque, typeVehicle, classCar, doorsNumber, windows, typeCar, typeCharger, batteryLife);
		company.addVehicle(carElectric);
		randomDocuments(model);

	}

	/*
	name: hybrid
	allows entering the information of a hybrid car
	**/
	public void hybrid(String owner,double salePrice, double basePrice, String brand, int model, int cylinderCapacity, int mileage, String type, String plaque, int typeVehicle, String classCar, int doorsNumber, String windows, String typeCar){
		boolean p = false;
		int tankCapacity,num1;
		String typeGasoline = "", typeCharger = "";
		double batteryLife;

		System.out.println("Ingrese la capacidad del tanque");
		tankCapacity = in.nextInt();

		while(p == false){
			System.out.println("Ingrese el tipo de gasolina que usa el vehiculo\nDigite C para corriente\nDigite D para diesel");
			in.nextLine();
			typeGasoline = in.nextLine();
			if(typeGasoline.equalsIgnoreCase("c")){
				typeGasoline = "CORRIENTE";
				p = true;
			}else if(typeGasoline.equalsIgnoreCase("d")){
				typeGasoline = "DIESEL";
				p = true;
			}else{
				System.out.println("!ADVERTENCIA!\nIngrese un tipo de gasolina valido");
			}
		}

		do{
			System.out.println("Ingrese el tipo de cargador: \n(1) Cargador rapido\n(2) Cargador normal");
			num1 = in.nextInt();

			if(num1 == 1){
				typeCharger = "RAPIDO";
			}else if(num1 == 2){
				typeCharger = "NORMAL";
			}else{
				System.out.println("!ADVERTENCIA!\nIngrese un tipo de cargador valido");
			}
		}while(num1 > 2);

		System.out.println("Ingrese la vida de su bateria por km");
		batteryLife = in.nextDouble();
		
		salePrice = basePrice + (basePrice * 0.15);
		
		if(type.equalsIgnoreCase("usado")){
			salePrice = salePrice - (salePrice*0.1);
		}

		Hybrid carHybrid = new Hybrid(owner,salePrice, basePrice, brand, model, cylinderCapacity, mileage, type, plaque, typeVehicle, classCar, doorsNumber, windows, typeCar, tankCapacity, typeGasoline, typeCharger, batteryLife);
		company.addVehicle(carHybrid);
		randomDocuments(model);
	}

	/*
	name: motorcycle
	allows entering the information of a motorcycle
	**/
	public void motorcycle(String owner,double salePrice, double basePrice, String brand, int model, int cylinderCapacity, int mileage, String type, String plaque, int typeVehicle){
		int number;
		String typeMotorcycle = "";
		double capacityGasoline, consumeGasoline;

		do{
		System.out.println("Ingrese el tipo de moto: \n(1) si es ESTANDAR\n(2) si es DEPORTIVA\n(3) si es SCOOTER \n(4) si es CROOS");
		number = in.nextInt();

			if(number == Motorcycle.ESTANDAR){
				typeMotorcycle = "ESTANDAR";
			}else if(number == Motorcycle.DEPORTIVA){
				typeMotorcycle = "DEPORTIVA";
			}else if(number == Motorcycle.SCOOTER){
				typeMotorcycle = "SCOOTER";
			}else if(number == Motorcycle.CROOS){
				typeMotorcycle = "CROOS";
			}else{
				System.out.println("Ingrese un numero valido");
			}
		}while(number > 4);

		System.out.println("Ingrese la capacidad del tanque de la moto");
		capacityGasoline = in.nextDouble();

		salePrice = basePrice + (basePrice * 0.04);
		
		if(type.equalsIgnoreCase("usado")){
			salePrice = salePrice - (salePrice*0.01);
		}

		Motorcycle moto = new Motorcycle(owner,salePrice, basePrice, brand, model, cylinderCapacity, mileage, type, plaque, typeVehicle,typeMotorcycle, capacityGasoline);
		company.addVehicle(moto);
		randomDocuments(model);
	}

	/*
	name: updateParking
	allows updating the parking lot
	**/
	public void UpdateParking(){
		int contC1 = 0, contC2 = 0, contC3 = 0, contC4 = 0, contC5 = 0;
		
		for(int i = 0; i < company.vehicles.size(); i++){
			if(company.vehicles.get(i).getModel() == 2014 && company.vehicles.get(i).getType().equalsIgnoreCase("usado")){
				for(int j = 0; j < company.parqueadero.length; j++){
					if(company.parqueadero[j][0] == null){
						company.parqueadero[j][0] = company.vehicles.get(i);
						break;
					}
				}
			}
		}
		for(int i = 0; i < company.vehicles.size(); i++){
			if(company.vehicles.get(i).getModel() == 2013 && company.vehicles.get(i).getType().equalsIgnoreCase("usado")){
				for(int j = 0; j < company.parqueadero.length; j++){
					if(company.parqueadero[j][1] == null){
						company.parqueadero[j][1] = company.vehicles.get(i);
						break;
					}
				}
			}
		}
		for(int i = 0; i < company.vehicles.size(); i++){
			if(company.vehicles.get(i).getModel() == 2012 && company.vehicles.get(i).getType().equalsIgnoreCase("usado")){
				for(int j = 0; j < company.parqueadero.length; j++){
					if(company.parqueadero[j][2] == null){
						company.parqueadero[j][2] = company.vehicles.get(i);
						break;
					}
				}
			}
		}
		for(int i = 0; i < company.vehicles.size(); i++){
			if(company.vehicles.get(i).getModel() == 2011 && company.vehicles.get(i).getType().equalsIgnoreCase("usado")){
				for(int j = 0; j < company.parqueadero.length; j++){
					if(company.parqueadero[j][3] == null){
						company.parqueadero[j][3] = company.vehicles.get(i);
						break;
					}
				}
			}
		}
		for(int i = 0; i < company.vehicles.size(); i++){
			if(company.vehicles.get(i).getModel() <= 2010 && company.vehicles.get(i).getType().equalsIgnoreCase("usado")){
				for(int j = 0; j < company.parqueadero.length; j++){
					if(company.parqueadero[j][4] == null){
						company.parqueadero[j][4] = company.vehicles.get(i);
						break;
					}
				}
			}
		}
		for(int i = 0; i < company.parqueadero.length; i++){
			if(company.parqueadero[i][0] != null){
				contC1 += 1;
			}
			if(contC1 == 15){
				System.out.println("No hay parqueaderos disponibles para los vehiculos del 2014");
			}
		}
		for(int i = 0; i < company.parqueadero.length; i++){
			if(company.parqueadero[i][1] != null){
				contC2 += 1;
			}
			if(contC2 == 15){
				System.out.println("No hay parqueaderos disponibles para los vehiculos del 2013");
			}
		}
		for(int i = 0; i < company.parqueadero.length; i++){
			if(company.parqueadero[i][2] != null){
				contC3 += 1;
			}
			if(contC3 == 15){
				System.out.println("No hay parqueaderos disponibles para los vehiculos del 2012");
			}
		}
		for(int i = 0; i < company.parqueadero.length; i++){
			if(company.parqueadero[i][3] != null){
				contC4 += 1;
			}
			if(contC4 == 15){
				System.out.println("No hay parqueaderos disponibles para los vehiculos del 2011");
			}
		}
		for(int i = 0; i < company.parqueadero.length; i++){
			if(company.parqueadero[i][4] != null){
				contC5 += 1;
			}
			if(contC5 == 15){
				System.out.println("No hay parqueaderos disponibles para los vehiculos menores del 2011");
			}
		}
		contC1 = 0;
		contC2 = 0;
		contC3 = 0;
		contC4 = 0;
		contC5 = 0;
	}

	/*
	name: showVehiclesParking
	allows to see the information of the vehicles in the parking lot
	**/
	public void showVehiclesParking(){
		System.out.println(company.getInfoParking());
	}

	/*
	name: addNewSeller
	allows to add a new seller
	**/
	public void addNewSeller(){
		String nameSeller, lastName;
		int ID, salesQuantity;
		salesQuantity = 0;

		System.out.println("\nIngrese el nombre del vendedor");
		in.nextLine();
		nameSeller = in.nextLine();
		System.out.println("Ingrese los apellidos del vendedor");
		lastName = in.nextLine();
		System.out.println("Ingrese la cedula del vendedor");
		ID = in.nextInt();

		if(cont < 9){
			cont += 1;
		}else{
			cont += 0;
		}

		System.out.println("\n" + cont);


		company.addSeller(nameSeller, lastName, ID, salesQuantity);
	}

	/*
	name: mostrarVendedores
	allows seller to be displayed along with their information	
	**/
	public void mostrarVendedores(){
		for(int i = 0; i <= cont; i++){
			if(company.getSeller()[i] != null){
				System.out.println("\n-----------------------------------");
				System.out.println("Vendedor numero: " + (i+1));
				System.out.println("Nombre: " + company.getSeller()[i].getNameSeller());
				System.out.println("Apellido: " + company.getSeller()[i].getLastNameSeller());
				System.out.println("Identificacion: " + company.getSeller()[i].getIdentificationSeller());
				System.out.println("Numero de ventas: " + company.getSeller()[i].getSalesQuantity());

				for(int j = 0; j < company.getSeller()[i].client.length; j++){
					if(company.getSeller()[i].getClient()[j] != null){
						System.out.println("\nCLIENTE A CARGO NUMERO: " + (j+1));
						System.out.println("Nombre del cliente: " + company.getSeller()[i].getClient()[j].getNameClient());
						System.out.println("Apellido del cliente: " + company.getSeller()[i].getClient()[j].getLastNameClient());
						System.out.println("Cedula del cliente: " + company.getSeller()[i].getClient()[j].getIdentificationClient());
						System.out.println("Numero telefonico del cliente: " + company.getSeller()[i].getClient()[j].getPhoneNumber());
						System.out.println("Mail del cliente: " + company.getSeller()[i].getClient()[j].getMail());

						for(int k = 0; k < company.getSeller()[i].getClient()[j].interestedVehicles.size(); k++){
							System.out.println("\nVEHICULOS EN LOS QUE ESTA INTERESADO EL CLIENTE " + (j+1));
							System.out.println("\nVEHICULO NUMERO " + (k+1));
							System.out.println(company.getSeller()[i].getClient()[j].getInterestedVehicles().get(k).getBasicInfo());
						}
					}
				}
			}
		}
	}

	/*
	name: mostrarVehiculos
	allows to show the vehicles together with their information	
	**/
	public void mostrarVehiculos(){
		int filter; 
		
		System.out.println("Que vehiculos desea ver?\n(1) todos los vehiculos\n(2) un modelo en especifico\n(3) Con un precio igual o menor");
		filter = in.nextInt();
		if(filter == 1){
			System.out.println(company.getInfoVehicles());
		}else if(filter == 2){
			int model;
			System.out.println("Ingrese el el modelo que desea consultar");
			model = in.nextInt();
			System.out.println(company.getInfoVehiclesModel(model));
		}else if(filter == 3){
			double price;
			System.out.println("Ingrese el el precio que desea consultar");
			price = in.nextDouble();
			System.out.println(company.getInfoVehiclesPrice(price));
		}
		
		
	}

	/*
	name: addNewSale
	allows to add a new seller
	**/
	public void addNewSale(){
		int numSeller = 0, numClient, numVehicle,promAditional,porcentaje, sales = 0;
		String  info = "";
		double newPrice;
		
		System.out.println("Cual de los siguientes es el asesor comercial? Ingrese su respectivo numero");
		for(int i = 0; i < company.seller.length; i++){
			System.out.println("(" + (i+1) + ") " + company.getSeller()[i].getNameSeller());
		}
		numSeller = in.nextInt();
		System.out.println("Cual es el cliente que desea realizar la compra?");
		for(int i = 0; i < company.getSeller()[numSeller-1].client.length; i++){
			if(company.getSeller()[numSeller-1].getClient()[i] != null){
				System.out.println("(" + (i+1) + ") " + company.getSeller()[numSeller-1].getClient()[i].getNameClient());
			}
		}
		numClient = in.nextInt();
		
		System.out.println("Que vehiculo desea comprar? Ingrese su respectivo numero");
		for(int i = 0; i < company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.size(); i++){
			info += "Vehiculo de interes numero " + (i+1) + company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(i).getBasicInfo() + "\n" + company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(i).getConsume()+ "\n" + "\n";
		}
		System.out.println(info);
		numVehicle = in.nextInt();	
		
		System.out.println("Desea agregarle un descuento adicional? \n(1) Si \n(2) No");
		promAditional = in.nextInt();
		
		if(promAditional == 1){
			System.out.println("ingrese el porcentaje del descuento adicional");
			porcentaje = in.nextInt();
			for(int i = 0; i < company.vehicles.size();i++){
				if(company.vehicles.get(i).getSalePrice() == company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(numVehicle-1).getSalePrice() && company.vehicles.get(i).getBrand() == company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(numVehicle-1).getBrand() && company.vehicles.get(i).getCylinderCapacity() == company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(numVehicle-1).getCylinderCapacity()){
					newPrice = company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(numVehicle-1).getSalePrice();
					newPrice = newPrice - (newPrice * (porcentaje/100));
					company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(numVehicle-1).setSalePrice(newPrice);
					company.vehicles.get(i).setSalePrice(newPrice);
				}
			}
		}
		
		int latestDoc = 0;
		for(int i = 0; i < company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(numVehicle-1).docs.size(); i++){
			if(company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(numVehicle-1).docs.get(i).getYear() == 2020){
				latestDoc += 1;
			}
		}

		if(latestDoc == 0){
			newPrice = company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(numVehicle-1).getSalePrice();
			newPrice = newPrice + 500000;
			company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(numVehicle-1).setSalePrice(newPrice);
		}
		
		if(company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(numVehicle-1).getPlaque().equalsIgnoreCase("")){
			String newPlaque;
			System.out.println("Ingrese la placa que tendra el vehiculo");
			in.nextLine();
			newPlaque = in.nextLine();
			company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(numVehicle-1).setPlaque(newPlaque);
		}
		
		for(int i = 0; i < company.vehicles.size();i++){
			if(company.vehicles.get(i).getSalePrice() == company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(numVehicle-1).getSalePrice() && company.vehicles.get(i).getBrand() == company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(numVehicle-1).getBrand() && company.vehicles.get(i).getCylinderCapacity() == company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(numVehicle-1).getCylinderCapacity()){
				int newNum = company.getSalesNumber();
				newNum = newNum +1;
				String name = company.getSeller()[numSeller-1].getClient()[numClient-1].getNameClient();
				company.vehicles.get(i).setOwner(name);
				company.getSeller()[numSeller-1].increaseSales();
				company.setSalesNumber(newNum);
				company.setTotalEarnings(company.getSeller()[numSeller-1].getClient()[numClient-1].interestedVehicles.get(numVehicle-1).getSalePrice());
			}
		}
	}

	/*
	name: startProgram
	start the program
	**/
	public void startProgram(){
		informationPrincipal();
		while(volver == true){
			menu();
		}

	}
}