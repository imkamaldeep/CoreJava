package stringPuzzels;

import java.util.HashMap;
import java.util.Map;

public class HigheshFrequencyChar {

    public static void main(String[] args){

        String highOccurChar = "ABCDAAKAMLDEEEIGHDASBDDRRFJJKDNTPMSETTLDNTESJETYYQDZS";

        Map<Character,Integer> frequency = new HashMap<>();

        for(Character c : highOccurChar.toCharArray()){
            frequency.put(c, frequency.getOrDefault(c,0)+1);
        }

        System.out.println(frequency);


    char maxChar = ' ';
    int maxFrequecy = 0;

    for(Map.Entry<Character,Integer> entry : frequency.entrySet()){
        if(entry.getValue()>maxFrequecy){
            maxChar = entry.getKey();
            maxFrequecy = entry.getValue();
        }
    }
        System.out.println(maxChar+" : "+maxFrequecy);
    }
}
