import java.util.*;
import java.io.*;

public class tester {
    public static void main(String[] args) {
        String s = "./data/dictionary-algs4.txt";
        Scanner console = null;
        try {
            console = new Scanner(new File(s));
        } catch (Exception e) {
            System.out.println("hello");
        }
    }
}
