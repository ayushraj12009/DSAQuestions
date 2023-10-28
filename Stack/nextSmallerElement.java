package Stack;

import java.util.Stack;

public class nextSmallerElement {
    public static int[] nextSmallerElement(int arr[]){
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        st.push(arr[n-1]);
        result[n-1] = -1;

        for(int i=n-2; i>=0; i--){
            while(!st.empty() && st.peek()>arr[i]){
                st.pop();
            }

            if(st.size()==0) result[i] = -1;
            else result[i] = st.peek();
            st.push(arr[i]);

        }
        return result;

    }
    public static void main(String[] args) {
       int arr[] = {4, 5, 2, 10, 8};

       int ans[] = nextSmallerElement(arr);
       for(int i=0;i<ans.length;i++){
           System.out.print(ans[i] + " ");
       }
    }
}
