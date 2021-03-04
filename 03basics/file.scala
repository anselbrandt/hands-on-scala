import java.io.{BufferedWriter, BufferedReader}
import java.nio.file.{Files, Paths}

object file extends App {

  def withFileWriter[T](
      fileName: String
  )(handler: BufferedWriter => T) = {
    val output =
      Files.newBufferedWriter(Paths.get(fileName))
    try handler(output)
    finally output.close()
  }

  def withFileReader[T](
      fileName: String
  )(handler: BufferedReader => T) = {
    val input =
      Files.newBufferedReader(Paths.get(fileName))
    try handler(input)
    finally input.close()
  }

  withFileWriter("File.txt") { writer =>
    writer.write("Hello World!\n")
    writer.write("From Scala!")
  }

  val result = withFileReader("File.txt") { reader =>
    reader.readLine() + "\n" + reader.readLine()
  }

  println(result)
}
