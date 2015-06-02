/**
 * Created by chanduk on 02/06/15.
 */
object Fibonacci {
   def main (args: Array[String]) {
    fibonacci(4000000)
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
}
