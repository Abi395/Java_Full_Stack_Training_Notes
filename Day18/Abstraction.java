package Day18;

import java.util.*;
abstract class hai{//We want to use the keyword (abstract) to access the object and abstract method
    void college(){
        System.out.println("Student");
    }
    abstract void otp();//Abstarct method for hiding the details
}

public class Abstraction extends hai{
    void otp(){//Method that is from the abstarct class (abi)
        System.out.println("Message");
    }
    public static void main(String[] args) {
        Abstraction ab = new Abstraction();
        ab.college();
    }
}
