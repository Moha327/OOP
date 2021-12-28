class BankAccount {
    private double checkingbalance;
    private double savingsbalance;
    public static int numberOfAccounts = 0;
    private static double totalAmount = 0;
    public BankAccount(double checkingbalance,  double savingsbalance) {
        this.checkingbalance = checkingbalance;
        this.savingsbalance =savingsbalance;
        numberOfAccounts++;
    }
    public BankAccount() {
    }
    public  int peopleCount() {
        return numberOfAccounts;
    }
    public  double toAmount() {
        return totalAmount;
    }
    public void GetBankAccount(){
        System.out.println(this.checkingbalance);
    }
    public void GetSavingBalanc(){
        System.out.println(this.savingsbalance);
    }
    public void SetCheckingBalance(double amount){
        this.checkingbalance+=amount;
        this.savingsbalance+=amount;
        this.totalAmount+=amount;
    
    }
    
    public void Setwithdraw(double amount){
         if (amount>this.savingsbalance)
         System.out.println("no enough Balance");
         else{
        this.checkingbalance-=amount;
        this.savingsbalance-=amount;
        this.totalAmount-=amount;
         }
    }
    public void totalmany(){
        System.out.println(this.totalAmount);
    }
    }