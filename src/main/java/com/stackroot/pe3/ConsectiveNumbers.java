package main.java.com.stackroot.pe3;
public class ConsectiveNumbers {
    boolean result = false;
    public boolean checkForConsectiveNumbers(String values)
    {
        //To check for the consecutive numbers//
        String[] array = values.split(",");
        for (int i = 0; i < array.length - 1; i++) {
            int difference = Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]);
            System.out.println(difference);
            if (difference == 1 || difference == -1) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
