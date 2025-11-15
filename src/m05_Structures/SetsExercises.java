package m05_Structures;

public class SetsExercises {
    static void main() {
        // ===============================
// ENUNCIADOS NIVEL MEDIO (SETS, SIN LOOPS)
// ===============================

// 1) Crea un Set<String> llamado "paisesVisitados" y añade al menos 4 países
//    (incluyendo "España"). Muestra por pantalla el conjunto completo,
//    si contiene "España" usando contains, y el tamaño del set con size().

// 2) Crea un Set<String> llamado "etiquetas" para etiquetas de una foto.
//    Añade varias etiquetas, incluyendo alguna repetida (por ejemplo "playa" dos veces).
//    Muestra el contenido del set y el tamaño para comprobar que no se repiten.

// 3) Crea un Set<Integer> llamado "numerosLoteria" e intenta añadir 6 números,
//    incluyendo al menos un número repetido. Muestra el tamaño del set y un mensaje
//    que indique si la combinación es válida (tamaño 6) o no (menos de 6).

// 4) Crea un Set<Character> llamado "vocalesEnNombre" que contenga las vocales
//    diferentes que aparecen en tu nombre (por ejemplo, 'A', 'E') añadiéndolas a mano.
//    Muestra las vocales guardadas y cuántas vocales distintas tiene tu nombre.

// 5) Crea un Set<String> llamado "rolesUsuario" que pueda contener roles como
//    "LECTOR", "EDITOR" y "ADMIN". Añade dos roles al usuario, comprueba si tiene
//    el rol "ADMIN" usando contains y muestra un mensaje diferente según el resultado.

// 6) Crea un Set<Integer> llamado "diasConectado" que contenga números que representen
//    días de la semana en los que un usuario se conectó (por ejemplo 1=Lunes, 7=Domingo).
//    Añade algunos días y muestra si el usuario se conectó en fin de semana
//    (comprueba si contiene 6 o 7).

// 7) Crea un Set<String> llamado "comandosDisponibles" con varios comandos de consola
//    (por ejemplo "start", "stop", "restart"). Elimina el comando "restart" con remove
//    y muestra el set antes y después de eliminarlo.

// 8) Crea un Set<String> llamado "categorias" con algunas categorías de productos.
//    Comprueba si el set está vacío con isEmpty(), luego elimina todos los elementos
//    con clear() y vuelve a comprobar si está vacío. Muestra los resultados.

// 9) Crea un Set<String> llamado "invitadosFiesta" con al menos 3 nombres.
//    Quita uno de los invitados con remove y muestra tanto el set resultante
//    como el booleano devuelto por remove para indicar si el invitado existía.

// 10) Crea un Set<String> llamado "lenguajes" y añade nombres de lenguajes
//      de programación. Intenta añadir "Java" dos veces. Muestra el set y un mensaje
//      indicando si "Java" estaba ya presente comprobando el resultado de add.


// ===============================
// ENUNCIADOS NIVEL AVANZADO (SETS, SIN LOOPS)
// ===============================

// 11) Crea dos sets Set<String> llamados "modulosCompletados" y "modulosRequeridos"
//     con algunos nombres de módulos (por ejemplo "Intro", "POO", "BD").
//     Comprueba si el usuario ha completado todos los módulos requeridos
//     usando containsAll y muestra true o false.

// 12) Crea dos sets Set<String> llamados "amigosRedA" y "amigosRedB" con nombres
//     de personas. Calcula la intersección (amigos comunes) creando una copia de
//     uno de los sets y usando retainAll. Muestra los amigos comunes por pantalla.

// 13) Crea dos sets Set<String> llamados "registradosEvento" y "pagadoEntrada".
//     Calcula las personas que están registradas pero aún no han pagado creando
//     una copia de "registradosEvento" y usando removeAll con "pagadoEntrada".
//     Muestra la lista de personas que deben pagar.

// 14) Crea dos sets Set<String> llamados "clavesSistemaA" y "clavesSistemaB"
//     con nombres de claves de configuración. Calcula la unión de ambos sistemas
//     en un nuevo set usando addAll y muéstrala por pantalla.

// 15) Crea dos sets Set<String> llamados "ingredientesReceta1" e "ingredientesReceta2".
//     Comprueba si las recetas usan exactamente el mismo conjunto de ingredientes
//     (ignorando el orden) comparando los sets con equals y muestra el resultado.

// 16) Crea un Set<Integer> usando TreeSet<Integer> llamado "puntuaciones".
//     Añade varias puntuaciones (números enteros) desordenadas. Muestra la puntuación
//     mínima y máxima usando los métodos first() y last() de TreeSet sin usar bucles.

// 17) Crea un Set<Character> llamado "letrasPalabra" con las letras de una palabra
//     concreta (por ejemplo "CASA") añadiendo las letras una por una.
//     Compara el tamaño del set con la longitud de la palabra para determinar si
//     tiene letras repetidas (si el tamaño del set es menor que la longitud).
//     Muestra un mensaje indicando si la palabra tiene letras repetidas o no.

// 18) Crea un Set<String> llamado "permisosUsuario" y otro Set<String> llamado
//     "permisosNecesarios" con permisos como "READ", "WRITE", "DELETE".
//     Comprueba si el usuario tiene al menos todos los permisos necesarios usando
//     containsAll y muestra un mensaje de "Acceso concedido" o "Acceso denegado".

// 19) Crea dos sets Set<Integer> llamados "pares" e "impares" con algunos
//     números pares e impares. Crea un tercer set llamado "numeros" que contenga
//     todos los números de ambos usando addAll. Muestra los tres sets por pantalla.

// 20) Crea un Set<String> llamado "dominiosConfiables" con dominios como
//     "example.com", "midominio.com". Dado un correo concreto en un String
//     (por ejemplo "usuario@example.com"), extrae el dominio (la parte después de '@'),
//     comprueba si pertenece al set de dominios confiables y muestra el resultado.

    }
}
