package cadenas;

public class TestString {
    
    public static void main(String[] args) {
        String x="Fabian";//Literal String
        //+System.out.println("Josue");//Literal String
        //Son tratados como objetos
        char c = "Miguel".charAt(0);
        
        //
        String s1 = new String("Ramon");
        String s2 = new String("Ramon");
        String s3 = "";
        String s4 = "";
        
        System.out.println(s1==s2);//False
        System.out.println(s2==s3);//False
        System.out.println(s3==s4);//True
        System.out.println(s4==s1);//False
        
        String a = "Andrea";
        String b = "An" + "drea";
        String d = "An";
        String e = d + "drea";
        
        System.out.println(a==b);//True
        System.out.println(a==e);//False
    }
    //Inicializando: 
        //LiteralString+LiteralString = POOL
        //Una variable + LiteralString = No Pool
        //Variable + Variable = No Pool
    
}
