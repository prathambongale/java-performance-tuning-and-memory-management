public class MemoryExampleOne {
    
    public static void main(String[] args) {
        int one = 1;
        Integer two = 2;
        test1(one);
        System.out.println("Print One : " + one);
        test2(two);
        System.out.println("Print Two : " + two);
    }

    private static void test1(int one) {
        one = one + 1;
    }

    private static void test2(Integer two) {
        two = two + 2;
    }
}
