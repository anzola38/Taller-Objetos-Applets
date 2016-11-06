package Busqueda;

public class BinarySearch {
	
	/**
	 * Este metodo permite buscar un numero en un conjunto de numeros por medio
	 * del metodo de busqueda binary search <b>pre:</b>Para poder realizar la
	 * busqueda el conjunto de numeros debe de estar ordenado y tiene que ser un
	 * arreglo o un vector de tipo entero tambien el usuario tiene que ingresar
	 * el numero que desea buscar<br>
	 * <b>post:</b>se a buscado el numero en un conjunto de numeros<br>
	 * 
	 * @param vector
	 *            conjunto de numeros donde se va a realizar la busqueda
	 * @param usuario
	 *            numero que se desea buscar
	 * @return posicion donde se encuentra el numero
	 */
	
	public int binarysearch(int[] vector, int usuario) {

        int fin = vector.length - 1;
        int inicio = 0;
        int m=-1;
        while (inicio <= fin) {
            m = (inicio + fin) / 2;
            if (vector[m] == usuario) {
            	 return m;
            } else{
            	if (usuario > vector[m]) {
                    inicio = m + 1;
                } else {
                    fin = m - 1;
                }
            	
            }
            	
        }
        
        return -1;
        
	}

}
