package gui;

//package Codes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.crypto.Data;
import javax.xml.transform.stream.StreamSource;

import java.util.Scanner;



//import jdk.vm.ci.meta.JavaKind;
//
/**
* Index
*/
public class Index {



 public String Get_Calculate_Fee(){
  
     //creating the object of Calculate 
     //where this object will calculate the fee

     CalculateFee Obj_Calculate_fee = new CalculateFee();
     String ret_str = "Registration Fee "+ Obj_Calculate_fee.Get_TOF_fee() + "\n" + "OwnerShipment  Fee "+ Obj_Calculate_fee.Get_Ownership_Fee() + "\n"  + "Invoice Fee "+ Obj_Calculate_fee.GetInvoiceFee() + "\n" + "Filer Fee "+ Obj_Calculate_fee.GetFilerfee() + "\n" + "Non Filer Fee "+ Obj_Calculate_fee.GetNonFilerFee() ;
     return ret_str;  
 }
 /*
 public int GiveTotalfee(){
     int total;
     CalculateFee Obj_Calculate_fee = new CalculateFee();
     
     total = Obj_Calculate_fee.Get_TOF_fee() + Obj_Calculate_fee.Get_Ownership_Fee() + Obj_Calculate_fee.GetInvoiceFee() + Obj_Calculate_fee.GetFilerfee() + Obj_Calculate_fee.GetNonFilerFee();
     return total;

 }
 */

 public void NewCar() throws IOException {



         // this object take the data from the user 
         // save save into the specific pattern in list
         // and writing in the CSV file
         Registration Obj_Registration = new Registration();


         // this object will take the info from the Invoice 
         // datails  and save into the files
         

         //this object get the Data from the Owner class
         Owner Obj_Owner = new Owner();

         // FilerNonFiler Obj_Filer = new FilerNonFiler();
         


         Invoice Obj_Invoice =  new Invoice();



                             
         System.out.println("pressed 1");



         
         // 1 for the New Car 

         //  getting Data from the Registration classs
         System.out.println("Please Enter the Registration Details \n \n \n                    ");

//         Obj_Registration.SetVehicleName();
//         Obj_Registration.SetVehicleModel();
//         Obj_Registration.SetVehiclePurchasedCity();
//         Obj_Registration.SetVehicleEngineNumber();


         //getting input the from the Invoice classs
         System.out.println("Enter the InVoice Details \n \n \n                     ");
//         Obj_Invoice.SetCarDetail();
//         Obj_Invoice.SetInvoiceNumber();
//         Obj_Invoice.SetShowroomName();
//         Obj_Invoice.SetShowroomNumber();
//         Obj_Invoice.SetShowroomCity();



         // calling the method of OWner Class this will take input from
         // the user and save into the user 
         System.out.println("Enter the Owner Information \n \n \n                     ");

//         Obj_Owner.SetOwnnerName();
//         Obj_Owner.SetOwnerFatherName();
//         Obj_Owner.SetOwnerCNIC();
//         Obj_Owner.SetCarEngineNumber();


         // System.out.println("                     Calculating Fee ...... \n \n \n                     ");
         // System.out.println("                     "+Obj_index.Get_Calculate_Fee());


         
         
         String [] Data = {Obj_Registration.VehicleName ,  
             Obj_Registration.VehicleModel,
             Obj_Registration.VehicleEngineNumber,
             Obj_Registration.VehiclePurCity,
         
             Obj_Invoice.Cardetails ,
             Obj_Invoice.InvoiceNumber ,
             Obj_Invoice.ShowRoomName,
             Obj_Invoice.ShowRoomNumber,
             Obj_Invoice.ShowRoomCity  ,
             
             Obj_Owner.OwnerName,
             Obj_Owner.OwnerFatherName,
             Obj_Owner.OwnerCNIC,
             Obj_Owner.CarEngineNumber
             };
 
             
                     // attach a file to FileWriter  
                     BufferedWriter fw=new BufferedWriter(new FileWriter("Database.txt" , true)); 
 
                     // read character wise from string and write  
                     // into FileWriter  
                     for (int i = 0; i < Data.length; i++){
                         fw.write(Data[i] + ","); 
                         
                     }
                     // just for checking
                     System.out.println("                     Writing successful                     ");
                     fw.append("\n");
                     //close the file  
                     fw.close(); 
         }
     public void Used_Car(Transfer_of_order  obj_Tor){

         System.out.println("Press 2");
         Scanner User_input = new Scanner(System.in);
         String stream;
         
             // Transfer_of_order  obj_Tor = new Transfer_of_order();
             
             System.out.println("Enter the older Owner Name");
                 stream = User_input.nextLine();
                 obj_Tor.Set_older_owner_name(stream);

             System.out.println("Enter the New Owner Name");
                 stream = User_input.nextLine();
                 obj_Tor.Set_new_owner_name(stream);
             
             
             System.out.println("Enter the Older CNIC Name");
                 stream = User_input.nextLine();
                 obj_Tor.Set_Older_CNIC_owner(stream);

             System.out.println("Enter the New Owner CNIC ");
                 stream = User_input.nextLine();
                 obj_Tor.Set__new_CNIC_owner(stream);
                 
                 
             System.out.println("Enter the Vechicle Number ");
                 stream = User_input.nextLine();
                 obj_Tor.Set_vehcile_number(stream);

     }
 public static void main(String[] args) throws IOException {

         Index Obj_index = new Index();
         Scanner myobj = new Scanner(System.in);
         ChallenForm myobj_ChallenForm = new ChallenForm();

         System.out.println("                     Starting the program                     ");

 
         String again_str = "yes";    // condition for the while loop
         String choice  ;                 //choice for new car mode and used car mode
         
         
         Gui_Interface start_programe = new Gui_Interface();
         start_programe.start();
         
         
     
     while(again_str.equals("yes") || again_str.equals("Yes") || again_str.equals("YES")){
         
             System.out.println("Selecting 1 :                     ");
             
             System.out.println("1 : press 1 for New Car                      ");
             System.out.println("2 : Press for Used Car                     ");
             choice = myobj.nextLine();
             
             
                 // do {

                 //     String isbnPattern = "ISBN-\\d{5}";
                 //     System.out.println("Select 1 or 2: ");
                 //     flag = choice.matches(isbnPattern);
                 //     if (!flag) System.out.println("Invalid data!");
                 //     }while (!flag);
                 //         System.out.println("Valid data");
     

                 if(choice.equals("1"))
                 {
                     Obj_index.NewCar();
                                             
                     CalculateFee Obj_Calculate_fee = new CalculateFee();
                     // Obj_index.Get_Calculate_Fee();
                     // Obj_Calculate_fee.GiveTotalfee();
                     // System.out.println( "Total fee is  : "+ Obj_Calculate_fee.total);

                     System.out.println("Creating challen from ...... \n \n \n                     ");
                     
                     myobj_ChallenForm.Create_challenfrom();

                      
                 }

                 if (choice.equals("2")){

                     Transfer_of_order  obj_Tor = new Transfer_of_order();

                     Obj_index.Used_Car(obj_Tor);

                     //check method tell us whether its is registered or not
                     // keep in mind in gui to create something like searching
                     
                     if(obj_Tor.check(obj_Tor) == true ){
                         System.out.println("valid user");


                         String [] Data = {obj_Tor.Get_new_owner_name() ,  
                                             obj_Tor.Get_older_owner_name(),
                                             obj_Tor.Get_Older_CNIC_owner(),
                                             obj_Tor.Get__new_CNIC_owner(),
                                             obj_Tor.Get_vehcile_number()

                             };

                             BufferedWriter fw=new BufferedWriter(new FileWriter("Database_used_vehicle.txt" , true)); 
 
                             // read character wise from string and write  
                             // into FileWriter  
                             for (int i = 0; i < Data.length; i++){
                                 fw.write(Data[i] + ","); 
                                 
                             }
                             
                             fw.append("\n");
                             //close the file  
                             fw.close(); 
                             
                             // creating challen form here should be a button to create the challen from
                             myobj_ChallenForm.Create_challenfrom_used_vehicle();


                     }
                     else{
                         

                         break;
                     }
                     
                     

                 }

                 
                 

                 // handle another time
                 
                 // System.out.println("                     Do you register Another classs(Yes/No)                   \n  ");
                 // again_str = myobj.nextLine();
                 // if (again_str.equals("no") ||again_str.equals("NO") || again_str.equals("No")){
                 //     System.out.println("Terminate");
                 //     break;
                 // }
                 // System.out.println("acha jee");


                 //
             }
             
 
     



            
     
    
     
     
     




     // getiitng input from the OWner class


    
     
 };


}
 

     



 