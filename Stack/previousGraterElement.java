package Stack;

import java.util.Stack;

public class previousGraterElement {
    public static int[] previousGrater(int arr[]){

        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        st.push(arr[0]);
        result[0] = -1;

        for(int i=1;i<n;i++){
            while(!st.empty() && arr[i] > st.peek()){
                st.pop();
            }
            if(st.size()==0) result[i] = -1;
            else result[i] = st.peek();
            st.push(arr[i]);

        }


        return result;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,2,10,5};

        int ans[] = previousGrater(arr);

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }

    }
}
