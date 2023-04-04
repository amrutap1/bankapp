public class Account {
    int accno;
    int bal;
    String custName;
    int phone;
    String email;

    void withdraw(int amt){
        bal=bal-amt;
        System.out.println(bal);
    }
    void deposite(int amt){
        bal=bal+amt;
        System.out.println(bal);
    }

    public static void main(String args[]){
        Account ac=new Account();
        ac.deposite(30);
        ac.withdraw(50);
    }
}
