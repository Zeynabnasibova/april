package leetcodeCom;

public class ReverseStringII541 {

    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int j = Math.min(i + k - 1, n - 1);
            swap(arr, i, j);
            i += 2 * k;
        }
        return String.valueOf(arr);
    }

    private void swap(char[] arr, int left, int rigth) {
        while (left < rigth) {
            char temp = arr[left];
            arr[left++] = arr[rigth];
            arr[rigth--] = temp;
        }
    }

}