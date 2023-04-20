import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;

public class MethodPractice {
    public static void main(String[] args) {

        //メソッドーうるう年判定
        var mon1 = MethodPractice.isLeapYear(2020);
        System.out.println(mon1);

        //メソッドー合計値
        var mon2 = MethodPractice.getSum(5);
        System.out.println(mon2);

        //メソッドー素数判定
        var mon3 = MethodPractice.isPrime(2);
        System.out.println(mon3);

        //メソッド-階乗
        var mon4 = MethodPractice.factorial(5);
        System.out.println(mon4);

        //メソッドー配列の最大値
        int[] e = {1,8,9,6,4};
        var mon5 = MethodPractice.findMax(e);
        System.out.println(mon5);

        //メソッドー回文
        var mon6 = MethodPractice.isPalindrome("しんぶんし");
        System.out.println(mon6);

        //メソッドー年齢取得
        var mon7 = MethodPractice.getAge(2002, 6, 15);
        System.out.println(mon7);

        //メソッドー配列のソート
        int[] g = {1,2,7,4,8,9,3,6,5};
        var mon8 = MethodPractice.sortArray(g);
        System.out.println(Arrays.toString(mon8));

        //メソッドー二分探索
        int[] xy = {1,2,3,4,5,6,7,8,9};
        var mon9 = MethodPractice.getIndex(xy,2);
        System.out.println(mon9);
    }

    //メソッドーうるう年判定
    public static boolean isLeapYear(int a){
        if (a % 4 == 0 && (a % 100 !=0 || a % 400 == 0)) {
            return true;
        }else {
            return false;
        }
    }

    //メソッドー合計値
    public static int getSum(int b) {
        if (b <= 0) {
            return 0;
        }else {
            var sum = 0;
            for (var i = 0; i <= b; i++) {
                sum += i;
            }
            return sum;
        }
    }

    //メソッドー素数判定
    public static boolean isPrime(int c) {
        if (c <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(c); i++) {
            if (c % i == 0) {
                return false;
            }
        }
        return true;
    }

    //メソッド-階乗
    public static int factorial(int d) {
        var fac = 1;
        for (var i = 1; i <= d; i++) {
            fac *= i;
        }
        return fac;
    }

    //メソッドー配列の最大値
    public static int findMax(int[] e) {
        int max = e[0];
        for (var i = 0; i < e.length; i++) {
            max = Math.max(max,e[i]);
            }
        return max;
    }

    //メソッドー回文
    public static boolean isPalindrome(String f) {
        int left = 0;
        int right = f.length() - 1;
        while (left < right) {
            if (f.charAt(left) != f.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //メソッドー年齢取得
    public static int getAge(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        var currentYear = cal.get(Calendar.YEAR);
        var currentMonth = cal.get(Calendar.MONTH) + 1;
        var currentDay = cal.get(Calendar.DATE);

        int age = currentYear - year;
        if (month > currentMonth || (month == currentMonth && day > currentDay)) {
            age--;
        }
        return age;


    }

    //メソッドー配列のソート
    public static int[] sortArray(int[] g) {
        int temp = 0;
            for (int i = 0; i < g.length - 1; i++) {
                for (int j = i + 1; j < g.length; j++) {
                    if (g[i] > g[j]) {
                        temp = g[i];
                        g[i] = g[j];
                        g[j] = temp;
                    }
                }
            }
        return g;
    }

    //メソッドー二分探索
    public static int getIndex(int[] xy, int z) {
        return binarySearch(xy, z, 0, xy.length - 1);
    }
    private static int binarySearch(int[] xy, int z, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (xy[mid] == z) {
            return mid;
        } else if (xy[mid] < z) {
            return binarySearch(xy, z, mid + 1, right);
        } else {
            return binarySearch(xy, z, left, mid - 1);
        }
    }

}
