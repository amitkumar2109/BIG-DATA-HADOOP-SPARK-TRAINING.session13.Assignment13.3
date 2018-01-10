class Assignment_13_3 {

  def squareRoot (n: Float): Float ={

    var x :Float= n
    var y:Float  =1
    var e:Double =0.000001
    while(x - y > e)
    {
      x = (x + y)/2;
      y = n/x
    }
     return x
  }
}

object  TestAssignment_13_3 {
  def main(args: Array[String]): Unit = {

    var obj  = new Assignment_13_3
    var n = 50
    println("squareRoot of "+ n+" ==>"+ obj.squareRoot(n))

  }

}