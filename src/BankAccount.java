public class BankAccount {

        private int accountNumber;
        private double balance;
        private String customerName;
        private String email;
        private String phoneNumber;

    public BankAccount() {
        // we can add default values here
        this(88888, 2.50, "Default", "chase.com", "555-555-5555");

    }

    public BankAccount( int accountNumber, double balance, String customerName, String email, String phoneNumber){
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.customerName = customerName;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

    public BankAccount(String customerName, String email, String phoneNumber) {

        // add default accountNUmber and balance
        this(333, 100.00, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit (double depositAmount){
            this.balance += depositAmount;
            System.out.println("You deposited " + depositAmount + " and your balance is " + balance);
        }

        public void withdrawal ( double withdrawalAmount){
            if (balance - withdrawalAmount < 0) {
                System.out.println("Insufficient Funds. Only " + balance + " available and you attempted to withdraw " + withdrawalAmount);
            } else {
                this.balance -= withdrawalAmount;
                System.out.println("Withdrawal of " + withdrawalAmount + " processed. \nRemaining balance = " + balance);
            }
        }

        public int getAccountNumber () {
            return accountNumber;
        }

        public void setAccountNumber ( int accountNumber){
            this.accountNumber = accountNumber;
        }

        public double getBalance () {
            return balance;
        }

        public void setBalance ( double balance){
            this.balance = balance;
        }

        public String getCustomerName () {
            return customerName;
        }

        public void setCustomerName (String customerName){
            this.customerName = customerName;
        }

        public String getEmail () {
            return email;
        }

        public void setEmail (String email){
            this.email = email;
        }

        public String getPhoneNumber () {
            return phoneNumber;
        }

        public void setPhoneNumber (String phoneNumber){
            this.phoneNumber = phoneNumber;
        }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
