package tutorial;

public class Metodos {
    public static void main(String[] args) {
        int[] numeros = {8, 2,3};
        incremento(numeros);


    }
public static void incremento(int[] arr){
    arr[0]++;
    System.out.println("El valor de la funcion incremento es: " + arr[0]);
}


}
