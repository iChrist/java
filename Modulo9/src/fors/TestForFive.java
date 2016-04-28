package fors;
import java.util.ArrayList;
/**
 *
 * @author christianjimenezcjs
 */
public class TestForFive {
    public static void main(String[] args) {
        int bidim[][] = {{1,2,3},{4,5,6,7,8},{1,2}};
        //FOREACH
        // 1 2 3
        // 4 5 6 7 8
        // 1 2
        for (int[] bidim1 : bidim) {
            for (int c : bidim1) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
