## for expression, not for loop



```bash
[phunc20@homography-x220t 03-for]$ scala listfiles.scala
./README.md
./listfiles.scala
[phunc20@homography-x220t 03-for]$
```

## Filtering

```bash
[phunc20@homography-x220t 03-for]$ ls
a_listfiles.scala  b_range.scala  c_filtering1.scala  README.md
[phunc20@homography-x220t 03-for]$ scala c_filtering1.scala
./c_filtering1.scala
./a_listfiles.scala
./b_range.scala
[phunc20@homography-x220t 03-for]$
```


## `mkString`
Let's see some examples
```scala
scala> Array("25", "24", "...", "2", "1")
val res11: Array[String] = Array(25, 24, ..., 2, 1)

scala> Array("25", "24", "...", "2", "1").length
val res13: Int = 5

scala> Array("25", "24", "...", "2", "1").mkString
val res12: String = 2524...21
```
