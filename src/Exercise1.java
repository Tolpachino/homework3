public class Exercise1 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0XC;
        byte b3 = 014;
        byte b4 = 0b1100;

        short s1 = 1300;
        short s2 = 0X514;
        short s3 = 02424;
        short s4 = 0b010100010100;

        int i1 = 0;
        int i2 = 0X0;
        int i3 = 00;
        int i4 = 0B0;

        long l1 = 123456789L;
        long l2 = 0X75BCD15L;
        long l3 = 0726746425L;
        long l4 = 0B0111_0101_1011_1100_1101_0001_0101L;

        float f1 = 1.123F;
        float f2 = 4.253F;

        boolean bool1 = true;
        boolean bool2 = false;

        double d1 = 12312.123213;
        double d2 = 6453.12334;

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(d1);
        System.out.println(d2);

        char c1 = '1';
        char c2 = 123;
        char c3 = '\u4123';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
