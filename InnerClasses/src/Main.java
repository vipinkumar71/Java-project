public class Main {
    public static void main(String[] args) {
        // Non-static Inner classes
       // Human human = new Human();
        //human.nonStaticMethod();

        // static method Inner classes
        Human.staticMethod();
        Human.Heart heart=new Human.Heart();
        Human.Brain brain = new Human.Brain();
        System.out.println(heart.heartName());
        System.out.println(brain.brainName());

    }
}
