public class Main {
  // Anonymous Inner classes
  public static void main(String[] args) {
    Test test = new Test() {
        @Override
        public String sayName() {
            return null;
        }

        @Override
        public int increment() {
            return 0;
        }

        @Override
        public double doDecimal() {
            return 0;
        }
    };
  }
   interface Test {
     String sayName();
     int increment();
     double  doDecimal();
   }
}

