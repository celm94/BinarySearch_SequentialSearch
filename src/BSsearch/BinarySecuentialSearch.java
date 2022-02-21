package BSsearch;
import java.util.Arrays;
import java.util.Scanner;


public class BinarySecuentialSearch {

    public static void main(String[] args) {

        System.out.println("\n\n***MÉTODOS DE BÚSQUEDA***\n");
        System.out.println("ARRAY DE EJEMPLO:\n");
        int array[]={56,9985,85,526,45578,7844,1,2532,46578,5415,7981,56875,89,8525};
        System.out.println(Arrays.toString(array)+"\n");
        Arrays.sort(array);

        Scanner scanner = new Scanner(System.in);

        System.out.println("BÚSQUEDA BINARIA");
        System.out.println("Arreglo Ordenado:");
        System.out.println(Arrays.toString(array)+"\n");
        System.out.println("Ingrese el número que desea buscar:\n");
        int num = scanner.nextInt();
        int searching = BinarySearch(array, num);

        if (searching== -1){
            System.out.println("número no encontrado");
        }
        else{

            System.out.println("El número se encuentra en el array en la posición: "+ searching +"\n\n");

        }


        System.out.println("BÚSQUEDA SECUENCIAL");
        System.out.println("Ingrese el número que desea buscar:\n");
        int num2 = scanner.nextInt();


        int sesearching = SecuentialSearch(array, num2);
        if (sesearching!= -1) {
            System.out.println("El número se encuentra en la posición:" +searching);
        } else {
            System.out.println("El número no se encuentra");

        }
        


    }

    public static int BinarySearch(int array[], int searched){
        int first = 0;
        int last = array.length-1;
        int center, centerv;

        while(first<= last){
            center = (first + last)/2;
            centerv = array[center];

            if(searched == centerv){
                return center;
            }
            else if(searched < centerv){
                last= center-1;
            }
            else{
                first = center +1;
            }
        }
        return -1;
    }

    public static int SecuentialSearch(int array[], int Sesearched) {
        System.out.println("");
        for (int i = 0; i < 10; i++){
            if(Sesearched == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
