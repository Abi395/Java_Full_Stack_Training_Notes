package Day2;
public class wheeler{
    public static void main(String[] args) {
        int w = 100;
        int v = 10;
        int tw = ((v*4)-w)/2;
        if((w&1) == 0 && (w>v) && ((w <= v * 4)))//Total wheels should be less than or equal to maximum allowed
        {
            System.out.println("Tw :" + tw + " Fw :" +(v-tw) );
        }
        else{
            System.out.println("Invalid");
        }
    }
}