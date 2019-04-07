/**
Name: Number

Description:

Created by tj burke

created on 11/02/2019

*/
import java.util.Scanner;
public class Number {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);// creates scanner to get input from user
int num=0;

System.out.println("Please enter number");
num+= input.nextInt();// gets number entered //  Block of code to try

if (num>0){
System.out.println("number is postive");
}
else if (num<0){
	System.out.println("number is negtive");

	}
	else{
		System.out.println("number is 0");

		}



        }// end main

  }//end class