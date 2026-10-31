public class EquationReverser {

    public static String reverseEquation(String s) {
        TokenStack stack = new TokenStack();
        String numberBuffer = " ";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                numberBuffer += ch;
            } else {
                if (!numberBuffer.isEmpty()) {
                    stack.push(numberBuffer);
                    numberBuffer = "";
                }
                stack.push(String.valueOf(ch));
            }
        }

        if (!numberBuffer.isEmpty()) {
            stack.push(numberBuffer);
        }

        StringBuilder reversedEquation = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedEquation.append(stack.pop());
        }

        return reversedEquation.toString();
    }
}
