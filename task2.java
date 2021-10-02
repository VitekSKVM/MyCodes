import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
 ******************** Электронные часы показывают время в формате h:mm:ss, 
то есть сначала записывается количество часов, потом обязательно двузначное количество минут, 
затем обязательно двузначное количество секунд. Количество минут и секунд при необходимости дополняются до двузначного числа нулями.
С начала суток прошло n секунд. Выведите, что покажут часы. *********************
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int hours = x/(3_600);
        hours = hours%24;
        int min = (x%3_600)/60;
        int sec = (x%60);
        System.out.printf("%d:%02d:%02d", hours, min, sec);
      
      *************** Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков. **************
      Scanner in = new Scanner(System.in);
        int a = in.nextInt(), c = in.nextInt(), n = in.nextInt();
        int cop = c*n;
        int rub = (a*n)+(cop/100);
        cop = cop%100;
        System.out.printf("%d %d",rub,cop); 
    }
}
