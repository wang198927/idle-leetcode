import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] numbers, int target){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0 ; i<numbers.length;i+=1){
            int difference = target - numbers[i];
            if(map.containsKey(difference)){
                return new int[] {map.get(difference),i};
            }
            map.put(numbers[i],i);
        }
        throw new IllegalArgumentException("not found");
    }

    public static void main(String[] args) {
        int[] nums={1,5,7,10};
        int target = 11;
        TwoSum so= new TwoSum();

        int[] result = so.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
