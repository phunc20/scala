### `val` and `var`
```scala
scala> val i = 1
val i: Int = 1

scala> i = "hey"
         ^
       error: reassignment to val

scala> var s = "Happy"
var s: String = Happy

scala> s = 3.14
           ^
       error: type mismatch;
        found   : Double(3.14)
        required: String

scala> var s = "programming"
var s: String = programming

scala>
```

### Methods
```scala
scala> var s = "programming"
var s: String = programming

scala> s.length
val res3: Int = 11

scala> "programming".length
val res4: Int = 11
```

### Reference
```scala
scala> var tomato = 7
var tomato: Int = 7

scala> var tomato_var = tomato
var tomato_var: Int = 7

scala> val tomato_val = tomato
val tomato_val: Int = 7

scala> tomato_val = 11
                  ^
       error: reassignment to val

scala> tomato_var = 11
// mutated tomato_var

scala> tomato_var
val res7: Int = 11

scala> tomato
val res8: Int = 7

scala> tomato_val
val res9: Int = 7

scala>
```

