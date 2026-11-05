package ejemploproyectofinal;

import java.util.Scanner;

public class TrainTicketSystem {

    // Crear las variables para las entidades
    /* Ferrocarriles de Antioquia requiere un sistema que permita asignar
    * un ticket en un tren a un usuario a través de una venta.
    * Del Usuario requiere: id, nombre , apellido, origen , destino.
    * Del cajero requiere conocer los mismos datos (id, nombre, apellido) y adicional
    * el rol y la contraseña.
    * Del tren requiere conocer: # de máquina , módelo, capacidad.
    * Del Ticket requiere conocer: Id del ticket , usuario, tren , asiento , origen , destino, precio.
    * De la venta requiere conocer: id de la venta , id del ticket, precio, cantidad , total
    * El sistema debe permitir registrar, actualizar , consultar por id , consultar todos y eliminar, para cada
    * entidad del sistema (Usuarios, trenes, tickets , ventas)
    * El sistema debe permitir navegar las opciones a través de menús
    * El sistema debe permitir registrar un cajero e iniciar sesión
    * El sistema debe permitir al cajero contar con un dashboard con los menus a las diferentes opciones.
    * después de iniciar sesión.
    * La compañia cuenta con tres trenes cada uno con capacidad de 4 pasajeros.
    * Cada tren hace un viaje de ida y vuelta, en un día , a tres destinos: Santa Fe , Cisneros y Puerto Berrio  */

    // Scanner para capturar los datos

    static Scanner sc = new Scanner(System.in);

    // Usuario tren

    static int id;
    static String nombre;
    static String apellido;
    static String origen;
    static String destino;

    //Usuario cajero

    static String rol;
    static String password;


    // Tren

    static int trenId;
    static String modelo;
    static int capacidad;

    // Ticket

    static int ticketId;
    static int usuario;
    static String origenRuta;
    static String destinoRuta;
    static String silla;
    static int tren;
    static String fecha;
    static String hora;
    static double precio;

    // Venta

    static int ventaId;
    static int ticketIdVenta;
    static int cantidad;
    static double precioVentaUnitario;
    static double totalVenta;




    public static void main(String[] args) {

        crearUsuario();
        consultarUsuarios();
        actualizarDatos();
        consultarUsuarioPorId();


    }

    // Arrays y Matrices

    static String[][] usuarios = new String[2][5];


    // Métodos Usuario

    static String [] encabezados ={"Id" , "Nombre" , "Apellido" , "Origen" , "Destino"};

    public static void crearUsuario(){

        for(int i = 0 ; i < encabezados.length; i++){
            System.out.println(encabezados);
        }

        for(int i= 0; i < usuarios.length ; i++){
            for(int j = 0 ; j < usuarios[i].length; j++){
                System.out.println("Ingrese dato " + j +": " );
                usuarios[i][j] = sc.nextLine();
            }
        }

    }

    public static void consultarUsuarios(){

        for(int i= 0; i < usuarios.length ; i++){
            for(int j = 0 ; j < usuarios[i].length; j++){
                System.out.println("Usuario: " + usuarios[i][j] + "\n" + "----------------------");
            }
        }
    }

    public static void consultarUsuarioPorId(){
        System.out.println("Indique el id del usuario a consultar");
        id = sc.nextInt();

        if( id >= 0 && id < usuarios.length){
            System.out.println("Datos usuario" + id + ": ");
            for(int j = 0 ; j < usuarios[id].length; j++){
                System.out.println(usuarios[id][j]);
            }
        }
    }

    public static void actualizarDatos(){

        System.out.println("Ingrese el id del usuario a actualizar");

        id = sc.nextInt();

        int i = id -1;

        System.out.println("Seleccione el dato a actualizar 1. Nombre 2. Apellido 3. Origen 4. Destino");

        int opcion= sc.nextInt();
        sc.nextLine();

        switch (opcion){
            case 1:
                System.out.println("Actualizar nombre");
                usuarios[i][1] = sc.nextLine();
                break;
            case 2:
                System.out.println("Actualizar apellido");
                usuarios[i][2] = sc.nextLine();
                break;
            case 3:
                System.out.println("Actualizar origen");
                usuarios[i][3] = sc.nextLine();
                break;
            case 4:
                System.out.println("Actualizar destino");
                usuarios[i][4] = sc.nextLine();
                break;
            default:
        }
    }





    // Métodos del Tren

    //Metodos registro Cajero

    // Metodo de Creación del ticket

    // Registro de la venta

    // Metodo de la App

    // login

    // menu de app

    // menu de Usuario

    // menu de Tren

    // menu tickets

    // menu venta




}
