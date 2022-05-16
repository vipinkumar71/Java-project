import java.io.IOException;

public class ExamController {
    public static void controlExam(int result) {

          try {
              if (result < 75) {
                  throw new InvalidExamException();
              }
          }
              catch(IOException e){
                  System.out.println("You got problem bro");
                  e.printStackTrace();
              }
          }





    public static void testString(String s){
    if(s== null){
        throw new NullPointerException();
    }
    }
}
