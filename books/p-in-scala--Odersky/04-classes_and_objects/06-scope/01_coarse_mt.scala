def printMultiTable(): Unit = {
  var i = 1
  // only i in scope here
  while (i <= 10) {
    var j = 1
    // both i and j are in scope here
    while (j <= 10) {
      var prod = (i*j).toString
      // i, j, and prod in scope here
      var k = prod.length
      while (k < 4) {
        print(" ")
        k += 1
      }
      print(prod)
      j += 1
    }
    // i and j still in scope; prod and k out of scope
    println()
    i += 1
  }
  // i still in scope; j, prod, and k out of scope
}

printMultiTable()
