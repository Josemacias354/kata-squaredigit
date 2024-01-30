public class SquareDigit {
    public static void main(String[] args) {
        System.out.println(SquareDigit.squareDigits(9119));
    }

    public static int squareDigits(int n) {
        String result = "";
        String str = Integer.toString(n);
        for (char c : str.toCharArray()) {
            int digit = Character.getNumericValue(c);
            result += Integer.toString(digit * digit);
        }
        int finalResult = Integer.parseInt(result);
        System.out.println(finalResult);
        return finalResult;
    }
}
