package JavaSession15;

import java.util.Scanner;

public class TestAccounts {
    public static void main(String[] args) {
        ConditionCheck obj_b = new ConditionCheck();
        Scanner sc = new Scanner(System.in);

        try{
            try{
                System.out.println("Enter the amount to be deposited: ");
                double amt = sc.nextDouble();
                obj_b.deposit(amt);

            } catch (InvalidAmountException e) {
                System.out.println("Invalid Amount Entered ");
            }
            System.out.println("Enter the amount to withdraw: ");
            double withdraw_amt = sc.nextDouble();
            obj_b.withdraw(withdraw_amt);

        }
        catch (InsufficientBalanceException e) {
            e.getMessage();
        }

    }

}
/*
Output:
Enter the amount to be deposited:
3000
Enter the amount to withdraw:
10000
Parameter String:: Constructor==>Sorry !! Your balance is low


Another Output:
Enter the amount to be deposited:
-20
Parameter String:: Constructor==>Please Enter Valid Amount it should be Positive
Invalid Amount Entered 
Enter the amount to withdraw:
30

Another Output:
Enter the amount to be deposited: 
5000
Balance in your account is: 10000.0
Enter the amount to withdraw: 
2000
Balance in your account after the withdrawal is : 8000.0

 */
