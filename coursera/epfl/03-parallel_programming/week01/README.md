### How to run <code>.scala</code> files?
> <code><b>$ scala example.scala</b></code>. That's it, cannot be simpler.


### <code>01_hello_world.scala</code>

```scala
[phunc20@denjiro-x220 03-parallel_programming]$ scala 01_hello_world.scala
warning: 1 deprecation (since 2.13.0); re-run with -deprecation for details
Hello world, from non-main thread!
Hello world, from main thread!
[phunc20@denjiro-x220 03-parallel_programming]$ scala -deprecation 01_hello_world.scala
01_hello_world.scala:2: warning: procedure syntax is deprecated: instead, add `: Unit =` to explicitly declare `run`'s return type
  override def run() {
                     ^
Hello world, from non-main thread!
Hello world, from main thread!
[phunc20@denjiro-x220 03-parallel_programming]$ scala 01_hello_world.scala
warning: 1 deprecation (since 2.13.0); re-run with -deprecation for details
Hello world, from non-main thread!
Hello world, from main thread!
[phunc20@denjiro-x220 03-parallel_programming]$ scala 01_hello_world.scala
warning: 1 deprecation (since 2.13.0); re-run with -deprecation for details
Hello world, from non-main thread!
Hello world, from main thread!
[phunc20@denjiro-x220 03-parallel_programming]$ scala 01_hello_world.scala
warning: 1 deprecation (since 2.13.0); re-run with -deprecation for details
Hello world, from non-main thread!
Hello world, from main thread!
```

Let's fix the <b>deprecated</b> issue:
```scala
[phunc20@denjiro-x220 week01]$ cat 01_hello_world.scala
class HelloThread extends Thread {
  override def run(): Unit = {
    println("Hello world, from non-main thread!")
  }
}

val t = new HelloThread

t.start()
println("Hello world, from main thread!")
t.join()

[phunc20@denjiro-x220 week01]$ scala -deprecation 01_hello_world.scala
Hello world (main thread)
Hello world (non-main thread)
[phunc20@denjiro-x220 week01]$ scala 01_hello_world.scala
Hello world (main thread)
Hello world (non-main thread)
[phunc20@denjiro-x220 week01]$ scala 01_hello_world.scala
Hello world (main thread)
Hello world (non-main thread)
```

## Atomicity
### <code>02_interleave.scala</code>
```scala
[phunc20@denjiro-x220 week01]$ scala -deprecation 02_interleave.scala
Hello
world!
Hello
world!
[phunc20@denjiro-x220 week01]$ scala -deprecation 02_interleave.scala
Hello
Hello
world!
world!
[phunc20@denjiro-x220 week01]$ scala -deprecation 02_interleave.scala
Hello
Hello
world!
world!
[phunc20@denjiro-x220 week01]$ scala -deprecation 02_interleave.scala
Hello
world!
Hello
world!
```
### <code>03_unique_id.scala</code>
In this part we also show how to <b>run</b> scala <b>scripts</b> from inside <code><b>scala REPL</b></code>.
```scala
[phunc20@denjiro-x220 week01]$ scala
Welcome to Scala 2.13.3 (OpenJDK 64-Bit Server VM, Java 15).
Type in expressions for evaluation. Or try :help.
scala> :paste 03_unique_id.scala
Pasting file 03_unique_id.scala...
def getUniqueId(): Long
def startThread(): Thread

scala> startThread(); startThread()
Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val res0: Thread = Thread[Thread-1,5,main]
Vector(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

scala> startThread(); startThread()
Vector(21, 22, 23, 24, 25, 26, 27, 28, 29, 30)
val res1: Thread = Thread[Thread-3,5,main]

scala> Vector(31, 32, 33, 34, 35, 36, 37, 38, 39, 40)
startThread(); startThread()
Vector(41, 42, 43, 44, 45, 46, 47, 48, 49, 50)
val res2: Thread = Thread[Thread-5,5,main]

scala> Vector(51, 52, 53, 54, 55, 56, 57, 58, 59, 60)
startThread(); startThread();
Vector(61, 62, 63, 64, 65, 66, 67, 68, 69, 70)
val res3: Thread = Thread[Thread-7,5,main]

scala> Vector(71, 72, 73, 74, 75, 76, 77, 78, 79, 80)
```
But, <b>why</b> the result is not the same as in the video?


### <code>04_atomicity_fix.scala</code>
```
scala> :paste 04_atomicity_fix.scala
Pasting file 04_atomicity_fix.scala...
def getUniqueId(): Long
def startThread(): Thread

scala> startThread();startThread()
Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val res6: Thread = Thread[Thread-9,5,main]

scala> Vector(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
startThread();startThread()
Vector(21, 22, 23, 24, 25, 26, 27, 28, 29, 30)
Vector(31, 32, 33, 34, 35, 36, 37, 38, 39, 40)
val res7: Thread = Thread[Thread-11,5,main]

scala> startThread();startThread()
Vector(41, 42, 43, 44, 45, 46, 47, 48, 49, 50)
val res8: Thread = Thread[Thread-13,5,main]

scala> Vector(51, 52, 53, 54, 55, 56, 57, 58, 59, 60)
startThread();startThread()
Vector(61, 62, 63, 64, 65, 66, 67, 68, 69, 70)
val res9: Thread = Thread[Thread-15,5,main]

scala> Vector(71, 72, 73, 74, 75, 76, 77, 78, 79, 80)
```


### <code>05_deadlock.scala</code>
This script will never finish when being executed.



