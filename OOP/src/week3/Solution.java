package week3;

public class Solution {
    private int numerator;
    private int denominator;

    public Solution() {
        this.numerator = 0;
        this.denominator = 1;
    }

    /**
     * khai bao phan so.
     *
     * @param numerator   tu so
     * @param denominator mau so
     */
    public Solution(int numerator, int denominator) {
        if (denominator != 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else {
            this.numerator = numerator;
            // chinh sua
            this.denominator = 1;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * set.
     *
     * @param denominator denominator
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Error!!!");
            this.denominator = 1;
        }
    }

    /**
     * tim uoc chung lon nhat cua hai so nguyen.
     *
     * @param a tu so
     * @param b mau so
     * @return uoc chung lon nhat cua hai so tren
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * rut gon phan so.
     */
    public Solution reduce() {
        Solution s = new Solution();
        int x = this.numerator;
        int y = this.denominator;
        s.numerator = x / gcd(x, y);
        s.denominator = y / gcd(x, y);
        return s;
    }

    /**
     * cong 2 phan so.
     *
     * @param s2 phan so thu hai
     * @return ket qua cong duoc gan vao phan so thu nhat
     */
    public Solution add(Solution s2) {
        int x = this.numerator;
        int y = this.denominator;
        this.numerator = x * s2.denominator + y * s2.numerator;
        this.denominator = y * s2.denominator;
        return this.reduce();
    }

    /**
     * tru 2 phan so.
     *
     * @param s2 phan so thu hai
     * @return ket qua tru duoc gan vao phan so thu nhat
     */
    public Solution subtract(Solution s2) {
        int x = this.numerator;
        int y = this.denominator;
        this.numerator = x * s2.denominator - y * s2.numerator;
        this.denominator = y * s2.denominator;
        return this.reduce();
    }

    /**
     * nhan 2 phan so.
     *
     * @param s2 phan so thu hai
     * @return ket qua nhan duoc gan vao phan so thu nhat
     */
    public Solution multiply(Solution s2) {
        int x = this.numerator;
        int y = this.denominator;
        this.numerator = x * s2.numerator;
        this.denominator = y * s2.denominator;
        return this.reduce();
    }

    /**
     * chia 2 phan so.
     *
     * @param s2 phan so thu hai
     * @return ket qua cong duoc gan vao phan so thu nhat
     */
    public Solution divide(Solution s2) {
        if (s2.numerator == 0) {
            System.out.println("error");
        } else {
            int x = this.numerator;
            int y = this.denominator;
            this.numerator = x * s2.denominator;
            this.denominator = y * s2.numerator;
            //return this;
        }
        return this.reduce();
    }


    /**
     * so sanh 2 phan so.
     *
     * @param obj kieu du lieu
     * @return neu kieu du lieu la Solution thi tiep tuc so sanh, khong thi tra ve false
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof Solution)) {
            return false;
        } else {
            Solution temp = (Solution) obj;
            Solution s1 = temp.reduce();
            Solution s2 = this;
            s2 = s2.reduce();
            if (s2.numerator == s1.numerator && s2.denominator == s1.denominator) {
                return true;
            } else {
                return false;
            }
        }

    }

    /**
     * function main.
     *
     * @param args args
     */
    public static void main(String[] args) {
        Solution s1 = new Solution(3, 6);
        s1.reduce();
        System.out.println(s1.numerator + "/" + s1.denominator);
        Solution s2 = new Solution(2, 4);
        //s1.add(s2);
        //System.out.println(s1.numerator + "/" + s1.denominator);
        System.out.println(s2.numerator + "/" + s2.denominator);
        System.out.println(s1.equals(s2));
    }

}
