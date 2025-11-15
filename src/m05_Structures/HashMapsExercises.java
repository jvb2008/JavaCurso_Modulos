package m05_Structures;

public class HashMapsExercises {
    static void main() {
        // ===============================
// ENUNCIADOS NIVEL MEDIO (HASHMAP, SIN BUCLES)
// ===============================

// 1) Crea un HashMap<String, Integer> llamado "edades" que guarde la edad de
//    tres personas (por ejemplo "Ana" -> 20, "Luis" -> 25, "Marta" -> 30).
//    Muestra por pantalla la edad de "Luis" y el número total de personas
//    almacenadas usando size().

// 2) Crea un HashMap<String, String> llamado "telefonos" que guarde el número
//    de teléfono de tres contactos. Muestra el teléfono de uno de ellos,
//    luego actualiza el teléfono de ese contacto usando put y muestra el
//    valor anterior y el nuevo.

// 3) Crea un HashMap<String, Double> llamado "precios" con el precio de
//    tres productos. Calcula el precio total de la compra sumando los
//    tres valores usando get y muéstralo por pantalla.

// 4) Crea un HashMap<Integer, String> llamado "salas" que asocie el número
//    de una sala con su nombre (por ejemplo 1 -> "Reuniones", 2 -> "Conferencias").
//    Elimina una de las salas usando remove y muestra el HashMap resultante
//    junto con el valor devuelto por remove (la sala eliminada).

// 5) Crea un HashMap<String, Boolean> llamado "asistencia" donde la clave
//    sea el nombre de un alumno y el valor indique si ha asistido (true/false).
//    Comprueba si un alumno concreto está en el mapa usando containsKey y
//    muestra un mensaje indicando si hay registro de su asistencia.

// 6) Crea un HashMap<String, String> llamado "usuarioRol" que asocie nombres
//    de usuario con su rol ("USER", "ADMIN", etc.). Comprueba usando
//    containsValue si existe algún usuario con el rol "ADMIN" y muestra
//    un mensaje diferente según el resultado.

// 7) Crea un HashMap<String, String> llamado "traducciones" que contenga
//    algunas palabras en inglés como clave y su traducción al español como valor.
//    Pide la traducción de una palabra concreta usando get y, si no existe
//    (get devuelve null), muestra un mensaje indicando que no se encontró.

// 8) Crea un HashMap<String, Integer> llamado "inventario" que relacione
//    el nombre de un producto con la cantidad en stock. Aumenta en 10 unidades
//    el stock de uno de los productos usando get y put, y muestra el nuevo stock.

// 9) Crea un HashMap<Integer, Double> llamado "notasExamen" que asocie el
//    número de un examen (1, 2, 3) con su nota. Calcula la nota media de los
//    tres exámenes como double y muéstrala por pantalla.

// 10) Crea un HashMap<String, String> llamado "login" donde la clave sea el
//     nombre de usuario y el valor la contraseña. Declara dos variables
//     String "usuarioIntroducido" y "passwordIntroducida" y comprueba si
//     el inicio de sesión es correcto: el usuario debe existir en el mapa
//     y la contraseña debe coincidir con la almacenada. Muestra si el login
//     es correcto o incorrecto.


// ===============================
// ENUNCIADOS NIVEL AVANZADO (HASHMAP, SIN BUCLES)
// ===============================

// 11) Crea dos HashMap<String, Double> llamados "preciosTiendaA" y
//     "preciosTiendaB" con el precio de un mismo producto en dos tiendas
//     distintas (por ejemplo clave "Manzana", "Pan", "Leche").
//     Compara el precio de un producto concreto en ambas tiendas usando get
//     y muestra por pantalla en cuál es más barato o si cuestan lo mismo.

// 12) Crea dos HashMap<String, Integer> llamados "stockMinimo" y "stockActual"
//     que tengan las mismas claves (por ejemplo "Teclado", "Raton").
//     Para dos productos concretos, comprueba si el stock actual es menor
//     que el stock mínimo necesario y muestra un mensaje indicando si cada
//     producto necesita reposición o no, sin usar bucles.

// 13) Crea un HashMap<String, Double> llamado "notasFinales" que asocie
//     el nombre de una asignatura ("Matemáticas", "Lengua", "Inglés") con
//     la nota final. Determina qué asignatura tiene la mejor nota comparando
//     los valores con if y guarda el nombre de esa asignatura y la nota
//     en variables. Muestra por pantalla la asignatura con mejor nota.

// 14) Crea dos HashMap<String, Double> llamados "salariosAntes" y "salariosDespues"
//     para los mismos empleados (por ejemplo "Ana", "Luis").
//     Para un empleado concreto, calcula cuánto ha aumentado su salario
//     en valor absoluto y en porcentaje (respecto al salario anterior)
//     y muestra ambos datos por pantalla.

// 15) Crea un HashMap<String, Integer> llamado "colorRGB" que use como claves
//     "R", "G" y "B" para representar los componentes de color rojo, verde y azul.
//     Asegúrate de que cada componente esté entre 0 y 255: si algún valor es menor
//     que 0 ponlo a 0, y si es mayor que 255 ponlo a 255 usando get y replace o put.
//     Muestra el mapa corregido.

// 16) Crea un HashMap<String, Double> llamado "preciosUnitarios" con el precio
//     de algunos productos, y otro HashMap<String, Integer> llamado "cantidades"
//     con la cantidad comprada de esos productos (por ejemplo "Pan", "Leche").
//     Calcula el precio total de la compra para dos productos concretos,
//     multiplicando precio unitario por cantidad de cada uno y sumando ambos.
//     Muestra el total por pantalla.

// 17) Crea un HashMap<String, String> llamado "colorFavorito" que asocie nombres
//     de personas con su color favorito. Para dos personas concretas,
//     compara sus colores favoritos obtenidos con get y muestra si comparten
//     el mismo color o no.

// 18) Crea dos HashMap<String, Integer> llamados "puntosNivel1" y "puntosNivel2"
//     que guarden la puntuación de varios jugadores en dos niveles distintos.
//     Para un jugador concreto, calcula su puntuación total (suma del nivel 1 y 2)
//     y muéstrala por pantalla. Si el jugador no existe en alguno de los mapas
//     (get devuelve null), trátalo como 0 puntos en ese nivel.

// 19) Crea un HashMap<String, Double> llamado "saldos" para representar las
//     cuentas de un banco (clave: número de cuenta, valor: saldo).
//     Simula una transferencia de una cantidad concreta desde una cuenta origen
//     a una cuenta destino: comprueba si la cuenta origen tiene saldo suficiente,
//     actualiza ambos saldos usando get y put, y muestra los saldos finales.

// 20) Crea un HashMap<String, Integer> llamado "fecha" con claves "dia",
//     "mes" y "anio" para representar una fecha. Comprueba si la fecha es
//     válida con estas reglas simples: día entre 1 y 31, mes entre 1 y 12
//     y año mayor que 0. Muestra true o false según sea válida o no.

    }
}
