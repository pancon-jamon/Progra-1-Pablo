import java.util.Scanner;

public class StringsEjems {
    public static void main(String[] args) {
        String codigo = "GY-05";
        String codigoDos = "QC-121";

        int codigoNumU= Integer.parseInt(codigo.substring(3));
        int codigoNumD = Integer.parseInt(codigoDos.substring(3));

        System.out.println("" + codigoNumU+ "" +codigoNumD);

        codigo = "GY-05--Leche";
        //Imprimir de leche hay 5 unidades
        //primero buscar si existe leche e imprima cuantas unidades hay
        //contains para encontrar leche
        if(codigo.toLowerCase().contains("leche".toLowerCase()))
            System.out.println("Hay leche y tiene " + codigo.charAt(4) + " unidades");

        if(codigo.toLowerCase().contains("leche".toLowerCase()))
            System.out.println("Hay leche y tiene " + codigo.substring(3, codigo.indexOf("--")) + " unidades");
        
    }
    
}
//consultar split
//de un texto imprimir caracter por caracter, puede ser con un charAt
