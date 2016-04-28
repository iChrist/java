package excercises;

/**
 *
 * @author christianjimenezcjs
 */
public class Excercise1 {
    public static void main(String[] args) {
        int suma = 4;
        for (int i = 0,j=10;i < 10 && j>-5; i++,i++) {
            j++;
            suma +=i*2 + ++j / 2%1+32 - i--;
            System.out.println(i);
        }
        System.out.println("Suma: "+suma);
    }
}
