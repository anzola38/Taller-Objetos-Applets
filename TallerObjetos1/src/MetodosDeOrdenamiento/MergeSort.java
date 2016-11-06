package MetodosDeOrdenamiento;

public class MergeSort {

public static int[][] sortByColumn(int[][] numbers, int column) {
        
        if (numbers.length > 1) {
        
            int n = numbers.length / 2;
            
            int[][] array_left = new int[n][numbers[0].length];
            
            int[][] array_right = new int[numbers.length - n][numbers[0].length];

            for (int i = 0; i < n; i++) {
            
                array_left[i] = numbers[i];
            
            }

            for (int i = 0; i < array_right.length; i++) {
            
                array_right[i] = numbers[i + n];
            
            }

            array_left = sortByColumn(array_left, column);
            
            array_right = sortByColumn(array_right, column);

            return mergeByColumn(array_left, array_right, column);
 
        } else {
        
            return numbers;
        
        }
    
    }

    /**
     * Este metodo asigna los numeros del usuario a el vector derecho y al
     * izquierdo
     *
     * @param array_left se encuentran almacenados parte de los numeros
     * ingresados por el usuario
     * @param array_right se encuentran almacenados parte de los numeros
     * ingresados por el usuario
     * @param column columna en la que se encuentra organizando
     * @return retorna los numeros asignados
     * <b>pre:</b>Los datos que el usuario ingresa son todos numericos<br>
     * <b>post:</b> Se a asignado los numeros a sus respectivos vectores<br>
     */
    public static int[][] mergeByColumn(int[][] array_left, int[][] array_right, int column) {
    
        int[][] temp = new int[array_left.length + array_right.length][2];
        
        int left = 0, right = 0, index = 0;

        while (left < array_left.length && right < array_right.length) {
        
            if (array_left[left][column] <= array_right[right][column]) {
            
                temp[index] = array_left[left];
                
                left += 1;
           
            } else {
            
                temp[index] = array_right[right];
                
                right += 1;
            
            }
        
            index += 1;
        
        }

        if (left < array_left.length) {
        
            for (int i = left; i < array_left.length; i++) {
            
                temp[index] = array_left[i];
                
                index += 1;
            
            }
        
        } else {
        
            for (int i = right; i < array_right.length; i++) {
            
                temp[index] = array_right[i];
                
                index += 1;
            
            }
        
        }

        return temp;
    
    }
    
	
}
