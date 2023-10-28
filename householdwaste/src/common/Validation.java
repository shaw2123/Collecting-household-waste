package common;

import java.util.Scanner;

public class Validation {

    public String inputString(String title) {
    String s = "";
    while (s.trim().isEmpty()) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title + ": ");
        s = sc.nextLine();
    }
    return s;
}

}