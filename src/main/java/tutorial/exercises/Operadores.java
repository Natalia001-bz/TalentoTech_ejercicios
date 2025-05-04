package tutorial.exercises;

public class Operadores {
    public static void main(String[] args) {
        int a = 2 + 2;
        int b = 2-2;
        int c= 3*3;
        int d=  4%3;
        float e= 10f/3f; 
        // → la f indica que el número es flotante
        // si se quiere con un double se le debe asignar el formato decimal  0.0
        int x = 5;
        ++x; // incrementa el valor 

    // Nota: es importante donde colocamos el ++ 
    System.out.println(++x);
    System.out.println(x++);
    int y= x++;
    int z = ++x;
    System.out.println(y);
    System.out.println(z);

        System.out.println(a + b+c+d+e);


        //operadores aritméticos 
        int j = 4; 
        System.out.println(j);
        j +=5;
        System.out.println(j);  // otra forma de hacer aumentos directamente


        //____PEMDAS____ Orden de las operaciones________
        int k = 5 + 3 *2; // → es 11 y no 16
        System.out.println(k);
        // si se desea priorizar alguna se le puede agregar paréntesis 
        k = (5+3) *2; // → se cambia la jerarquia para que sea 16
        System.out.println(k);
        // jerarquia ↓
        // PEMDAS: parentesis, potencias, multiplicacion, division, suma, resta
        
    }
}
