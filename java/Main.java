import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int ScannerAINT = 0;
        //Num 1
        System.out.println("Pick a number");
	    Scanner scannerA = new Scanner(System.in);
        String scannerASTRING = scannerA.nextLine();
        int scannerAINT = Integer.parseInt(scannerASTRING);
        //Operator
        System.out.println("Pick a operator (+, -, *, /, sqrt, ^)");
        Scanner operator = new Scanner(System.in);
        String operatorSTRING = operator.nextLine();
        //Num 2
        int scannerBINT = 0;

        if (operatorSTRING.equals("sqrt") == false) {
            System.out.println("Pick a number");
	        Scanner scannerB = new Scanner(System.in);
            String scannerBSTRING = scannerB.nextLine();
            scannerBINT = Integer.parseInt(scannerBSTRING);
        }
        //just adding a method
		Math1 math1 = new Math1();
        //The handling of operators and stuff
        if (operatorSTRING.equals("+")) {
            System.out.println(math1.add(scannerAINT, scannerBINT));
        }
        else if (operatorSTRING.equals("-")) {
            System.out.println(math1.subtract(scannerAINT, scannerBINT));
        }
        else if (operatorSTRING.equals("*")) {
            System.out.println(math1.multiply(scannerAINT, scannerBINT));
        }
        else if (operatorSTRING.equals("/")) {
            System.out.println(math1.divide(scannerAINT, scannerBINT));
        }
        else if (operatorSTRING.equals("sqrt")) {
            System.out.println(math1.sqrt(scannerAINT));
        }
        else if (operatorSTRING.equals("^")) {
            System.out.println(math1.exponent(scannerAINT, scannerBINT));
        }
        else {
            System.out.println("You picked a invalid operator, please rerun the program.");
        }
    }
}