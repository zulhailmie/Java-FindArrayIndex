package findarrayindex;

import java.util.Arrays;

public class FindArrayIndex
{
    /* Modify values here */
    static int[] array = {5, 10, 20, 15};
    static int i = 20;
    
    public static void main(String[] args)
    {
        System.out.println("Array position of value " + i + " is #" + getIndex(i));
    }
    
    public static int getIndex(int i)
    {
        Integer[] arrayWrapper = new Integer[array.length];
        for (int j = 0; j < array.length; j++)
        {
            arrayWrapper[j] = array[j];
            System.out.println("#" + j + ": " + array[j]);
        }
        int index = Arrays.asList(arrayWrapper).indexOf(i);
        return index;
    }
}
