import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("enter num1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("enter num2"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("enter num3"));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("enter num4"));
        int[] numbers = {num1, num2, num3, num4};
        System.out.println("Greatest is :" + Arrays.stream(numbers).max());
    }
}