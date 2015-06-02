/**
 * Created by chanduk on 02/06/15.
 */
object Fibonacci {
   def main (args: Array[String]) {
     fibonacci(4000000)
     println()
     print(fibonacci2(4000000))
  }
  def fibonacci(limit: Int)={
    var value1=0
    var value2=1
    var result=1;
    var sum=0
    while(result<limit) {
      result = value1 + value2
      value1=value2
      value2=result
      if(isEven(result)) sum =sum + result
    }
    print(sum)
  }
  def isEven(num: Int):Boolean={
    if(num%2==0) true
    else false
  }

  //without mutating
  def fibonacci2(limit: Int)={
    def fibo(value1: Int, value2: Int, result: Int,out: Int):Int=
      if(result>=limit) out
      else if(isEven(result)) fibo(value2, result,  value2+result, out + result)
    else fibo(value2, result, value2+result, out)
    fibo(0,1,1,0)
  }
}

