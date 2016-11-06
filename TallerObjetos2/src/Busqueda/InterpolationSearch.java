package Busqueda;

public class InterpolationSearch {

	/**
	 * Este metodo permite buscar un numero en un conjunto de numeros por medio
	 * del metodo de busqueda Interpolation Search <b>pre:</b>Para poder realizar
	 * la busqueda el conjunto de numeros debe de estar ordenado y tiene que ser
	 * un arreglo o un vector de tipo entero tambien el usuario tiene que
	 * ingresar el numero que desea buscar<br>
	 * <b>post:</b>se a buscado el numero en un conjunto de numeros<br>
	 * 
	 * @param array
	 *            conjunto de numeros donde se va a realizar la busqueda
	 * @param data
	 *            numero que se desea buscar
	 * @return posicion donde se encuentra el numero
	 */

	public int interpolationSearch(int[]array,int data){
		int lower=0;
		int higher=array.length-1;
		int index=-1;
		int middle=0;
		while (true){
			if(lower>=higher ||array[lower]==array[higher]){
				break;
			}
			 middle=lower+((higher-lower)/(array[higher]-array[lower])*(data-array[lower]));
			if(array[middle]==data){
	            index=middle;
	            break;	
			}else{
				if(array[middle]<data){
					lower=middle+1;
				}else{
					if(array[middle]>data){
						higher=middle-1;
					}
				}
			}
		}
		return index;
		
	}
	
} 
