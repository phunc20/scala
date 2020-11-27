## How to import a scala code into REPL?
01. Start the REPL with, say with the code inside `gcd.scala`, the `-i` option
  ```bash
  [phunc20@homography-x220t 02-while]$ scala -i gcd.scala
  Welcome to Scala 2.13.4 (OpenJDK 64-Bit Server VM, Java 15.0.1).
  Type in expressions for evaluation. Or try :help.
  
  scala> gcdLoop(169, 65)
  val res0: Long = 13
  
  scala> gcd(169, 65)
  val res1: Long = 13
  
  scala> gcd(13*17*23*2*3*5*7, 23*111*10)
  val res2: Long = 690
  
  scala> gcdUnstop(2, 10)
  ^C[phunc20@homography-x220t 02-while]$
  ```


## `readLine()`
This function is in `scala.io.StdIn`. Here is an example of running the `readLine.scala`:
```bash
[phunc20@homography-x220t 02-while]$ scala readLine.scala 
asdf
Read: asdf
1234
Read: 1234
12345678
Read: 12345678
qwerty
Read: qwerty
^C[phunc20@homography-x220t 02-while]$
```
