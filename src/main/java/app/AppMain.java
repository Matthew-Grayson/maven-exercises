package app;

import org.apache.commons.lang3.StringUtils;
import util.Input;


public class AppMain {

    public static void main(String[] args) {
        changeString("Enter Something: ");
    }
    public static void changeString(String prompt) {
        Input input = new Input();
        String userInput = input.getString(prompt);
        System.out.format(
                """
                        You Entered: %s
                        %s is %s
                        Flipped Case: %s
                        Reversed: %s
                        """, userInput, userInput, isNumber(userInput), StringUtils.swapCase(userInput), StringUtils.reverse(userInput)
                );
    }
    public static String isNumber(String input) {
        if(StringUtils.isNumeric(input)) return "a number.";
        return "not a number.";
    }

}
