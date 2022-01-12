
public class occurences {

    public static int count(char[] chars, char ch) {
        return count(chars, ch, 0);
    }

    public static int count(char[] chars, char ch, int high) {
        int (high == chars.length)
        return 0;
        int num = 0;
        if (chars[high] == ch) num++;
        return num + count(chars, ch, high + 1);

    }

    public static void main(String [] args) {
        char[] test = {'a', 'b', 'c', 'a', 'd', 'a', 'f'};
        System.out.println(count(test, 'f'));
    }

}
