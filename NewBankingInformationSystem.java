class BankingInformationSystem {

    String accountHolder;
    int accountNumber;
    double balance;

    BankingInformationSystem(String name, int accNo, double bal){
        accountHolder = name;
        accountNumber = accNo;
        balance = bal;
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }

    void display(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String args[]){
        BankingInformationSystem user =
            new BankingInformationSystem("John",12345,1000);

        user.display();
        user.deposit(500);
        user.withdraw(200);
        user.display();
    }
}
