package gui;


import java.util.Scanner;

public class Registration {

    public String VehicleModel ;
    public String VehicleEngineNumber;
    public String VehiclePurCity ;   //Purchsed City
    public String VehicleName;


    public void SetVehicleModel(String word){

        Scanner myobj = new Scanner(System.in); 

        System.out.println("Enter The Vehicle Model Number :                        ");
        
    
        VehicleModel = word;


        // System.out.println(VehicleModel);

    }
    
    public void SetVehicleEngineNumber(String word){

        Scanner myobj = new Scanner(System.in); 
        System.out.println("Enter the Engine Number :                       ");

        
        VehicleEngineNumber =word;
        //= myobj.nextLine();

        // System.out.println(VehicleEngineNumber);

    }
    
    public void SetVehiclePurchasedCity(String word){

        Scanner myobj = new Scanner(System.in); 
        System.out.println("Enter The Purchased City Name :                        ");

    
        VehiclePurCity =  word; //myobj.nextLine();

        // System.out.println(VehiclePurCity);
    }
    
    public void SetVehicleName(String word){

        Scanner myobj = new Scanner(System.in); 
        System.out.println("Enter The Vehicle Name :                        ");
 
        VehicleName = word ;//myobj.nextLine();

        // System.out.println(VehicleName);

    }
    
}
