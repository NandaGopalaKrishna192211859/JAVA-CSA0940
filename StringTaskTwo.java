import java.util.Arrays;

public class StringTaskTwo {
    public static void main(String[] args) {
        String[] arr = new String[7];
        arr[0] = "A";
        arr[1] = "B";
        arr[2] = "C";
        arr[3] = "D";
        arr[4] = "E";
        System.out.println("Original Array : "+Arrays.toString(arr));
        int num = 5;
        String n1 = "F";
        String n2 = "G";
        arr[num++] = n1;
        arr[num++] = n2;
        System.out.println("Modified Array : "+Arrays.toString(arr));
    }
}