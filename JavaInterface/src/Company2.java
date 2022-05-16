public class Company2 implements Bank{

    @Override
    public void payTaxes() {
        System.out.println("This company will not pay anything");
    }

    @Override
    public void payCredit() {
        System.out.println("404 not found");
    }

    @Override
    public void verifyYourself() {
        System.out.println("This company is verified");
    }


    public String transfer() {
        return "Hello and I transferred money";
    }
}
