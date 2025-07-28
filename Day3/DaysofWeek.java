package Day3;
public class DaysofWeek {
    public static void main(String[] args) {
        int n = 26;
        int day = n%7;
        if(day==0){
            System.out.println("Sunday");
        }
        else if(day==1){
            System.out.println("Monday");
        }
        else if(day==2){
            System.out.println("Tuesday");
        }
        else if(day==3){
            System.out.println("Wednesday");
        }
        else if(day==4){
            System.out.println("Thursday");
        }
        else if(day==5){
            System.out.println("Friday");
        }
        else if(day==6){
            System.out.println("Saturday");
        }
    }
}
