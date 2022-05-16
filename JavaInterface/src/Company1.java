public class Company1 implements Bank {

   @Override
   public void payTaxes(){
       System.out.println("This company will pay 100$");
    }
    @Override

    public void payCredit(){
        System.out.println("This company will pay credits in 2 month");
    }
    @Override
    public void verifyYourself(){

    }

    public String transfer() {
        return "Hey I did not transfer money";
    }

}
