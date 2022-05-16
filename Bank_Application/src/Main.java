public class Main {
    public static void main(String[] args) {
     Account account1 = new Account( "vipin", "kumar", "vipin@gmail.con", 2000,
             1,"94594099494");
        System.out.println(account1.getName());
       account1.takeMoney(500);
    }
}
