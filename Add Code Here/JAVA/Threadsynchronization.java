class Account{
    public int balance;
    public int accountno;
    void display_Balance(){
        System.out.println("Account number:  "+accountno+"\nBalance: "+balance);
    }
    synchronized void deposit(int amount){
        balance=balance+amount;
        System.out.println("Deposited :-"+amount+ "Rupees");
        display_Balance();
    }
    synchronized void withdraw(int amount){
        balance=balance-amount;
        System.out.println(amount+" is withdrawn");
        display_Balance();
    }
}
class TransactionDeposit implements Runnable{
    int amount;
    Account accountX;
    TransactionDeposit(Account x,int amount){
        accountX=x;
        this.amount=amount;
        new Thread(this).start();
    }
    public void run(){
        accountX.deposit(amount);
    }
}
class TransactionWithdraw implements Runnable{
    int amount;
    Account accountY;
    TransactionWithdraw(Account y,int amount){
        accountY=y;
        this.amount=amount;
        new Thread(this).start();
    }
public void run(){
    accountY.withdraw(amount);
}
}
public class Threadsynchronization{
    public static void main(String args[]){
        Account Abc= new Account();
        Abc.balance=10000;
        Abc.accountno=999875;
        TransactionDeposit t1;
        TransactionWithdraw t2;
        t1=new TransactionDeposit(Abc,500);
        t2=new TransactionWithdraw(Abc,1000);
    }
}
