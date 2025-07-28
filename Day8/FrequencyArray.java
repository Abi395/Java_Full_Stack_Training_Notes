package Day8;
class number{
        public void unique(int a[], int c[]){
            for(int i = 0; i<a.length; i++){
                c[a[i]]++;
            }
            for(int i = 0; i<c.length;i++){
                if(c[i]==1){
                    System.out.println(i + " ");
                }
            }
        }
    }

public class FrequencyArray {
    public static void main(String[] args) {
        int a[] = {1,2,1,3,4,4,1,5};
        int c[] = new int[6];
        number arr = new number();
        arr.unique(a, c);
    }
}
