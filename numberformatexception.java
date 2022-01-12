
public class numberformatexception {
    public static void main(String[] args) throws NumberFormatException {
        Integer value1 = Integer.parseInt(args[0]);

        String oper = args[1];

        Integer value2 = Integer.parseInt(args[2]);

        if (oper.equals("+")) {
            System.out.println(value1 + value2);
        }else if (oper.equals("-")) {
            System.out.println(value1 - value2);
        }else if (oper.equals("*")) {
            System.out.println(value1 * value2);
        }else if (oper.equals("/")) {
            if (value2 ==0) throw new NumberFormatException("Cannot be divided by zero");
            else System.out.println(value1 / value2);

        }
    }

}

class NumberFormatException extends Throwable {
    String s;

    public NumberFormatException(String s) {
        this.s = s;
    }
}
