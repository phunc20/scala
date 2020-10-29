## Define a class
A class can even contain **nothing inside** and **still** it **can be called**.

```scala
scala> class House {
     |   // not yet defined
     | }
class House

scala> new House
val res10: House = House@1d92d132

scala> new House
val res11: House = House@2c70da80

scala> val h1 = new House
val h1: House = House@59be715a

scala> res10
val res12: House = House@1d92d132

scala> res12
val res13: House = House@1d92d132
```

### Type
> _The type of a variable determines what kind of objects can be assigned to it_.

This may be important when later we learn about subclasses.

```scala
scala> type(h1)
           ^
       error: identifier expected but '(' found.

scala> typeof(h1)
       ^
       error: not found: value typeof

scala> h1.type
          ^
       error: identifier expected but 'type' found.

scala> Type(h1)
       ^
       error: not found: value Type

scala> h1.Type
          ^
       error: value Type is not a member of House

scala> val h4: House = new House
val h4: House = House@4db203fb

scala>
```
