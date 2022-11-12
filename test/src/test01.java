public class test01 {
    public static void main(String[] args) {
        int s = 12321;
        int A = s % 100000 / 10000;
        int B = s % 10000 / 1000;
        int C = s % 1000 / 100;
        int D = s % 100 / 10;
        int E = s % 10 / 1;
        if (A == E && B == D) {
            System.out.println("该数字是回文数。");
        }
    }





