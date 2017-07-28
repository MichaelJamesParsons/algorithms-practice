package IntegerToEnglishWords;

import java.util.HashMap;

class IntegerToEnglishWords {
    String numberToWords(int num) {
        StringBuilder result = new StringBuilder();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Thousand");
        map.put(6, "Million");
        map.put(9, "Billion");

        // Zero special case
        if (num == 0) {
            return "Zero";
        }

        while(num > 0) {
            // Integers < 1000 can be calculated with the base algorithm
            if (num <= 999) {
                result.append(this.convertNumberUnderOneThousand(num));
                break;
            }

            int numPlaces = (int) Math.log10(num);
            int offset = (int) Math.pow(10, numPlaces - (numPlaces % 3));
            result.append(this.convertNumberUnderOneThousand(num / offset));

            if (numPlaces >= 2) {
                result.append(" ").append(map.get(numPlaces - (numPlaces % 3)));
            }

            num %= offset;

            if (num > 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    String convertNumberUnderOneThousand(int num) {
        String[] ones = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String [] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        StringBuilder result = new StringBuilder();

        // Hundreds
        if (num >= 100) {
            result.append(ones[num/100]).append(" Hundred");
            num %= 100;

            if (num > 0) {
                result.append(" ");
            }
        }

        // Tens
        if (num >= 20) {
            result.append(tens[num/10]).append("");
            num %= 10;

            if (num > 0) {
                result.append(" ");
            }
        } else if (num >= 10) {
            result.append(teens[num % 10]);
            return result.toString();
        }

        // Ones
        if (num > 0) {
            result.append(ones[num]);
        }

        return result.toString();
    }
}