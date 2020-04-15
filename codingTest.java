import java.util.Arrays;
import java.util.*;
public class codingTest {

    public static void main(String arg[]) {


    }

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                count++;
            }
        }

        System.out.println("count : " +count);

        answer = new int[count];

        int state = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j]%divisor == 0){
                state++;
                answer[state] = arr[j];
            }
        }
      /*

      if(count == 1){
          answer[0] = -1;
      }
      */

        Arrays.sort(answer);
        return answer;
    }









}

