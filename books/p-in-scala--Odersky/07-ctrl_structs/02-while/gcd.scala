def gcdLoop(x: Long, y: Long): Long = {
  /* Note that this code, in order for easier reading, can be thought of
   * as, "we assume a <= b"; however, even when a >= b, the first time the
   * while loop was gone thru, a and b will get swapped and we are back w/ a <= b.
   */
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

/* The next function is commented out because
 * it is grammatically wrong in that
 * x, y are assumed to be val, i.e. immutable.
 */
//def gcdLoopXY(x: Long, y: Long): Long = {
//  // Same as gcdLoop, just w/o a and b.
//  while (x != 0) {
//    val temp = x
//    x = y % x
//    y = temp
//  }
//  y
//}


def gcdUnstop(x: Long, y: Long): Long = 
  // This function is to education purpose -- It is a wrong implementation for gcd
  if (x == 0) y else gcdUnstop(x, y % x)


def gcd(x: Long, y: Long): Long = 
  if (x == 0) y else gcd(y % x, x) // Note just how the recursive function's 1st arg decreases strictly




