import java.util.Scanner;
public class Main{
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        boolean isRunning=true;
        double balance=0;
        while(isRunning){
            System.out.println("\n******************");
            System.out.println("WELCOME TO THE BANKING PROGRAM");
            System.out.println("******************");
            System.out.println("1.Show Balance");
            System.out.println("2.Deposite");
            System.out.println("3.Withdrawal");
            System.out.println("4.Quite");
            System.out.println("Enter your choice: ");
            int choice=scanner.nextInt();
            switch(choice){
                case 1->displayBalance(balance);
                case 2->balance+=deposite(balance);
                case 3->balance-=withdrawal(balance);
                case 4->isRunning=false;
                default->System.out.println("Invalid choice!!");
            }
        }
        System.out.println("Thank you have a good day");
        scanner.close();
    }
    static void displayBalance(double balance){
        System.out.printf("\nYour total Balance:%.2f",balance);
    }
    static double deposite(double balance){
        double amount;
        System.out.println("Enter the amount you want to deposite: ");
        amount=scanner.nextDouble();
        if(amount<0){
            System.out.println("Deposite process is declined due to the invalid amount");
        }
        return amount;

    }
    static double withdrawal(double balance){
        double amount;
        System.out.println("Enter the amount to withdrawal: ");
        amount=scanner.nextDouble();
        if(amount>balance){
            System.out.println("Withdrawal porcess is declined due to the insufficient amount!!!");
        }
        else if(amount<0){
            System.out.println("The withdrawal process is declined due to the invalid amount");
        }
        return amount;
    }
}