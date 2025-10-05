package Introduction;

public class Casting {
    public static void main(String[] args) {
//        Casting in Java
        byte minByteValue = Byte.MIN_VALUE;
//        byte divByteValue =  (minByteValue/2);
//        java: incompatible types: possible lossy conversion from int to byte
        byte divByteValue = (byte) (minByteValue/2);
        System.out.println(divByteValue);

    }


}
