package 字符串相加415;

/**
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 *
 * 注意：
 *
 * num1 和num2 的长度都小于 5100.
 * num1 和num2 都只包含数字 0-9.
 * num1 和num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。

 */
public class Solution {
    public static String addStrings(String num1, String num2) {

        int m=10;
        int x=10;
        int sum1=0;
        int sum2=0;
        int sum =0;
        String[] split = num1.split("");
        for (int i = 0; i < split.length; i++) {
            int n = Integer.parseInt(split[split.length-i-1]);

            if(i>=1){
                sum1=sum1+n*m;
                m*=10;
            }else {
                sum1=n;
            }
        }
        String[] split2 = num2.split("");
        for (int i = 0; i < split2.length; i++) {
            int n = Integer.parseInt(split2[split2.length-i-1]);

            if(i>=1){
                sum2=sum2+n*x;
                x*=10;
            }else {
                sum2=n;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum);
        sum =sum1+sum2;
        return  Integer.toString(sum);
    }

    public String addaStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder("");
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while(i >= 0 || j >= 0){
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int tmp = n1 + n2 + carry;
            carry = tmp / 10;
            res.append(tmp % 10);
            i--; j--;
        }
        if(carry == 1) res.append(1);
        return res.reverse().toString();
    }

    public static  String addStringss(String num1, String num2) {
        StringBuilder s = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int x = i < 0 ? 0 : num1.charAt(i--) - '0';
            int y = j < 0 ? 0 : num2.charAt(j--) - '0';
            int sum = x + y + carry;
            s.append(sum % 10);//添加到字符串尾部
            carry = sum / 10;
            System.out.println(i);
            System.out.println(j);
            System.out.println(x);
            System.out.println(y);
            System.out.println(sum);
            System.out.println(carry);

        }
        return s.reverse().toString();//对字符串反转
    }



    public static void main(String[] args) {
//        String s = addStrings("12","12");
        String s1 = addStringss("12","12");
//        System.out.println(s);
        System.out.println(s1);
    }
}