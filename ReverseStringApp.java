
package org.example;



public class App
{
    public static String ReverseString(String name) {
        String name1 = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            name1 += name.charAt(i);
        }
        return name1;
    }
}
