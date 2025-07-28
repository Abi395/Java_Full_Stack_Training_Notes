package Day3;
public class StartingDayofYear{
   public static void main(String[] args) {
      int begin= 2000;
        int end = 2060                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ;
        int sub = end - begin;
        int leap = sub/4;
        int leapyear;
        int oddCount;
        int nonleapyear;
        if((begin%100)==0 && (end%100)==0){
            leapyear = leap+1;
        }
        else{
            leapyear = leap;
        }

        oddCount = leapyear*2;
        nonleapyear = sub-leapyear;
        int Total = oddCount+nonleapyear;
        switch (Total%7) {
            case 0: System.out.println("Saturday"); break;
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thrusday"); break;
            case 6: System.out.println("Friday"); break;
        }
   }   
}