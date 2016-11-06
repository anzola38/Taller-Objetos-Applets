package MetodosDeOrdenamiento;

public class RadixSort {

	/**
	 * Este metodo ordena un conjunto de numeros mediante el metodo de
	 * ordenamiento radix sort <b>pre:</b>Para que un conjunto de numeros pueda
	 * ser organizado los numeros tiene que estar guardados en un vector o
	 * arreglo de tipo String<br>
	 * <b>post:</b>se a organizado el conjunto de numeros<br>
	 * 
	 * @param o
	 *            conjunto de numeros que el usuario ingresa
	 * @return arreglo de tipo entero que contiene el conjunto de numeros ordenados
	 */
	
	public static int[][] sort(String[] o) {
	    
        int[][] numbers=null;
       
        try {
            String[] input = o;

           int max = 0;
			
			for(int i = 0; i < input.length; i++)
			{
				max = input[i].length() > max ? input[i].length() : max;
			}
			
			numbers = new int[input.length][max];
			
			
			for(int i = 0; i < input.length; i++)
			{
				for(int j = 0; j < input[i].length(); j++)
				{
                                    try{
                                        
                                        numbers[i][max - 1 - j] = Integer.parseInt( input[i].substring( input[i].length() - 1 - j, input[i].length() - j ) );
                                        
                                    }catch(Exception e){
                                        
                                    }
					
				}
                        }
			MergeSort mergeSort = new MergeSort();
			
			
			
			for(int i = max - 1; i >= 0; i--)
			
                        {
			
                            numbers = mergeSort.sortByColumn(numbers, i);
			
                        }
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
        return numbers;
    }

	
}
