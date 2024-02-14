
public class Main
{
	public static void main(String[] args) 
	{
		int[] arreglo = {5, 4, 3, 2, 1};
		int[] arregloDos = new int[arreglo.length];
        for(int i = 0; i< arreglo.length + 1; i++)
        {
           // for(int j = 1; j< arreglo.length; j++){
                if(arreglo[i]>arreglo[i+1])
                    arreglo[i] = arreglo[i+1];
               
            
            
           
            
        }
        for(int i = 0; i< arreglo.length; i++)
            System.out.print(arreglo[i] + " ");
    }    

}

