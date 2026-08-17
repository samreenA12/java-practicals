class TypeCasting {
    public static void main(String[] args) {
        byte b = 100;
        int i = b;       // byte → int
        long l = i;      // int → long
        float f = l;     // long → float
        double d = f;    // float → double

        System.out.println("byte value = " + b);
        System.out.println("int value = " + i);
        System.out.println("long value = " + l);
        System.out.println("float value = " + f);
        System.out.println("double value = " + d);
    }
}
