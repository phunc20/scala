def fileLines(file: java.io.File) = 
  scala.io.Source.fromFile(file).getLines

val filesHere = (new java.io.File(".")).listFiles

def grep(pattern: String) = 
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    if file.isFile
    line <- fileLines(file)
    if line.trim.matches(pattern)
  } println(file + ": " + line.trim)

grep(".*gcd.*")
