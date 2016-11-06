package Busqueda;

public class LinearSearch {

	/**
	 * Este metodo permite buscar un numero en un conjunto de numeros por medio
	 * del metodo de busqueda Linear Search <b>pre:</b>Para poder realizar la
	 * busqueda el conjunto de numeros debe de estar ordenado y tiene que ser un
	 * arreglo o un vector de tipo entero tambien el usuario tiene que ingresar
	 * el numero que desea buscar<br>
	 * <b>post:</b>se a buscado el numero en un conjunto de numeros<br>
	 * 
	 * @param array
	 *            conjunto de numeros donde se va a realizar la busqueda
	 * @param dato
	 *            numero que se desea buscar
	 * @return posicion donde se encuentra el numero
	 */
	
    public int linearsearch(int[] array, int dato) {

        int index=-1;
       
        String hola="";
        
        for (int i = 0; i <array.length; i++) {

            if (array[i]==dato||dato==array[i]) {
            	index=i;
                break;
               
            }

        }
        return index;
    }

}
