package BSsearch;
import java.util.Arrays;
import java.util.Scanner;


public class BinarySecuentialSearch {

    public static void main(String[] args) {
        int cont =0;
        Scanner scanner = new Scanner(System.in);


        while(cont!=1){
            System.out.println("Escojer opción:");
            System.out.println("1. Probar métodos de búsqueda");
            System.out.println("2. Salir");
            int e = scanner.nextInt();

            switch(e){
                case 1:
                    System.out.println("\n\n***MÉTODOS DE BÚSQUEDA***\n");
                    System.out.println("BÚSQUEDA BINARIA");
                    System.out.println("ARRAY DE EJEMPLO:\n");
                    int array[]={56,9985,85,526,45578,7844,1,2532,46578,5415,7981,56875,89,8525};
                    System.out.println(Arrays.toString(array)+"\n");
                    Arrays.sort(array);
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
                    System.out.println("ARRAY DE EJEMPLO:\n");
                    int array2[]={14,20,598,257897,15,1,5,2,8,7,9};
                    System.out.println(Arrays.toString(array2) + "\n");

                    System.out.println("Ingrese el número que desea buscar:\n");
                    int num2 = scanner.nextInt();


                    int sesearching = SecuentialSearch(array2, num2);
                    if (sesearching!= -1) {
                        System.out.println("El número se encuentra en la posición:" +sesearching);
                    } else {
                        System.out.println("El número no se encuentra");

                    }
                    break;


                case 2:
                    cont=1;
                    break;

                default:
                    System.out.println("escoja una opción válida");


            }



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

    public static int SecuentialSearch(int array2[], int Sesearched) {
        System.out.println("");
        boolean found=false;
        for (int i = 0; i < array2.length  && found==false; i++){
            if(Sesearched == array2[i]) {
                found = true;
                return i;
            }
        }
        return -1;
    }
}
