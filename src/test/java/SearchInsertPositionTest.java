import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertPositionTest {

    @Test
    public void searchInsertPosition() {
        SearchInsertPosition instance = new SearchInsertPosition();
        int[] nums = {1,3,5,7};
        int target = 2;
        int index;
        index = instance.searchInsertPosition(nums,target);
        System.out.println(index);

    }
}