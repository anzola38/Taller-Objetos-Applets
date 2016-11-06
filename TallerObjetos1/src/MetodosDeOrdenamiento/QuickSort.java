package MetodosDeOrdenamiento;

import java.util.Vector;

public class QuickSort {

	/**
	 * Este metodo ordena un conjunto de numeros mediante el metodo de
	 * ordenamiento quick sort <b>pre:</b>Para que un conjunto de numeros pueda
	 * ser organizado los numeros tiene que estar guardados en un vector o
	 * arreglo de tipo entero<br>
	 * <b>post:</b>se a organizado el conjunto de numeros<br>
	 * 
	 * @param numbers
	 *            conjunto de numeros a ordenar
	 * @return arreglo o vector de tipo entero que contiene el conjunto de
	 *         numeros ordenados
	 */
	
	public static int[] sort(int[] numbers) {

        Vector<Integer> array = new Vector<Integer>(); //Create a dynamic array

        for (int i = 0; i < numbers.length; i++) //Add all elements from integer array into vector
        {
            array.add(numbers[i]);
        }

        array = sort(array); //Call to method to order a set of elements saved into a Vector

        for (int i = 0; i < numbers.length; i++) //Pass ordered elements from Vector to Array
        {
            numbers[i] = array.get(i);
        }

        return numbers; //Return ordered array

    }

	/**
	 * This methos use a collection to apply quickSort strategy. Is an example
	 * of polymorphism. <b>pre:</b>El conjunto de numeros tiene que ser de tipo
	 * vector<Integer><br>
	 * 
	 * @param numbers
	 *            conjunto de numeros que el usuario ingreso
	 * @return orden array
	 */
	
    private static Vector<Integer> sort(Vector<Integer> numbers) {

        if (numbers.size() == 1) //if Vector size is one, recursion is finished
        {

            return numbers; //return Vector

        } else {

            Vector<Integer> arrayMinor = new Vector<Integer>(); //Create array for left side, lesser elements than pivot

            Vector<Integer> arrayMajor = new Vector<Integer>(); //Create array for left side, greater elements than pivot

            for (int i = 1; i < numbers.size(); i++) //Move through vector, and divide elements using a comparison with pivot
            {

                if (numbers.get(i) < numbers.get(0)) //Compare element with pivot
                {

                    arrayMinor.add(numbers.get(i)); //Add to left side Vector

                } else {

                    arrayMajor.add(numbers.get(i)); //Add to right side Vector
                }
            }

            Vector<Integer> orderArray = new Vector<Integer>(); //Vector that saves complete ordered Vector

            if (arrayMinor.size() > 0) //If there are elements in left side Vector, add to complete ordered Vector
            
            {

                orderArray.addAll(sort(arrayMinor)); //Because this is a recursive algorithm, to order each array side is necessary to call at quickSort strategy
            
            }
            
            orderArray.add(numbers.get(0)); //Add pivot

            if (arrayMajor.size() > 0) //If there are elements in left side Vector, add to complete ordered Vector
            
            {
            
                orderArray.addAll(sort(arrayMajor)); //Call recursivity and add to complete ordered Vector
            
            }
            
            return orderArray;

        }

    }

	
}
