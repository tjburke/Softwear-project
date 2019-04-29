
/**
Name: index

Description: Displays a menu for each program to chose from

Created by tj burke


*/
import java.util.Scanner;
public class    index {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// creates scanner to get input from user
		index m = new index();


				System.out.print("Pick a program to run ");
				System.out.println("1.Lisa \n 2.BigNumber \n 3.Number \n 4.Two \n 5.NameAge \n 6.ForLoop \n 7.Months \n 8.Cards \n 9.To Exit. ");
					int x= input.nextInt();// gets number entered

				while(x!=0){
		if(x==1){
			Lisa.main(new String[0]); // runs the named program
			index.main(new String[0]);// brings back to main menu


			}
		else if(x==2){
					BigNumber.main(new String[0]);
					index.main(new String[0]);

			}
		else if(x==3){
							Number.main(new String[0]);
							index.main(new String[0]);

			}
		else if(x==4){
									Two.main(new String[0]);
									index.main(new String[0]);

			}
		else if(x==5){
											nameage.main(new String[0]);
											index.main(new String[0]);

			}
		else if(x==6){
													forloop.main(new String[0]);
													index.main(new String[0]);

			}
		else if(x==7){
															months.main(new String[0]);
															index.main(new String[0]);

			}
		else if(x==8){
																	cards.main(new String[0]);
																	index.main(new String[0]);

			}
		else if(x==9){
					System.exit(0);

			}

}
}

}