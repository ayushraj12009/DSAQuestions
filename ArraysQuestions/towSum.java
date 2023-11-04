package ArraysQuestions;

import java.util.HashMap;

public class towSum {

    public static int[] targetSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int exits = target - arr[i];
            if(map.containsKey(exits)){
                return new int[] {map.get(exits), i};
            }
            map.put(arr[i], i);
        }
        return new int[] {-1 , -1};

    }

    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;

        int ans[] = targetSum(arr, target);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }

    }
}
