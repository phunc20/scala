# What is `~(sum & 0xFF) + 1`? And what is it for?
- [https://wiki.python.org/moin/BitwiseOperators](https://wiki.python.org/moin/BitwiseOperators)

## What is this `& 0xFF` thing?
To explain this, it's more easy to do thru a REPL example:
```scala
scala> 0x55
val res0: Int = 85

scala> 0x5544
val res1: Int = 21828

scala> 0x5544 & 0xff
val res2: Int = 68

scala> 0x44 & 0xff
val res3: Int = 68

scala> 0x44
val res4: Int = 68

scala> 0x5544 & 0xffff
val res5: Int = 21828

scala> 0x00ff == 0xff
val res6: Boolean = true

scala> 0x00ff === 0xff
              ^
       error: value === is not a member of Int

scala> 0x00ff === 0x0ff
              ^
       error: value === is not a member of Int

scala> 0x00ff == 0x0ff
val res9: Boolean = true

scala>
```


## What is `~`?
> `~x`
Returns the complement of `x` - the number you get by switching each `1` for a `0` and each `0` for a `1`. This is the same as `-x - 1`.

```scala
scala> ~(-1)
val res21: Int = 0

scala> ~(-2)
val res22: Int = 1

scala> ~(-3)
val res23: Int = 2

scala> ~(4)
val res24: Int = -5

scala> ~(256)
val res25: Int = -257

scala> ~(259)
val res26: Int = -260

scala> ~(3000)
val res27: Int = -3001

```




## `toByte`
```scala
scala> 'a'.toByte
val res10: Byte = 97

scala> 'Z'.toByte
val res11: Byte = 90

scala> 'Z'.toByte & 0xFF
val res12: Int = 90

scala> 'A'
val res16: Char = A

scala> 'A'.toByte
val res17: Byte = 65
```

