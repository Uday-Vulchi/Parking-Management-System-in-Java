/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s4970;

/**
 *
 * @author Uday Prakash
 */

import java.util.Scanner;
class DisplayData{
    DisplayData(int N_Slots, int[]  V_type,int[]  regno,int[] N_days, int[] Time,int[] Amount,int s,int z){
        
        
     System.out.println("\n");
     System.out.println("The Slot Number of the vehicle is.."+z);
          System.out.println("\n");
        switch (V_type[z]) {
            case 1:
                System.out.println("The Vehicle type is Bike");
                break;
            case 2:
                System.out.println("The Vehicle type is Auto");
                break;
            case 3:
                System.out.println("The Vehicle type is Car");
                break;
            default:
                break;
        }
        
        System.out.println("\n");
        System.out.println("The Vehicle registration number is.."+regno[z]);
        if(N_days[z]!=0)
        {
            System.out.println("\n");
             System.out.println("The Number of days used for parking are.."+N_days[z]);
        }
        else
        {
            System.out.println("\n");
        System.out.println("The time of parking is.."+Time[z]+"hrs");
        }
        System.out.println("\n");
        
        System.out.println("The Total Amount is...$"+Amount[z]);
  
        
    }
    
}

public class ParkingManagementSystem {
    public static void main(String[] args){
        Scanner k=new Scanner(System.in);
        System.out.println("\t\t**************************************\t\t");
        System.out.println("\t\t*Welcome to Parking management System*\t\t");
        System.out.println("\t\t**************************************\t\t\n\n\n");
        System.out.println("\tPrices for Different types of Vehicles are as follows:");
        System.out.println("\t-----------------------------------------------------\n");
        System.out.println("\t Bikes or Any other 2 wheeler\t |\t $50/hr \t|\t $100/day\n");
        System.out.println("\t Auto or Any other 3 wheeler \t |\t $80/hr \t|\t $120/day\n");
        System.out.println("\t Car or Any other 4 wheeler  \t |\t $100/hr\t|\t $200/day\n");
        System.out.println("\n");
        int N_Slots;
        System.out.println("Enter Number of slots");
        N_Slots=k.nextInt();
        int[]  V_type;
            V_type = new int[20];
         int[]  regno;
            regno = new int[20]; 
         int[] N_days;
         N_days = new int[20]; 
         int[] Time;
         Time=new int[20]; 
         int[] Amount;
         Amount=new int[20];
        for(int i=1;i<=N_Slots;i++)
        {
            System.out.println("\n");
           System.out.println("Enter the vehicle type\n 1. For Bike\n 2. For Autorickshaw\n 3. For Car");
            V_type[i]=k.nextInt();
           System.out.println("\n");
           
            System.out.println("Enter the registration number");
             regno[i]=k.nextInt();
           System.out.println("\n");
           
           
           
             System.out.println("Enter number of days for parking");
             N_days[i]=k.nextInt();
                 
               if(V_type[i]==1)
               {
                    if(N_days[i]==0)
                   {
                       System.out.println("\n");
                      System.out.println("Enter the parking time on hourly bases");
                      Time[i]=k.nextInt();
                      Amount[i]=50*Time[i];
                   }
                    else
                    {
                        Amount[i]=100*N_days[i];
                    }
               }
               if(V_type[i]==2)
               {
                    if(N_days[i]==0)
                   {
                       System.out.println("\n");
                      System.out.println("Enter the parking time on hourly bases");
                      Time[i]=k.nextInt();
                      Amount[i]=80*Time[i];
                   }
                    else
                    {
                        Amount[i]=120*N_days[i];
                    }
               }
               if(V_type[i]==3)
               {
                    if(N_days[i]==0)
                   {
                       System.out.println("\n");
                      System.out.println("Enter the parking time on hourly bases");
                      Time[i]=k.nextInt();
                      Amount[i]=100*Time[i];
                   }
                    else
                    {
                        Amount[i]=200*N_days[i];
                    }
               }
               
        }
        System.out.println("\n\n");
        System.out.println("Enter the registration number of vehicle to be searched and to know the billibg details");
        int s;
        s=k.nextInt();
        int z=0;
        for(int i=1;i<=N_Slots;i++){
            if(s==regno[i]){
                z=i;
            }
        }
        DisplayData d=new DisplayData(N_Slots,V_type,regno,N_days,Time,Amount,s,z);
          
           }
        
    }

    
