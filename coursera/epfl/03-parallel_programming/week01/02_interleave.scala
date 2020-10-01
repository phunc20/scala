class HelloThread extends Thread {
  override def run(): Unit = {
    println("Hello")
    println("world!")
  }
}


def main(): Unit = {
  val t = new HelloThread
  val s = new HelloThread
  
  t.start()
  s.start()
  t.join()
  s.join()
}


main()

