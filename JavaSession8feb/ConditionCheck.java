package JavaSession15;

public class ConditionCheck {
        double balance = 5000.00;
        public void deposit(double amount) throws InvalidAmountException, InsufficientBalanceException {
            if(amount<0)
                throw new InvalidAmountException("Please Enter Valid Amount it should be Positive");

            balance = balance +amount;
            System.out.println("Balance in your account is: "+balance);

        }
        public void withdraw(double amount) throws InsufficientBalanceException {
            if(balance<amount)
                throw new InsufficientBalanceException("Sorry !! Your balance is low");
                
            balance = balance - amount;
            System.out.println("Balance in your account after the withdrawal is : "+balance);



    }


}
