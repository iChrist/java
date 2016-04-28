package sobrecarga;

public class Matematicas {

    public int suma(int x, int y) {
        System.out.println("Con 2 argumentos");
        return x + y;
    }

    public int suma(int x, int y, int z) {
        System.out.println("Con 3 argumentos");
        return x + y + z;
    }

    public int suma(int[] x, int a) {
        System.out.println("Con n argumentos");
        int suma = 0;
        for (int i = 0; i < x.length; i++) {
            suma += x[i];
        }
        return suma;
    }
}

class TestMatematicas {

    public static void main(String[] args) {
        Matematicas math = new Matematicas();
        System.out.println("Suma de 2 números: " + math.suma(6, 7));
        System.out.println("Suma de 3 números: " + math.suma(6, 7, 8));
    }
}
