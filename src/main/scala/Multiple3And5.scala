/**
 * Created by chanduk on 01/06/15.
 */
object Multiple3And5{

  def main (args: Array[String]) {
    //multiplication35(1000)
    print(multi35(1000))
  }
  def multiplication35(num: Int)={
    var sum =0
    for(a <- 1 to num-1)
    if(moduloBy3Or5(a)) sum = sum + a
    print(sum)
  }
  def moduloBy3Or5(x: Int):Boolean={
    if(x%3==0 || x%5==0) true
    else false
  }
//withoud mutating the variable
  def multi35(num: Int)={
    def multi(acc: Int, out: Int):Int=
      if(acc>=num) out
      else if(moduloBy3Or5(acc)) multi(acc+1,acc+out)
      else multi(acc+1,out)
    multi(1,0)
  }
}

