package gui;

import java.util.Scanner;

public class Owner {
    

    public String OwnerCNIC; 
    public String OwnerName;
    public String OwnerFatherName;
    public String CarEngineNumber;
    public void SetOwnerCNIC(String word){
          
        Scanner myobj = new Scanner(System.in); 

        System.out.println("Enter Owner CNIC :                      ");
        OwnerCNIC = word; //myobj.nextLine();


        System.out.println(OwnerCNIC);


    }

    public void SetOwnnerName(String word){
          
        Scanner myobj = new Scanner(System.in); 
        System.out.println("Enter The Onwer Name :                       ");
        OwnerName = word ;//myobj.nextLine();


        System.out.println(OwnerName);


    }

    public void SetOwnerFatherName(String word){
          
        Scanner myobj = new Scanner(System.in); 
        System.out.println("Enter The Onwer Father Name :                        ");
        
        OwnerFatherName =  word;//myobj.nextLine();


        System.out.println(OwnerFatherName);


    }
    

    public void SetCarEngineNumber(String word){
          
        Scanner myobj = new Scanner(System.in); 
        System.out.println("Enter The Vehicel Engine Number :                        ");
        CarEngineNumber = word ;//myobj.nextLine();


        System.out.println(CarEngineNumber);


    }
    
    

}
