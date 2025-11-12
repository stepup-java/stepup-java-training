package assignments.student_submissions.DevSquadX.Yash_Borekar;

import java.util.*;

public class Find2ndMaxMin {
    static void main() {
        int [] arr = {1,232,4,7,12,1223,4,25,5,9,124,64,213,1,1223,4};
//         int[] arr = {1};
        Arrays.sort(arr);
        int secondMin = 0;
        int secondMax = 0;
        if (arr.length != 1) {
            Set<Integer> linkedHashSet = new LinkedHashSet<>();
            for (int num : arr) {
                linkedHashSet.add(num);
            }
            List<Integer> sortedList = new ArrayList<>(linkedHashSet);
            secondMin = sortedList.get(1);
            secondMax = sortedList.get(sortedList.size() - 2);
        } else {
             secondMin = 0;
             secondMax = 0;
        }

        System.out.println("Second Minimum Element - " +secondMin );
        System.out.println("Second Maximum Element - " +secondMax );
    }
}
