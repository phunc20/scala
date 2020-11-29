def fileLines(file: java.io.File) = 
  scala.io.Source.fromFile(file).getLines

val filesHere = (new java.io.File(".")).listFiles

def grep(pattern: String) = 
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    if file.isFile
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } println(file + ": " + trimmed)

grep(".*gcd.*")
