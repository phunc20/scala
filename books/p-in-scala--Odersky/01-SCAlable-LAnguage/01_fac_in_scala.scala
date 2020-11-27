def factorial(x: BigInt): BigInt = 
  if (x == 0) 1 else x * factorial(x-1)

val ans = factorial(30)
println("ans = " + ans)
//print(ans)




