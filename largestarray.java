
public class largestarray {

    static int Largest = Integer.MIN_VALUE;
    public static int findlargest(int[] list, int currentIndex) {
        if (currentIndex == list.length) {
            return Largest;
        }
        if (list[currentIndex] > Largest) {
            Largest = list[currentIndex];
        }
        return findlargest(list, currentIndex + 1);
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        System.out.println(findlargest(new int[] { 1, 2, 3, 8, 5, 3, 2, 4}, 0));
    }

}
