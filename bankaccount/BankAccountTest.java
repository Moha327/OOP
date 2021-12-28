public class BankAccountTest {
    public static void main(String[]  args){
        BankAccount x =new BankAccount();
        BankAccount y =new BankAccount();
        y.SetCheckingBalance(5000);
        x.SetCheckingBalance(5000);
        y.Setwithdraw(2000);
        y.GetBankAccount();
        x.GetBankAccount();
        y.totalmany();
    
    }
}
