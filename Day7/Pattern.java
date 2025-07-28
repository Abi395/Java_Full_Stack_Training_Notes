package Day7;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        int m = (n/2)+1;
        for(int i=1; i<=n; i++){//zero
            for(int j=1,k=5 ; j<=n;j++,k--){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=n; i++){//one
            for(int j=1,k=5 ; j<=n;j++,k--){
                if(j==m||i==n||(i==1&&j<=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=n; i++){//two
            for(int j=1,k=5 ; j<=n;j++,k--){
                if(i==1||i==m||i==n||(j==n&&i<=m)||(j==1&&i>=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){//three
            for(int j=1,k=5 ; j<=n;j++,k--){
                if(i==1||i==m||i==n||(j==n&&j>=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){//four
            for(int j=1,k=5 ; j<=n;j++,k--){
                if(i==m||j==m||(j==1&&i<=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){//five
            for(int j=1,k=5 ; j<=n;j++,k--){
                if(i==1||i==m||i==n||(j==n&&i>=m)||(j==1&&i<=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){//six
            for(int j=1,k=5 ; j<=n;j++,k--){
                if(i==1||i==m||i==n||(j==n&&i>=m)||j==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){//seven
            for(int j=1,k=5 ; j<=n;j++,k--){
                if(i==1|| j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){//eight
            for(int j=1,k=5 ; j<=n;j++,k--){
                if(i==1||i==n||j==1||j==n||i==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){//nine
            for(int j=1,k=5 ; j<=n;j++,k--){
                if(i==1||i==m||j==n||(j==1&&i<=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){//A
            for(int j=1,k=5 ; j<=n;j++,k--){
                if(i==1||i==m||j==1||j==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){//B
            for(int j=1,k=5 ; j<=n;j++,k--){
                if(i==1||i==m||j==1||j==5||i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){//I
            for(int j=1,k=5 ; j<=n;j++,k--){
                if(i==1||i==n||j==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){//N
            for(int j=1,k=5 ; j<=n;j++,k--){
                if(j==1||j==n||i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){//A
            for(int j=1,k=5 ; j<=n;j++,k--){
                if(i==1||i==m||j==1||j==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){//A
            for(int j=1,k=5 ; j<=n;j++,k--){
                if(i==1||i==m||j==1||j==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}