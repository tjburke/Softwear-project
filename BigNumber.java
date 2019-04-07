/**
Name: Big number

Description: displays if big number

Created by tj burke

created on 04/02/2019

*/
import java.util.Scanner;
public class BigNumber {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);// creates scanner to get input from user
int check=0;
try {
 System.out.println(  "Enter a number");//prompt
 			check= input.nextInt();// gets number entered //  Block of code to try
}
catch(Exception e) {
	 System.out.println(  "Please enter a valid number");//prompt
	 System.exit(0);
  //  Block of code to handle errors
}
if(check>1000000){

	System.out.println(  "Is big number");//prompt
	}
	else{
		System.out.println(  "is not bigger then");//prompt

		}





        }// end main

  }//end class