import java.util.Scanner;
public class forloop {

    public static void main(String[] args) {

Scanner input = new Scanner(System.in);// creates scanner to get input from user
int total=0;
int i=1;
while(i<=10){
		System.out.println("Please enter number "+i);
		int x= input.nextInt();// gets number entered
		i++;
		if((x % 2)==0){
		   total+= x;
	   }
   // odd
}
System.out.println("Sum of odd numbers is "+total);





        }// end main

  }//end class