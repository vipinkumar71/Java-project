public class Student {
 // A Constructor is not static and also without return types
 // Default constructor = java default create a constructor for us. we can call it Hidden constructor.
 //when we create a constructor the Hidden constructor automatically removed.

 // this is access modifiers = private, public, protected
private String name;
private String surname;
private String email;
private int age;

// Static method belongs to class and when run static method also run

public static void create(){
 System.out.println("I am a static method and I belongs to class.");
  }

  // Non-Static method belongs to object and when we create object at that time we can access that non-static method

  public void put(){
   System.out.println("Student object is created and you used your method.");
  }
}
