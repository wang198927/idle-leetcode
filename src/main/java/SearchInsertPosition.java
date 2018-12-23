import java.util.Arrays;

public class SearchInsertPosition {
    public int searchInsertPosition(int[] nums , int target){
        int index =  Arrays.binarySearch(nums,target);
        index = index >= 0 ? index : -index -1;
        return index;
    }
}
