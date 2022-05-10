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
    
    public static int getIndex(int j)
    {
        Integer[] arrayWrapper = new Integer[array.length];
        for (int n = 0; n < array.length; n++)
        {
            arrayWrapper[n] = array[n];
            System.out.println("#" + n + ": " + array[n]);
        }
        int index = Arrays.asList(arrayWrapper).indexOf(j);
        return index;
    }
}
