package Busqueda;

public class BubbleSort {
	
	/**
	 * Este metodo sirve para ordenar un conjunto de numeros para posteriormente
	 * poder realizar una busqueda mediante los diferentes metodos de busqueda
	 * binary search, interpolation search y linear search <b>pre:</b>Para que
	 * un conjunto de numeros pueda ser organizado los numeros tiene que estar
	 * guardados en un vector o arreglo de tipo entero<br>
	 * <b>post:</b>se a organizado el conjunto de numeros<br>
	 * 
	 * @param arreglo
	 *            conjunto de numeros a ordenar
	 * @return un vector de tipo entero que contiene el conjunto de numeros
	 *         ordenados
	 */
	
	public  int[] burbuja(int[] arreglo) {

        int auxiliar;

        int[] arregloOrdenado;

        for (int i = 1; i < arreglo.length; i++) {

            for (int j = 0; j < arreglo.length - i; j++) {

                if (arreglo[j] >= arreglo[j + 1]) {

                    auxiliar = arreglo[j];

                    arreglo[j] = arreglo[j + 1];

                    arreglo[j + 1] = auxiliar;

                }

            }

        }
        
        arregloOrdenado = arreglo;

        return arregloOrdenado;

    }
}
