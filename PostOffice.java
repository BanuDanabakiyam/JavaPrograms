class PostOfficeAccount {
    private String accountNumber;
    private double balance;

    public PostOfficeAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs: " + amount);
        displayBalance();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
        displayBalance();
    }

    public void displayBalance() {
        System.out.println("Current Balance: Rs: " + balance);
    }
}


class SavingsAccount extends PostOfficeAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest Applied: Rs: " + interest);
        displayBalance();
    }
 
}


class Customer {
    private String customerName;
    private String customerId;
    private PostOfficeAccount account;

    public Customer(String customerName, String customerId, PostOfficeAccount account) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.account = account;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Balance: Rs: " + account.getBalance());
    }
}


class PostOffice {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("123000", 1000.0, 5.0);
        Customer customer = new Customer("XXXX", "408C1ava", savingsAccount);

        customer.displayCustomerInfo();

        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        savingsAccount.applyInterest();
    }
}
