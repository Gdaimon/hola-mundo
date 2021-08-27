package holamundo;

public class HolaMundo {

    public static void main(String[] args) {
        // Enteros
        short numeroShort = 8;
        int numeroA = 5;
        long numeroLong = 90000;
        // Punto Flotante o Decimal
        double numeroDouble= 1.25; 
        float numeroFloat = 2.5f;
        
        
        
        
        System.out.println("Division: " + numeroShort / numeroA);
        System.out.println("Multiplicacion: " + numeroShort * numeroA);
        System.out.println("Suma: " + numeroShort + numeroA);
        System.out.println("Resta: " + (numeroShort - numeroA));
        
        System.out.println("Modulo: " + 10 % 2);
        int incremento = 10;
        // Incremento post
        //incremento++;
        // preincremnto
        ++incremento;
        incremento = incremento +1;
        // pre decremento
        --incremento;
        // post decremento
        incremento--;        
        incremento = incremento -1;
        incremento +=5;
        System.out.println("Adicion: " + incremento);
        
        // Unarios -, 
        System.out.println("Unario: " + (-incremento));
        boolean negacion = false;
        System.out.println((!negacion));
        
        // Caracteres
        char letra = 'a';
        System.out.println("char: " + letra);
        char arroba = 64;
        System.out.println("char: " + arroba);
        
        // Operadores Logicos
        System.out.println(2 == 5);
        System.out.println(2 > 3);
        System.out.println(2 >= 2);
        System.out.println(2 <= 3);
        System.out.println(2 != 3);
        
        System.out.println(++incremento);
        
    }
    
}
