package Arrays;

public class EnchacedForLoop {
    public static void main(String[] args) {
        int total = 0;
        int[ ] arr = {2,3,5,7};
        for ( int x: arr ) {
            total += x;
        }
    }
}
