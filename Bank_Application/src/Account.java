public class Account {
    private String name;
    private String surname;
    private String email;
    private int balance;
    private int accountNumber;
    private String tel;

     public Account (){

     }
     public void putMoney(int money){
      balance=balance+money;
         System.out.println("Your new balance is:" + balance);
     }

    public void takeMoney(int money){
         balance=balance-money;
        System.out.println("Your balance is:" +balance);
    }

    public Account(String name, String surname, String email,int balance, int accountNumber, String tel) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.balance= balance;
        this.accountNumber = accountNumber;
        this.tel = tel;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname= surname;
    }
    public String getSurname(){
        return surname;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber= accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void  setTel(String tel){
        this.tel = tel;
    }
    public String getTel(){
        return tel;
    }
}
