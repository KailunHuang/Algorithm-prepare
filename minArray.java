import java.util.Arrays;

/***
 * created by huang ON 2020/7/9
 */

public class minArray {
    public static int minArray(int[] numbers) {
        int size = numbers.length;
        int first_number = numbers[0];
        int last_number = numbers[size-1];
        int middle_index = size/2;
        if (first_number < last_number){
            return first_number;
        }
        if (size==1){
            return numbers[0];
        }
        if (size==2){
            if (numbers[0]>numbers[1]){
                return numbers[1];
            }else{
                return numbers[0];
            }
        }
        if (numbers[middle_index]<numbers[middle_index-1]){
            return numbers[middle_index];
        }else{
            if ((numbers[middle_index] == first_number) && (numbers[middle_index]==last_number)){
                return Math.min(minArray(Arrays.copyOfRange(numbers, 0, middle_index)), minArray(Arrays.copyOfRange(numbers, middle_index, size)));
            }else if ((numbers[middle_index] >= first_number) && (numbers[middle_index]<=last_number)){
                return minArray(Arrays.copyOfRange(numbers, 0, middle_index));
            }else if((numbers[middle_index]<=first_number) && (numbers[middle_index]<=last_number)){
                return minArray(Arrays.copyOfRange(numbers, 0, middle_index));
            }else {
                return minArray(Arrays.copyOfRange(numbers, middle_index, size));
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10,10,10,1,10};
        System.out.println(minArray(numbers));
    }
}
