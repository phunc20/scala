class HelloThread extends Thread {
  //override def run(): Unit = {
  override def run() {
    println("Hello world (non-main thread)")
  }
}

val t = new HelloThread

t.start()
println("Hello world (main thread)")
t.join()





