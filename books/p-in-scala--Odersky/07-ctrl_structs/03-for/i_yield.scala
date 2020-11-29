val filesHere = (new java.io.File(".")).listFiles

def scalaFiles = 
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    if file.isFile
  } yield file

// scalaFiles will be an Array (because filesHere is an Array)
//println(scalaFiles)
println(scalaFiles.mkString)
