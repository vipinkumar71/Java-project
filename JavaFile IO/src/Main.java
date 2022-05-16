import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            FileInputStream stream = new FileInputStream("vipin.jpg");
        int number;
        while((number=stream.read())!= -1){
            list.add(number);
        }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileOutputStream outputStream= new FileOutputStream("vipin2.jpg");
            for(int a:list){
                outputStream.write(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hello World");
//
//
//        FileOutputStream fileOutputStream = null;
//        File file= new File( "first.txt");
//
//        try {
//            fileOutputStream = new FileOutputStream(file, true);
//            String s= "SS Academy";
//          byte[] bytes =   s.getBytes();
//          fileOutputStream.write(bytes);
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        } finally{
//            try {
//                fileOutputStream.close();
//            }
//            catch (IOException e) {
//                e.printStackTrace();
//            }


//************************************************


//    FileInputStream fileInputStream = null;
//        try {
//            fileInputStream = new FileInputStream("first.txt");
//            int num;
//            String str = "";
//            while((num = (fileInputStream.read()))!= -1){
//              str +=(char) num;
//            }
//            System.out.println("My sentence:" +str);
////           fileInputStream.skip(9);
////            System.out.println((char)fileInputStream.read());
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("Your file can not be find");
//            e.printStackTrace();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        } finally{
//            try {
//                if(fileInputStream!=null){
//                    fileInputStream.close();
//                }
//
//            } catch (IOException e) {
//                System.out.println("System cannot close the operation");
//                e.printStackTrace();
//            }
//        }
