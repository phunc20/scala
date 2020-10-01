### To facilitate reading and writing large integers
we can use the following trick, which also works in Python.

```scala
scala> 10_000
val res10: Int = 10000

scala> 100_000_000
val res11: Int = 100000000

scala> 100_000_000_000
       ^
       error: integer number too large

scala> 100_000_000_000L
val res12: Long = 100000000000

```
