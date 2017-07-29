package RomanToInteger;

import java.util.HashMap;

class RomanToInteger {
    int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1 && map.containsKey(s.substring(i, i+2))) {
                result += map.get(s.substring(i, i+2));
                i++;
            } else {
                result += map.get(Character.toString(s.charAt(i)));
            }
        }

        return result;
    }
}