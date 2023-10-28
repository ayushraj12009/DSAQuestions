package Stack;

import java.util.Stack;

public class previousSmallerElement {
    public static int[] previousSmaller(int arr[]){
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st  = new Stack<>();
        st.push(arr[0]);
        result[0] = -1;

        for(int i=1;i<n;i++){
            while (!st.empty() && st.peek()>arr[i]){
                st.pop();
            }
            if(st.size()==0) result[i] = -1;
            else  result[i] = st.peek();
            st.push(arr[i]);

        }
        return result;
    }

    public static void main(String[] args) {

        int arr[] = {4, 5, 2, 10, 8};
        int ans[] = previousSmaller(arr);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
