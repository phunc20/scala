public static void main(String[] args) {
        byte byteValue = 22;
        short shortValue = 33;
        int intValue = 123456;
        long longValue = 123456789;

        BigInteger bigIntegerFromByte = BigInteger.valueOf(byteValue);
        BigInteger bigIntegerFromShort = BigInteger.valueOf(shortValue);
        BigInteger bigIntegerFromInt = BigInteger.valueOf(intValue);
        BigInteger bigIntegerFromLong = BigInteger.valueOf(longValue);
   
        System.out.println(bigIntegerFromByte);
        System.out.println(bigIntegerFromShort);
        System.out.println(bigIntegerFromInt);
        System.out.println(bigIntegerFromLong);
}
