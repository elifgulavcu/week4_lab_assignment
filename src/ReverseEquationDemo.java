public class ReverseEquationDemo {
    public static void main(String[] args) {

        String[] testInputs = {
                "20-3+5*2",
                "5+2*56-2/4"
        };

        
        for (String s : testInputs) {
            String result = EquationReverser.reverseEquation(s);
            System.out.println("Input:");
            System.out.println("S = \"" + s + "\"");
            System.out.println("Output: " + result);
            System.out.println("Explanation: The equation is reversed with numbers remaining the same.");
            System.out.println();
        }
    }
}