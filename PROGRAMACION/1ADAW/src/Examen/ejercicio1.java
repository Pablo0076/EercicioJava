package agregacionycomposicion;

public class Main {

    public static void main(String[] args) {
        Libro Libro1 = new Libro("El diario de Pablo", "11/10/2002", "Greg");
        Libro Libro2 = new Libro("El diario de Gema", "11/10/2002", "Greg");
        Libro Libro3 = new Libro("El diario de Alonso", "11/10/2002", "Greg");

        Biblioteca Biblioteca = new Biblioteca("Diario de Greg");
        Biblioteca Biblioteca2 = new Biblioteca();
        Biblioteca Biblioteca3 = new Biblioteca("Diario de Greg", Libro1, Libro2, Libro3);

        Biblioteca.aniadirLibros(Libro1);
        System.out.println(Biblioteca2.getNombre());
        Biblioteca2.mostrarLibroEspecifico("Diario de Greg");
        System.out.println("---------------");
        Biblioteca2.mostrarLibro();
        System.out.println("---------------");
        Biblioteca3.mostrarLibro();
        System.out.println("---------------");
        Biblioteca3.mostrarLibroInvertido();
         System.out.println("---------------");
        Biblioteca3.eliminarLibro("EL diario de Pablo");
    }

}
                
               
    }
    
}
//Implementa la clase Libro. (2 PUNTOS)

Cada libro tendrá

-Titulo -> String
-Fecha -> String
-Autor -> String

A)   Crea un constructor completo que reciba todas las variables.

1.B) Crea un Getter y un Setter de cada una de sus variables.

1.C) Crea un toString. El ToString() devolverá los datos en este formato:

-Nombre: Dagon
-Fecha de publicación: 23/04/1987
-Autor: H.P Lovecraft
--------------------------------------------

Implementa la clase Biblioteca.  (6 PUNTOS)

Cada biblioteca tendrá

-Nombre -> String
-ArrayList de Libros (Será un ArrayList que contenga libros)

2.A) Crea un constructor en el que el usuario le pase entre paréntesis el nombre de la biblioteca. Los libros se crearán dentro del constructor

2.B) Crea un constructor que no pide ningun valor(). En este el usuario no escribirá nada. La biblioteca se llamará default, igual que en el anterior, los libros se crearán dentro del constructor

2.C) Crea un constructor que pide nombre de biblioteca y 3 libros. Los libros que les pases serán añadidos a la biblioteca (A diferencia de los otros dos se enviarán desde el main, en vez de inicializarse en el constructor).

2.D) Crea un Getter y un setter para el nombre de la biblioteca.

2.E) Crea el método aniadirLibros(Libro). El método recibirá un libro  y añadirá este libro al ArrayList que guarda libros en la propia biblioteca.

2.F) Crea el método void llamado mostrarLibro(). No recibe ningún parámetro, y devolverá el nombre de todos los libros.

2..G) Crea el método void llamado mostrarLibroEspecifico(String nombre). Este método devolverá un libro que tenga el nombre que se pase. Recuerda que dentro del for debes de buscar un libro que tenga ese nombre y mostrar todos sus datos. Si el toString del libro funciona bastará con imprimir el libro adecuado en pantalla)
---------------------------------------------

Ejecuta todos los métodos creados en un Main para comprobar su funcionamiento (2 PUNTOS)
 
