import java.math.BigInteger

def factorial(x: BigInteger): BigInteger = 
  if (x == 0)
    1
  else
    x * factorial(x-1)

val ans = factorial(30)
println("ans = " + ans)
//print(ans)




