public class ArrayConcept {

    public static void main(String[] args) {
        // Array: to store similar data type values in a array variable
// One dimensional array
        //1.int array:
        int i[] = new int[4];

        // lowest bound/ index =0
        // Upper bound/index= n-1 ( where n is size of array)

        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;
        // System.out.println(i[4]); // ArrayIndexOutOfBoundsException
        System.out.println(i.length); // Size/ length of array

        // Print all the values of array = use for loop

        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }

        //2. double array
        double d[] = new double[3];
        d[0] = 12.33;
        d[1] = 13.44;
        d[2] = 45.55;
        System.out.println(d[2]);
        System.out.println(d.length);
        for(int k=0; k<d.length; k++){
            System.out.println(d[k]);
        }

        // Char array
        char c[] = new char[2];
        c[0]= 'q';
        c[1]='w';

        System.out.println(c.length);
        System.out.println(c[0]);
        for(int l=0; l<c.length; l++){
            System.out.println(c[l]);
        }

        // boolean array:
        boolean b[]= new boolean[2];
        b[0]= true;
        b[1]= false;
        System.out.println(b[0]);
        System.out.println(b.length);

        //String array:
        String s[]=new String[4];
         s[0]="vipin";
         s[1]="viju";
         s[2]="Raju";
         s[3]="Rakesh";
        System.out.println(s.length);
        for (int p=0; p<s.length; p++){
            System.out.println(s[p]);


            //Disadvantages of array
            //1. Size is fixed -- static array -- To overcome this problem -- we use collection == ArrayList, HashTable and many more-- use dynamic array
            //2. Stores only similar data types values -- To overcome of this problem, we use Object array.

            //6. Object Array (Object is a class and Object is super class in all the classes)
            //Object array is used to store different data types values
            Object ob[]=new Object[6];
            ob[0]="Tom";
            ob[1]= 25;
            ob[2]=12.22;
            ob[3]="1/1/1990";
            ob[4]='M';
            ob[5]="London";

            System.out.println(ob[5]);
            System.out.println(ob.length);
            for(int t=0; t<ob.length; t++){
                System.out.println(ob[t]);
            }

        }
    }
}
