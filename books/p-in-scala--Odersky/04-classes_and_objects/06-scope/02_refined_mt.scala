def printMultiTable(): Unit = {
  for (i <- 1 to 10) {
    for (j <- 1 to 10) {
      val prod = (i*j).toString
      //print(String.format("%4s", Array(prod)))
      // Can't we just use `prod` above?
      print(String.format("%4s", prod))
    }
    println()
  }
}

printMultiTable()
/* It seems that the book was so old that
 * the line with the usage of `Array(prod)` actually becomes wrong
 * and the simpler line of using `prod` actually works.
 * At least this is true as of scala version 2.13.3
 */
