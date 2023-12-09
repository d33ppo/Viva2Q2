package viva2q2;
import java.util.Arrays;
public class Viva2q2 {
    public static void main(String[] args) {
//        double[] array1 = {5.2, 2.1, 17.2};
//        double[] array2 = {1.3, 2.4, 2.1, 11.1};
        double [] array1 = {2.5, 1.2, 3.3, 4.7};
        double [] array2 = {10.3, 4.2, 6.6, 2.1};
        Arrayinput(array1,array2);
    }
    public static void Arrayinput(double array1[],double array2[]){
        double[] array3 = new double[array1.length + array2.length];
        int i=0;
        for (; i < array1.length; i++) {
            array3[i]=array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array3[i]=array2[j];
            i++;
        }
        Arrays.sort(array3);
        for (int k = 0; k < i; k++) {
            System.out.print(array3[k]);
            if(k < i-1)
                System.out.print(", ");
        }
        System.out.println();
        
        double median = 0;
        if(array3.length%2 == 1){
            System.out.printf("Median of array: %.3f",array3[i/2]);
            System.out.println();
        }
        else{
            median = (double)(array3[(array3.length/2)-1]+array3[(array3.length/2)])/2;
            System.out.printf("Median of array: %.3f",median);
            System.out.println();
        }
       
        
    }
    //Difference
    //array3[i] = array1[i]: This statement means that you are assigning the value of array1[i] to the element at index i in array3. This is essentially copying the value from array1 to array3
    //array1[i] = array3[i]: This statement means that you are assigning the value of array3[i] to the element at index i in array1. This is essentially copying the value from array3 to array1
}
