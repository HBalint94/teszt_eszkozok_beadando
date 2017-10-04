package com.epam.university.assignment.strings;

/**
 * https://hu.wikipedia.org/wiki/Palindrom
 */
public class PalidromCheck {

    public boolean isPalindrom(String str){
        String reverse = new StringBuilder(str).reverse().toString();
        // Mindig true val tért vissza mert a kapott paramétert hasonlítgattuk önmagával.Átírtam az
        // equals paraméterét reverse-re.
        return str.equals(reverse);
    }

}
