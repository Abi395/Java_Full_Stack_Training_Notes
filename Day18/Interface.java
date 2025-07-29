package Day18;

interface mec{
    abstract void college();//We can use the keyword abstract or not
}
public class Interface implements mec {//The one is interface and class using implements we can join
    public void college(){
        System.out.println("Student");
    }
    public static void main(String[] args) {
        Interface i = new Interface();
        i.college();
    }
}
