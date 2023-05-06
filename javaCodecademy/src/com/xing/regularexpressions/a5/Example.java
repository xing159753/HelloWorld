package com.xing.regularexpressions.a5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("gray|grey", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Vibrant light bloomed across the gray sky, illuminating its grey haze in flashes amidst rolling hills of wispy gray clouds. Colors of gold, pink, and purple painted the horizon, the dull grey of the sky overtaken by brief moments of a quiet twilight storm.");

        int i = 0;
        while (matcher.find())i++;
        System.out.println(i);
    }
}
