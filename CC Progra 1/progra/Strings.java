import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        String fraseUno = "Hola";
        String fraseDos = "Esta es una oracion adicional";

        // Transformar strings en minúsculas
        System.out.println(fraseUno.toLowerCase()); // Imprimirá sin cambiar el valor original
        String textoUnoMin = fraseUno.toLowerCase();
        fraseUno = fraseUno.toLowerCase(); // Reasigna el valor

        System.out.println(textoUnoMin); // Imprime la variable con el valor en minúscula
        System.out.println(fraseUno);
        //String ejemplo = sc.nextLine().toLowerCase(); // El texto ingresado será todo en minúscula
        //System.out.println(ejemplo);

        // toUpperCase transforma texto a mayúscula
        System.out.println(fraseDos.toUpperCase());
        System.out.println(fraseDos);
        String textoDosMay = fraseDos.toUpperCase();
        System.out.println(textoDosMay);

        // Substring Obtiene una parte del string, me sirve para encontrar patrones o docigod
        String subStringUno = fraseUno.substring(3); // Ejemplo: "unhappy".substring(2) returns "happy"
        System.out.println(subStringUno);
        String subStringDos = fraseDos.substring(0, 1); // Ejemplo: "hamburger".substring(4, 8) returns "urge"
        System.out.println(subStringDos);

        //Equals: retorna un booleano compara caracter a caracter dos string
        System.out.println(fraseUno.toLowerCase().equals("Hola".toUpperCase()));//primero transformo a minusculas y luego comparo hola en mayusculas
        
        //charAt: retorna un caracter en una posicion
        char caracterPos = fraseUno.charAt(0);
        System.out.println(caracterPos);

        //contains: me retorna un boolean dependiendo si en un texto se encuentra un texto especifico, me sirve en busqueda dentro de un texto grande
        boolean banderaCont = fraseUno.contains("OL");
        System.out.println(banderaCont);
        
        //indexOf: si encuentra un texto expecifico devuelve la posicion donde empieza un subtring si no retorna -1
        int pos = fraseUno.indexOf("o");
        System.out.println(pos); 

        //lenght: cantidad de caracteres, puede ser usado en for
        int size = fraseUno.length();//esto es una fucion, el otro (sin parentesis) es una variable, atributo, de un objeto
        System.out.println(size);

        //trim: quita espacios en blanco antes y despues del texto
        System.out.println(fraseDos.trim());

        //replace: reemplaza un substring a otro
        System.out.println(fraseDos.replace("ora", "Pablo"));

        //isBlank: retorna un bool si un string es un texto en blanco, isEmpty si esta vacio
        System.out.println("            ".isBlank());
        System.out.println("            ".isEmpty());

    }
}
/*La función split() en Java se utiliza para dividir una cadena (String) en subcadenas basadas en un delimitador específico y devuelve 
un array de subcadenas resultantes. 

    String cadena = "Hola|este|es|un|ejemplo";
        
    // Dividir la cadena utilizando el delimitador "|"
        String[] subcadenas = cadena.split("\\|"); // Necesitas escapar el carácter "|" con "\\"
        
        // Imprimir las subcadenas resultantes
        for (String subcadena : subcadenas) {
            System.out.println(subcadena);
        }
*/
