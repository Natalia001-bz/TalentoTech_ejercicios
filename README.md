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

