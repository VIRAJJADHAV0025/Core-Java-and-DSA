public class ExampleCasting {
    public static void main(String[] args) {
        long l = 12373475415L;
        int x = (int) l;
        System.out.println(x);

        double d = 3.244544791567459; // double store upto 15 decimal
        float f = (float) d; // float store till 7
        System.out.println(f);

        // this will be a problem
        byte b = -23;
        char c = (char) b;
        System.out.println(c);
        int i = c;
        System.out.println(i);

        char maxChar = 65535;
        char newChar = (char) (maxChar + 1);
        System.out.println((int)newChar);

    }
}
