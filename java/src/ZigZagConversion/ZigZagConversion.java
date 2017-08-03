package ZigZagConversion;

/*
 * @todo - incomplete
 */
class ZigZagConversion {
    String convert(String s, int numRows) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <  2*numRows-2; j++) {
                System.out.print(s.charAt(j));
            }
        }

        return s;
    }
}
