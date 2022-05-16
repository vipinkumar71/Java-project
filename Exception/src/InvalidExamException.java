public class InvalidExamException extends ArithmeticException {
    @Override
    public void printStackTrace() {
      System.out.println("This is a invalid Exam Exception");
//        super.printStackTrace();
    }
}
