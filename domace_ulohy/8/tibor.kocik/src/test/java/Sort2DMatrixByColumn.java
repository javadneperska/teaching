import java.util.Arrays;
import java.util.Comparator;

public class Sort2DMatrixByColumn {
    public static String[][] sortByColumn(String[][] arr, final int col)
    {
        String[][] arr2 = new String[arr.length-1][arr[0].length];
        String[][] arr3 = new String[arr.length][arr[0].length];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[i][j] = arr[i+1][j];
            }
        }
        Arrays.sort(arr2, new Comparator<String[]>() {

            public int compare(String[] o1, String[] o2) {
                if(col == 5)
                {
                    int a = Integer.parseInt(o1[col]);
                    int b = Integer.parseInt(o2[col]);
                    if ( a > b)
                        return 1;
                    else
                        return -1;
                }
                else
                    return o1[col].compareTo(o2[col]);
            }
        });
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i!=0)
                {
                    arr3[i][j] = arr2[i-1][j];
                }
                else
                {
                    arr3[i][j] = arr[i][j];
                }
            }
        }
        arr = arr3;
        return arr;
    }

    public static boolean isInteger(String s, int radix) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i),radix) < 0) return false;
        }
        return true;
    }
}
