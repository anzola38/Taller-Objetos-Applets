package MetodosDeOrdenamiento;

public class CountingSort {

	/**
	 * Este metodo permite ordenar un conjunto de numeros mediante el metodo de
	 * ordenamiento counting sort <b>pre:</b>Para que un conjunto de numeros
	 * pueda ser organizado los numeros tiene que estar guardados en un vector o
	 * arreglo de tipo entero<br>
	 * <b>post:</b>se a organizado el conjunto de numeros<br>
	 * 
	 * @param arreglo_inicial
	 *            arreglo que contiene el conjunto de numeros a ordenar
	 * @return arreglo de tipo entero que contiene el conjunto de numeros
	 *         organizado
	 */
	
	public static int[] countingSort(int[] arreglo_inicial) {

        int tamano = arreglo_inicial.length, maximo = 0, indice = 0;

        for (int i = 0; i < tamano; i++) {

            maximo = arreglo_inicial[i] > maximo ? arreglo_inicial[i] : maximo;

        }

        int[] aux = new int[maximo + 1];

        for (int i = 0; i < tamano; i++) {

            aux[arreglo_inicial[i]] += 1;

        }

        for (int i = 0; i <= maximo; i++) {

            for (int j = 0; j < aux[i]; j++) {

                arreglo_inicial[indice] = i;

                indice++;

            }

        }

        return arreglo_inicial;

    }

	
}
