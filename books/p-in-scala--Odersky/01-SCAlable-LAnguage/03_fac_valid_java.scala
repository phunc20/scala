import java.math.BigInteger

def factorial(x: BigInteger): BigInteger = 
  if (x == 0)
    BigInteger.ONE
  else
    x.multiply(factorial(x.subtract(BigInteger.ONE)))

//val ans = factorial(BigInteger 30)
//val ans = factorial(BigInteger(30))
//val ans = factorial(BigInteger.ONE)

val byteValue: Byte = 30
val bigIntegerFromByte: BigInteger = BigInteger.valueOf(byteValue)
val ans = factorial(bigIntegerFromByte)

println("ans = " + ans)




