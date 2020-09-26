### Integer literals

```scala
Welcome to Scala 2.13.3 (OpenJDK 64-Bit Server VM, Java 14.0.1).
Type in expressions for evaluation. Or try :help.

scala> val hex = 0x5
val hex: Int = 5

scala> val hex2 = 0X000FF
val hex2: Int = 255

scala> val hex2 = 0X000000000000FF
val hex2: Int = 255

scala> val hex2 = 0XFF
val hex2: Int = 255

scala> val magic = 0xcafebabe
val magic: Int = -889275714

scala> #octal
       ^
       error: illegal start of definition

scala> //octal

scala> val oct = 035
val oct: Int = 35

scala> val nov = 0777
val nov: Int = 777

scala> val dec = 0321
val dec: Int = 321

```

**N.B.** It seems that since version <code><b>2.10</b></code>, the above-mentioned way to specify octals is <b>deprecated</b>. (cf. [https://stackoverflow.com/questions/16590236/scala-2-10-octal-escape-is-deprecated-how-to-do-octal-idiomatically-now](https://stackoverflow.com/questions/16590236/scala-2-10-octal-escape-is-deprecated-how-to-do-octal-idiomatically-now))


```scala
scala> 0o35
       ^
       error: invalid literal number

scala> val prog = 0XCAFEBABEL
val prog: Long = 3405691582

scala> val tower = 35L
val tower: Long = 35

scala> val of = 31l
                  ^
       warning: Lowercase el for long is not recommended because it is easy to confuse with numeral
1; use uppercase L instead
val of: Long = 31

scala> val little: Short = 367
val little: Short = 367

scala> val little: Short2 = 0xFFF
                   ^
       error: not found: type Short2

scala> val little2: Short = 0xFFF
val little2: Short = 4095

scala> val tiny: Byte = 0x1f
val tiny: Byte = 31

scala> val tiny2: Byte = 38
val tiny2: Byte = 38


```

### Floating point literals
```scala
scala> val big = 1.2345
val big: Double = 1.2345

scala> val bigger = 1.2345e1
val bigger: Double = 12.345

scala> val biggerStill = 123E45
val biggerStill: Double = 1.23E47

scala> val little = -1.2345F
val little: Float = -1.2345

scala> val littler = -1.2345e-5f
val littler Float = -1.2345E-5

scall> val littlerDouble = -1.2345e-5
val littlerDouble: Double = -1.2345E-5

scall> val littlerDouble2 = -1.2345e-5D
val littlerDouble2: Double = -1.2345E-5

scall> val littlerDouble2 = -1.2345e-5d
val littlerDouble2: Double = -1.2345E-5

scall> val littlerDouble3 = -1.2345e-5d
val littlerDouble3: Double = -1.2345E-5

```

### Character literals
```scala
scala> val A = 'A'
val A: Char = A

scala> val c = '\101'
                ^
       error: octal escape literals are unsupported: use \u0041 instead

scala> val c = '\377'
                ^
       error: octal escape literals are unsupported: use \u00ff instead

scala> val d = '\u0041'
val d: Char = A

scala> val d = '\u41'
                  ^
       error: invalid unicode escape

scala> val d = '\u041'
                  ^
       error: invalid unicode escape

scala> val d = '\u4100'
val d: Char = ?

scala> val d = '\u9999'
val d: Char = ?

scala> val d = '\uFFFF'
val d: Char = ?

scala> val d = '\uffff'
val d: Char = ?

scala> val d = '\u005a'
val d: Char = Z

scala> val d = '\u005A'
val d: Char = Z

scala> val backslash = '\\'
val backslash: Char = \

scala> val escaped = '\u005c'
val escaped: Char = \

scala> val escaped = '\n'
val escaped: Char =


scala> val escaped = '\u000a'
val escaped: Char =


scala> val escaped = '\b'
val escaped: Char = ?

scala> val escaped = '\u0008'
val escaped: Char = ?

scala> val escaped = 't'
val escaped: Char = t

scala> val escaped = '\t'
val escaped: Char =

scala> val escaped = '\u0009'
val escaped: Char =

scala> val escaped = '\f'
val escaped: Char =

scala> val escaped = '\r'
val escaped: Char =

scala> val escaped = '\"'
val escaped: Char = "

scala> val escaped = '\''
val escaped: Char = '

scala> val escaped = '\u0027'
val escaped: Char = '
```

