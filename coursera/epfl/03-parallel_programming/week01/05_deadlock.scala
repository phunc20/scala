class Account(private var amount: Int = 0) {
  def transfer(target: Account, n: Int) = 
    this.synchronized {
      target.synchronized {
        this.amount -= n
        target.amount += n
      }
  }
  def possession = this.amount
}

def startThread(a: Account, b: Account, n: Int) = {
  val t = new Thread {
    override def run(): Unit = {
      for (i <- 0 until n) {
        a.transfer(b, 1)
      }
    }
  }
  t.start()
  t
}

val a1 = new Account(500_000)
val a2 = new Account(700_000)
println(s"(Before) a1 = ${a1.possession}, a2 = ${a2.possession}")

val t = startThread(a1, a2, 150_000)
val s = startThread(a2, a1, 150_000)
t.join()
s.join()
