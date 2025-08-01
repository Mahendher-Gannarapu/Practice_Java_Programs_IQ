//input: String s = "I Love Dogs";
// output : [IL, Io, Iv, Ie, ID, Io, Ig, Is, Lo, Lv, Le, LD, Lo, Lg, Ls, ov, oe,
// oD, og, os, ve, vD, vo, vg, vs, eD, eo, eg, es, Do, Dg, Ds, og, os, gs]
// Note: Same pair should not be repeated like (oo).
package Coding_Preparation_.Practice_IQ_Programs;

import java.util.ArrayList;
import java.util.List;

public class P25_SamePair_Should_Not_Repeated {
    public static void main(String[] args) {
        String s = "I Love Dogs";

        // Remove spaces
        s = s.replace(" ", "");

        List<String> result = new ArrayList<>();

        // Nested loop to generate 2-letter combinations
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                char c1 = s.charAt(i);
                char c2 = s.charAt(j);

                if (c1 != c2) {
                    result.add("" + c1 + c2);
                }
            }
        }

        System.out.println(result);
    }
}
