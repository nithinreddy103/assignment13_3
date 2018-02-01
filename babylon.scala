import scala.collection.mutable.ListBuffer

object babylon {

  def squareroot(n:Float):Float= {
    var x = n
    var y = 1.0f
    val e = 0.000001
    while ((x - y) > e) {
      x = (x + y) / 2
      y = n / x
    }
    x
  }
  def main(args:Array[String]): Unit={
    print("Squareroot of 92 in Babylon method:"
    +squareroot(92))
  }
}
