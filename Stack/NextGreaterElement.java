package Stack;

import java.util.Stack;

public class NextGreaterElement {

    public static int[] greaterElement(int arr[]) {
        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> st = new Stack<>();

        st.push(arr[n-1]);
        result[n-1] = -1;

        for (int i = n-2; i >=0; i--) { // Corrected loop condition
            while (!st.isEmpty() && st.peek() < arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) result[i] = -1;
            else result[i] = st.peek();
            st.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10, 8};

        int ans[] = greaterElement(arr);

        for (int i = 0; i <ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
