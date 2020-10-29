```scala
class ChecksumCalculator {
  private var sum = 0
}

scala> class ChecksumCalculator {
     |   private var sum = 0
     | }
     |
class ChecksumCalculator

scala> val cc2 = new ChecksumCalculator
val cc2: ChecksumCalculator = ChecksumCalculator@609b041c

scala> cc2.sum = 3
           ^
       error: variable sum in class ChecksumCalculator cannot be accessed as a member of ChecksumCalculator from class

scala>

class ChecksumCalculator {
  private var sum = 0
  def add(b: Byte): Unit = {
    sum += b
  }
  def checksum: Int = {
    return ~(sum & 0xFF) + 1
  }
}

```







