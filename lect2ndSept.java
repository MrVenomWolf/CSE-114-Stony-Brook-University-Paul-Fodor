public class lect2ndSept {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 5;
        //i = i++ + (++1);
        // 5(i=6) + (i=7)7 =12
        //i = ++i + ++i;
        // (i=6)6 + (i=7)7 = 13
        //i = i++ + i++;
        // 5(i=6) + 6(i=7) = 11
        //i +=        ++i   +  i++;
        // i = 5 + (i=6)6 + 6(i=7) = 5 + 6 +6 = 17
        i -= i++ + ++i;
        //
        //
        System.out.println(i);
    }

}