
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


