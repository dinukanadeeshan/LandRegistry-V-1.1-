/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package others;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nadeeshan
 */
public class Validation {

    public static boolean validateInt(String text) {
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public static boolean validatePhoneNumber(String text) {
        String regex = "^0[1-9]{2}[0-9]{7}$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public static boolean validateName(String text) {
        String regex = "^[a-zA-Z\\p{Blank},;]+$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public static boolean validateNIC(String text) {
        String regex = "^[0-9]{0,9}$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public static boolean validateValue(String text) {
        String regex = "^[0-9]{3}([.])?([0-9]){2}$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public static boolean validateValueInt(String text) {
        String regex = "^[0-9]+[.]?[0-9]?[0-9]?$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public static boolean validateClientCode(String text) {
        String regex = "^[A-Z0-9]+$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();

    }

    public static boolean validateYear(String text) {
        String regex = "^[1-9][0-9]{3}$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public static boolean validateDayBookNo(String text) {
        return text.matches("^[LG]([0-9]?){5}[/]?[0-9]{0,2}$");
    }

    public static boolean validateNotryCode(String text) {
        String regex = "^[A-Z]?([0-9]+)?$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();

    }

    public static boolean validateDateChar(String text) {
        String regex = "^[0-9-]+$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public static boolean validateDate(String text) {
        String regex = "^[1-2][8-90][0-9][0-9][-][0-1][0-9][-][0-3][0-9]$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
    
    public static boolean validateUserName(String text) {
        String regex = "^[a-zA-Z_]+$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
}
