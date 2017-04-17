/**
 * Created by manaure on 17/04/2017.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorter {

    static void wopsort(String[] args) throws Exception {
        if (args == null)
            throw new Exception("Input must not be null");

        if (args.length == 0) {
            System.out.println("");
            return;
        }

        List<String> onlyWords = new ArrayList<String>();
        List<Integer> onlyIntegers = new ArrayList<Integer>();

        for (int i = 0; i < args.length; i++) {
            if (isInteger(args[i], 999999)) {
                onlyIntegers.add(Integer.parseInt(args[i]));
            } else {
                onlyWords.add(args[i]);
            }
        }

        Collections.sort(onlyIntegers);

        String[] strarrayWords = onlyWords.toArray(new String[0]);
        Integer[] strarrayIntegers = onlyIntegers.toArray(new Integer[0]);

        Arrays.sort(strarrayWords);

        int wordsIndex = 0;
        int integerIndex = 0;

        for (int i = 0; i < args.length; i++) {
            String space;
            if (i == args.length - 1) {
                space = "";
            } else {
                space = " ";
            }
            if (isInteger(args[i], 999999)) {
                System.out.print(strarrayIntegers[integerIndex] + space);
                integerIndex++;
            } else {
                System.out.print(strarrayWords[wordsIndex] + space);
                wordsIndex++;
            }
        }
        System.out.println();
    }

    public static boolean isInteger(String s, int radix) {
        if (s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                if (s.length() == 1) return false;
                else continue;
            }
        }
        try {
            int asd = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            // System.out.println("Wrong number");
            return false;
        }

    }

}
