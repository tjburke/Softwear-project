
import java.util.Scanner;
public class  Two {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);// creates scanner to get input from user
int num1=0;
int num2=0;


System.out.println("Please enter number");
num1+= input.nextInt();// gets number entered

System.out.println("Please enter number");
num2+= input.nextInt();// gets number entered

if(num1==2&&num2==2){
	System.out.println("Both are equal to 2");
	}

else if (num1==2||num2==2)
if(num1==2){
System.out.println("number 1 = to 2");
}
else {
	System.out.println("number 2 = to 2");
	}
else{
	System.out.println("neither is = to 2");
	}

        }// end main

  }//end class