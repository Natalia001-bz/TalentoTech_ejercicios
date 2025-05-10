# TalentoTech_ejercicios
Ejercicios de clase 
---
#### Clase 4 _ 4 de mayo 2025

### Estructuras de control

##### If, else if
##### **---> Cree un programa que pida al usuario dos números, los compare e indique cual número es el mayor. **

##### Solución con Scanner 
package clase4.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class condicionales1 {
    public static void main(String[] args) {
        // __________ Comparación de números ___________

        // ___________ Solución con scanner _________-

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresar el primer valor: ");
            int a = scanner.nextInt();
            System.out.println("Ingresar el segundo valor: ");
            int b = scanner.nextInt();
            if (a > b) {
                System.out.print(a + " es mayor que " + b);
            } else {
                System.out.print(b + " es mayor que " + a);
            }
        } catch (InputMismatchException e) {
            System.out.println("Valor ingresado no valido");
        }
    }
}

---
##### Solución con jOptionPne 
package clase4.ejercicios;

// import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Condicionales {
    public static void main(String[] args) {

        // __________ Comparación de números ___________

        // _____________ Solución con Jp option 1____________

        int numero1;
        int numero2;

        JOptionPane.showMessageDialog(null, "Bienvenidos", "Comparar dos números", JOptionPane.INFORMATION_MESSAGE);
        String x = JOptionPane.showInputDialog(null, " ingrese el primer número");
        String y = JOptionPane.showInputDialog(null, " ingrese el segundo número");
        try {
            numero1 = Integer.parseInt(x);
            numero2 = Integer.parseInt(y);

            if (numero1 > numero2) {
                System.out.println("el primer número" + numero1 + "es mayor que el segundo " + numero2);
                JOptionPane.showMessageDialog(null, +numero1, " El número mayor es ", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("el segundo número" + numero2 + "es mayor que el primero " + numero1);
                JOptionPane.showMessageDialog(null, +numero2, " el número mayor es: ", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: ingrese un número válido ", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // ______________ Version con jp option 2___________--

        float a = 0;
        float b = 0;

        try {
            String c = JOptionPane.showInputDialog(null, " ingrese el primer número \n");
            a = Float.parseFloat(c);
            c = JOptionPane.showInputDialog(null, " ingrese el segundo número: \n");
            b = Float.parseFloat(c);
            if (a > b) {
                System.out.println("El primer número es mayor que el segundo");
            } else {
                System.out.println("El segundo valor es mayor");
            }
        } catch (Exception e) {
            System.out.println(" el valor es incorrecto");
        }

    }
}
---
#### Swich Case
#### ** ---> Cree un programa que le indique al usuario cual día de la semana es a partir de ingresar un número**
package clase4.ejercicios;

import java.util.Scanner;


public class bucles1 {
    public static void main(String[] args) {
 // ___________Bucles ________

 //  ___Switch case__________
 Scanner scanner = new Scanner(System.in);
System.out.println("ingresa e número del día");
int dia= scanner.nextInt();
String nombreDia; 

switch (dia) {
    case 1:
        nombreDia = "Lunes";
        break;
        case 2:
        nombreDia = "Martes";
        break;
        case 3:
        nombreDia = "Miércoles";
        break;
        case 4:
        nombreDia= "Jueves";
        break;
        case 5:
        nombreDia =  "Viernes";
        break;
        case 6:
        nombreDia =  "Sábado";
        break;
        case 7:
        nombreDia =  "Domingo";
        break;

    default:
    nombreDia = "Dato inválido, por favor";
        break;
}
System.out.println("el dia es: " + nombreDia);
scanner.close();

    }  
}


______________________-
package clase4.ejercicios;

import java.util.Scanner;

public class bucles1 {
    public static void main(String[] args) {
        // ___________Bucles ________

        // ___Switch case__________
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa e número del día");
        int dia = scanner.nextInt();
        String nombreDia;

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;

            default:
                nombreDia = "Dato inválido";
                break;
        }
        System.out.println("el dia es: " + nombreDia);
        // scanner.close();
        // ____________________________________

        // cilcos for, While, ____________

        int i = 0;
        int n = 3;
        while (i <= n) {

            System.out.println("Ejercicio estructura de control: \n  ejecución número: " + i + " " + "del ciclo while" );
            i++;
        }

        // __________-- Do while garantiza que se ejecute al menos una vez y luego evalua la condición. 

        int clave;
        Scanner xx = new Scanner(System.in);
        int intentos=0;
        do{
            
            System.out.println("Digite su clave: ");
            clave = xx.nextInt(); 
            intentos++;
            if(intentos < 4 && clave){
                break;
            }

        }while (clave != 1234); 
            
        System.out.println("Bienvenidos -- Datos correctos --");
        
        xx.close();
        }
        }
_______________________


---


## CLase 9 de mayo 


# Métodos 

        
package metodos.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calcular {

    public static void main(String[] args) {

        // ____________ Ejemplo con scanner ______

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Ingresa el primer número");
        // int a = scanner.nextInt();
        // System.out.println("Ingresa el segundo número");
        // int b = scanner.nextInt();
        // System.out.println("El resultado de la suma es: " + suma(a, b));

        // ___________ Ejemplo con joption ___________

        // String numero1 = JOptionPane.showInputDialog(null, " Ingresa el primer número
        // ");
        // int a = Integer.parseInt(numero1);
        // String numero2 = JOptionPane.showInputDialog(null, " ingresa el segundo
        // número");
        // int b = Integer.parseInt(numero2);

        // JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma(a,
        // b), "SUMA ", JOptionPane.INFORMATION_MESSAGE);

        List<Float> valores = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            valores.add(Solicitar(i));
        }
        System.out.println("Los valores son: " + valores);
        for (Float valor : valores) {
           // System.out.println(valor);
        }

        Float suma = sumar(valores.get(0), valores.get(1), valores.get(2 ));
        System.out.println("La suma de los tres valores es: " + suma);
    }


    // _______ Métodos_________________________________

    // public static Float suma(int a, Float b) {
    //            return a +b;
    // }


    public static Float Solicitar(int n){
        Scanner lj =new Scanner(System.in);
        System.out.println("ingresar el valor no."+n);
        try{
            float rs=lj.nextFloat();
             return rs;
        }catch(Exception e){
            System.out.println("Error, ingrese un valor correcto");
            return Solicitar(n);
        }
        
        }

    // public static Float sumar(List<Float>datos) {
    //     float rs =0;
    //     for (int i=0; i> datos.size(); i++){
    //         rs=rs+datos.get(i);
    //     }
        
    //     return rs;
    // }

    public static Float sumar(Float a, Float b, Float c) {
        return a + b+c;
    }
}


________________________________________________________________________________________

// package metodos.ejercicios;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// import javax.swing.JOptionPane;

// public class Calcular {

//     public static void main(String[] args) {

        // ____________ Ejemplo con scanner ______

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Ingresa el primer número");
        // int a = scanner.nextInt();
        // System.out.println("Ingresa el segundo número");
        // int b = scanner.nextInt();
        // System.out.println("El resultado de la suma es: " + suma(a, b));

        // ___________ Ejemplo con joption ___________

        // String numero1 = JOptionPane.showInputDialog(null, " Ingresa el primer número
        // ");
        // int a = Integer.parseInt(numero1);
        // String numero2 = JOptionPane.showInputDialog(null, " ingresa el segundo
        // número");
        // int b = Integer.parseInt(numero2);

        // JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma(a,
        // b), "SUMA ", JOptionPane.INFORMATION_MESSAGE);

    //     List<Float> valores = new ArrayList<>();

    //     for (int i = 1; i <= 2; i++) {
    //         valores.add(Solicitar(i));
    //     }
    //     System.out.println("Los valores son: " + valores);
    //     for (Float valor : valores) {
    //        // System.out.println(valor);
    //     }

    //     Float suma = sumar(valores.get(0), valores.get(1), valores.get(2 ));
    //     System.out.println("La suma de los tres valores es: " + suma);
    // }


    // _______ Métodos_________________________________

    // public static Float suma(int a, Float b) {
    //            return a +b;
    // }


    // public static Float Solicitar(int n){
    //     Scanner lj =new Scanner(System.in);
    //     System.out.println("ingresar el valor no."+n);
    //     try{
    //         float rs=lj.nextFloat();
    //          return rs;
    //     }catch(Exception e){
    //         System.out.println("Error, ingrese un valor correcto");
    //         return Solicitar(n);
    //     }
        
    //     }

    // public static Float sumar(List<Float>datos) {
    //     float rs =0;
    //     for (int i=0; i> datos.size(); i++){
    //         rs=rs+datos.get(i);
    //     }
        
    //     return rs;
    // }

    // List<Float> valores = new ArrayList<>();

    //     for (int i = 1; i <= 2; i++) {
    //         valores.add(Solicitar(i));
    //     }
    //     System.out.println("Los valores son: " + valores);
    //     for (Float valor : valores) {
    //        // System.out.println(valor);
//}
______________________________________________________
package metodos.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sumar {
    public static Scanner mj = new Scanner(System.in);

    public static void main(String[] args) {

        List<Float> valores = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            valores.add(Solicitar(i));
        }
        System.out.println("Los valores son: " + valores);

        // System.out.println(sumar(valores));

        float suma = sumar(valores.get(0), valores.get(1), valores.get(2));
        System.out.println("La suma de los tres valores es: " + suma);
        mj.close();
    }

    // public static Float Solicitar(int n){
    // Scanner lj =new Scanner(System.in);
    // System.out.println("ingresar el valor no."+n);
    // try{
    // float x=mj.nextFloat();
    // return x;
    // }catch(Exception e){
    // System.out.println("Error, ingrese un valor correcto" +n);
    // return Solicitar(n);
    // }

    // }

    public static Float sumar(List<Float>datos) {

    public static float Solicitar(int n) {
        float q = 0;
        System.out.println("ingresar el valor: " + n);

        try {
            if (mj.hasNextFloat()) {
                float x = mj.nextFloat();
                return x;
            } else {
                mj.next();
                System.out.println(" Error. ingrese un valor correct, ********" + n);
                return Solicitar(n);
            }
            float x = mj.nextFloat();
            return x;
        } catch (Exception e) {
            System.out.println(" Error. ingrese un valor correct, ********" + n);
            return q;
        }

    }

}


