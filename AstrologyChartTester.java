import java.util.Scanner;


public class AstrologyChartTester {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        /*AstrologyChart tomRiddle = new AstrologyChart("01072003", "Alex");
        System.out.println(tomRiddle.setChineseSign(2003));
        System.out.println(tomRiddle.setWestSign(07,01));*/
      
        AstrologyChart tomRiddle = new AstrologyChart("01072003", "alex");
        System.out.println("Enter Month: ");
        int mon = s.nextInt();

        System.out.println("Enter Day: ");
        int dy = s.nextInt();

        System.out.println("Enter Year: ");
        int yr = s.nextInt();

        System.out.println(tomRiddle.setWestSign(dy, mon));
        System.out.println(tomRiddle.setChineseSign(yr));
    }

}
