package applicantion;

import java.util.Locale;
import java.util.Scanner;

import controllers.Controller;

public class app {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);	
		
		int acc = 0;;
		String holder = "";
		
        while (true) {
            System.out.print("Enter account number: ");
            if (sc.hasNextInt()) {
                acc = sc.nextInt();   
                sc.nextLine();
                break;
            } else {
                System.out.println("you did not enter a valid account.");
                sc.nextLine();
            }
        }

        while (true) {
            System.out.print("Enter account holder: ");
            holder = sc.nextLine();

            if (!holder.isEmpty()) {
                break;
            } else {
                System.out.println("you did not enter a valid holder. ");
            }
        }		
        Controller controller = new Controller(acc, holder);
                
		System.out.print("Is there an initial deposit (y/n)? ");
		char makeFirstDeposit = sc. next().charAt(0);
		
		if (makeFirstDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initDeposit = sc.nextDouble();
			controller.addBalance(initDeposit);		
			
		}
		
		 System.out.println("Account data:");
		 System.out.println(controller);
		 
		 System.out.println();
		 System.out.print("Enter a deposit value: ");
		 double balance = sc.nextDouble();
		 controller.addBalance(balance);
		 
		 System.out.println(controller);
		 
		 System.out.println();
		 System.out.print("Enter a withdraw value: ");
		 double withdraw = sc.nextDouble();
		 controller.removeBalance(withdraw);
		 
		 System.out.println(controller);		 
		
		
		sc.close();

	}

}
