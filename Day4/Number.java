package Day4;

public class Number {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        int count =0;
        for(int i=0;i<arr.length;i++){
            count = (arr[i] == 1)? count+1:count-1;
        }
        System.out.println((count == 1)?"true":"False");

    }
}
