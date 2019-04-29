/**
Name: nameage

Description: Takes in name and age then prints it for hold old one is

Created by tj burke


*/
import java.util.Scanner;
public class  nameage {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);// creates scanner to get input from user
int age=0;
String name ="";
int count =1;


System.out.print("Please enter name: ");
name+= input.next();// gets number entered

System.out.print("Please enter age: ");
age+= input.nextInt();// gets number entered
while (count<=age){
	System.out.println(count+" "+name);// prints
	count++;
	}

}
  }//end class