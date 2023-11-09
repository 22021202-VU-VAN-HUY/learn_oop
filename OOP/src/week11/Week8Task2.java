package week11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {
    public void nullPointerEx() throws NullPointerException {
        int[] s = null;
        System.out.println(s.length);
    }

    /**
     * .
     *
     * @return .
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    public void arrayIndexOutOfBoundsEx() throws ArithmeticException {
        int[] s = new int[]{0, 1};
        int k3 = s[3];
    }

    /**
     * .
     *
     * @return .
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException a) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    public void arithmeticEx() throws ArithmeticException {
        int k = 0;
        System.out.println(5 / k);
    }

    /**
     * .
     *
     * @return .
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException a) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    public void fileNotFoundEx() throws FileNotFoundException {
        File f = new File("huy.txt");
        FileReader reader = new FileReader(f);
    }

    /**
     * .
     *
     * @return .
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException f) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    public void ioEx() throws IOException {
        File f = new File("huy.txt");
        FileReader reader = new FileReader(f);
    }

    /**
     * .
     *
     * @return .
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException i) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }

}
