public class Main {
    public static void main(String[] args) {
        GameDeveloper gameDeveloper = new GameDeveloper("Bob", "Shawn", "Java",20);
        FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper("vipin", "kumar", "Javascript", 29);
        gameDeveloper.comeEarly();
        gameDeveloper.writeCode();
        gameDeveloper.testCode();

        System.out.println("***************************************** ");

        frontEndDeveloper.comeEarly();
        frontEndDeveloper.writeCode();
        frontEndDeveloper.testCode();
    }
}
