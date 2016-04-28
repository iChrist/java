package pruebasestaticas;

public class MyDate {

    static {
        System.out.println("1. Bloque de código Static 1");
    }

    {
        System.out.println("3. Bloque de código 1");
    }

    public MyDate() {
        System.out.println("5. Constructor");
    }

    static {
        System.out.println("2. Bloque de código Static 2");
    }

    {
        System.out.println("4. Bloque de código 2");
    }
}
class TestMyDate{
    public static void main(String[] args) {
        MyDate d = new MyDate();
    }
}