package pruebasestaticas;

public class TestReglaEstatico {

    int x = 9;
    static int y = 7;

    public static void main(String[] args) {
        // NO SE PUEDE UTILIZAR "this" , "super" en contexto estatico
        // NO SE PUEDE USAR VARIABLES DE INSTANCIA Y METODOS
        TestReglaEstatico obj = new TestReglaEstatico();
        System.out.println("x: " + obj.x);
        System.out.println("y: " + TestReglaEstatico.y);
    }
    
    //Método creado en tiempo de ejecución
    public void metodoConcreto(){
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        
        System.out.println("x: "+this.x);
        System.out.println("y: "+this.y);
    }
}
