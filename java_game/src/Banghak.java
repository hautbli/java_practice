import java.util.Scanner;

public class Banghak {

    String scNum ;

    Scanner sc = new Scanner(System.in);


    static public int money ; //돈
    static public int tiredness= 50; // 피곤도
    static public int stress= 50; // 스트레스
    static public int day= -16;// 방학 16일 있음
    static public int happiness=50;
    static public int selfexteem=50;
    static public int point =0;



    public static void print(Me me) // 현재 상태출력 하기
    {   System.out.println(" ");
        System.out.println(" ");

        System.out.println("──────────────────────────────────");
        System.out.println( "         " +me.name +"님의 현재상태 " );
        System.out.println("");
        System.out.println("   방학     : D" +day);
        System.out.println("   잔액     : " +money+"원");
        System.out.println("   피곤도   : " +tiredness+"점");
        System.out.println("   스트레스 : " +stress+"점");
        System.out.println("   자존감   : " + selfexteem+"점");
        System.out.println("   행복도   : " +happiness+"점");
        System.out.println("──────────────────────────────────");


    }
}


