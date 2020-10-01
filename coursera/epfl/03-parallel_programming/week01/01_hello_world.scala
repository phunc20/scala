class HelloThread extends Thread {
  override def run() {
    println("Hello world, from non-main thread!")
  }
}

val t = new HelloThread

t.start()
t.join()
println("Hello world, from main thread!")





