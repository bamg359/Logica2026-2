package notasdelogica;

import java.util.Scanner;

public class ComprasSystem {

    static Scanner sc = new Scanner(System.in);

    static String [] productos = new String[5];
    static double [] precios = new double[5];

    public static void main(String[] args) {
        menuCompras();
    }

    public static void agregarProductos(){
        // logica para agregar productos al arreglo con while
        System.out.println("Agregrando Productos");

        int i = 0;

        while(i < productos.length){
            System.out.println("Agregue el producto" + i);
            productos[i] = sc.nextLine();

            i++;

        }

    }

    public static void agregarPrecios(){
        // logica para agregar productos al arreglo con while

        for(int i = 0 ; i < precios.length; i++){
            System.out.println("Agregue precio " + (i+1));
            precios[i]= sc.nextDouble();
        }



    }

    public static void mostrarProductos(){
        // logica para agregar productos al arreglo con while

        for(int i = 0; i< productos.length ; i++){
            System.out.println("Producto" + i + ": " + productos[i]);
        }

    }

    public static void mostrarPrecios(){
        // logica para mostrar precios usando for each

        for(double precio : precios){
            System.out.println("Precio: $" + precio);
        }
    }

    public double calcularTotal(){
        // logica para agregar productos al arreglo con while
        return 0;
    }

    public static void actualizarProducto(int i){

    }

    public static void actualizarPrecio(int i){

    }

    public static void mostrarTablaProductoPrecio(){

    }

   public static void menuCompras(){
        // crear un menu con opciones para agregar productos, mostrar productos, calcular total y salir del programa

       System.out.println("Iniciar aplicación presionando 1");

       int init = sc.nextInt();
       sc.nextLine();

       while(init != 0){

           System.out.println("""
                   Seleccione:
                   1. Agregar productos
                   2. Agregar Precios
                   3. Mostrar Productos
                   4. Mostras precios
                   5. Calcular total
                   6. Salir
                   """);
           int option = sc.nextInt();
           sc.nextLine();

           switch (option){
               case 1:
                   System.out.println("Agregar Productos");
                   agregarProductos();
                   break;
               case 2:
                   System.out.println("Agregar Precios");
                   agregarPrecios();
                   break;
               case 3:
                   System.out.println("Mostrar productos");
                   mostrarProductos();
                   break;
               case 4:
                   System.out.println("Mostrar Precios");
                   mostrarPrecios();
                   break;
               case 6:
                   System.out.println("Salir");
                   init = 0;
                   break;
               default:
                   System.out.println("Seleccione una opción valida");
           }
       }
    }
}
