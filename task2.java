import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int hours = x/(3_600);
        hours = hours%24;
        int min = (x%3_600)/60;
        int sec = (x%60);
        System.out.printf("%d:%02d:%02d", hours, min, sec);
        /*
      Scanner in = new Scanner(System.in);
        int a = in.nextInt(), c = in.nextInt(), n = in.nextInt();
        int cop = c*n;
        int rub = (a*n)+(cop/100);
        cop = cop%100;
        System.out.printf("%d %d",rub,cop); */
    }
}