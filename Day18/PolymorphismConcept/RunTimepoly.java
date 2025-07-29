package Day18.PolymorphismConcept;

import java.util.*;
class abi{
    void college(){
        System.out.println("Student");
    }
}
public class RunTimepoly extends abi {
    void college(){
        System.out.println("\nCSE");
    }
    public static void main(String[] args) {
        RunTimepoly rt = new RunTimepoly();
        rt.college();
    }
}
