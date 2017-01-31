import java.util.Random
import scala.collection.mutable.ListBuffer

/**
  * Created by george on 6/8/16.
  */

object test100 {

  def main(args: Array[String]) {
    val testList: List[Int] = List(1, 2, 3, 2, 1)
    // val listToFlatt: List[List(1, 1), List(3, List(5, 8))]

    println
    print(" The first test : find the last element of the List")
    println(" -  " + theLast(testList))

    println()
    print(" The second test : find the last but one element of the List")
    println(" -  " + theLastButOne(testList))

    println()
    print(" The 3rd test : find the Kth element of the List")
    println(" -  " + theKthOne(3, testList))

    println()
    print(" The 4th test : find the number of elements of a list.")
    println(" -  " + theNumber(testList))

    println()
    print(" The 5th test : reverse list.")
    println(" -  " + reverseList(testList))

    println()
    print(" The 6th test : is a palindrome.")
    println(" -  " + isPalindrome(testList))

    println()
    print(" The 7th test : flattering.")
    println(" -  " + "   NOT  OVERCOMED")

  println()
    print(" The 8th test : Eliminate consecutive duplicates of list elements..")
    println(" -  " + compesss(List('a, 'a, 'a, 'a, 'b
                  , 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
    println()
    print(" The 9th test : Eliminate consecutive duplicates of list elements..")
    println(" -  " + pack(List('a, 'a, 'a, 'a, 'b
                  , 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  println()
    print(" The 10th test :   List  => tuples (N, E)")
    println(" -  " + encode(List('a, 'a, 'a, 'a, 'b
                  , 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
   println()
    print(" The 11th test :   List  => tuples (N, E) and singles E")
    println(" -  " + encode2(List('a, 'a, 'a, 'a, 'b
                  , 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

  println()
    print(" The 12th test : Decode a run-length encoded lis")
    println(" -  " + decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))

  println()
    print(" The 14th test :Duplicate")
    println(" -  " +      duplicate(List('a, 'b, 'c, 'c, 'd)))

 println()
    print(" The 15th test : Replicate  a given number of times")
    println(" -  " +      replicate(3,List('a, 'b, 'c, 'c, 'd)))

 println()
    print(" The 16th test : Drop every Nth element")
    println(" -  " +      droping(3,List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j )))

 println()
    print(" The 17th test : Split a list => two lists")
    println(" -  " +      spliting(3,List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j )))

 println()
    print(" The 18th test : slice from n to m")
    println(" -  " +      slicing(3,7,List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j )))

 println()
    print(" The 19th test :  shifting   ")
    println(" -  " +      shifting(-1 ,List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j )))

 println()
    print(" The 20th test :  removing from   ")
    println(" -  " +      removing(2 ,List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j )))

 println()
    print(" The 21th test :  inserting  ")
    println(" -  " +      inserting('y,2 ,List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j )))


 println()
    print(" The 22th test :  int from interval  ")
    println(" -  " + interval(5,9))

 println()
    print(" The 23th test :  pick up n random symbols  ")
    println(" -  " + pickUp(7,List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j )))

 println()
    print(" The 24th test :  analogous  ")


 println()
    print(" The 25th test :  shufling  ")
    println(" -  " + shuf(List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j )))

    println()
    print(" The 26th test :  I don't know  ")


 println()
    print(" The 27th test :  I don't know  ")


println()
    print(" The 28th test : sorting  ")
    println(" -  " + sortByLength(List(List('a, 'b, 'c), List('d, 'e)
      , List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l)
      , List('m, 'n), List('o))))

println()
    print(" The 28th test : sorting  ")
    println(" -  " + sortByFreq(List(List('a, 'b, 'c), List('d, 'e)
      , List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l)
      , List('m, 'n), List('o))))

  }

  // 1st
  def theLast(list: List[Int]): Int = {
    list.last
  }

  // 2nd
  def theLastButOne(list: List[Int]): Int = {
    list(list.length - 1)
  }

  // 3rd
  def theKthOne(num: Int, list: List[Int]): Int = {
    list(num)
  }

  // 4th
  def theNumber(list: List[Int]): Int = {
    list.length
  }


  // 5th
  def reverseList(list: List[Int]): List[Int] = {
    list.reverse
  }

  // 6th
  def isPalindrome(list: List[Int]): Boolean = {
   // var s = " errtt"
   // s.toList.reverse
    list == list.reverse
  }

  def isWord(testString: String): Boolean = {
    testString.toList.forall(_.isLetter)
  }

  // 7th
  // ---------------  failed --------------------


  // 8th
  def compesss(list: List[Symbol]): List[Symbol] = {
    list.foldRight(List[Symbol]()) { (curr, res) =>
    {
      if (res.isEmpty || res.head != curr) res.::(curr)
      else res
    }
    }
  } // of compress

  // 9th combine consecutive duplicates
  def pack(list: List[Symbol]): List[List[Symbol]] = {
    if (list.isEmpty) List(List())
    else {
      val (packed, next) = list.span { _ == list.head }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }

  } //

  // 10th -  encoding
  def encode(list: List[Symbol]): List[(Int,Symbol)] ={
      pack(list).map(el =>(el.length,el.head))
  }

  // 11th -  encoding
  def encode2(list: List[Symbol]): List[Any] ={
      encode(list).map(el =>{ if (el._1 == 1) el._2 else el})
  }

  // 12th -decoding
  def decode(list:List[(Int,Symbol)]): List[Symbol] ={
     list.map(el => List.fill(el._1)(el._2)).toList.flatten
  }

   //14th doubling
  def duplicate(list: List[Symbol]):List[Symbol]={
     list.map(el => List.fill(2)(el)).toList.flatten
   }

   //15th replicating
  def replicate(n:Int, list: List[Symbol]):List[Symbol]={
     list.map(el => List.fill(n)(el)).toList.flatten
   }

 //16th drop Nth
  def droping(n:Int, list: List[Symbol]):List[Symbol]={
     list.zipWithIndex.filter( el => (el._2 +1) % n != 0).map(_._1)
      }

  //   17th   spliting
  def spliting(n:Int, list: List[Symbol]): (List[Symbol],List[Symbol]) ={
    (list.take(n), list.drop(n))
     }

 //   18th   slicing
  def slicing(n:Int, m:Int,list: List[Symbol]): List[Symbol] ={
     list.drop(n-1).take(m - n +1)
        }

 //   19th   shifting
  def shifting(n:Int, list: List[Symbol]): List[Symbol] ={
     val shft = if (list.isEmpty) 0 else n % list.length
     var l : List[Symbol]  = List.empty
   if (shft >0) { list.drop(shft) ::: list.take(shft)}
    else {shifting(n + list.length, list)}
  }

 //   20th   removing
  def removing(n:Int, list: List[Symbol]): (List[Symbol], Symbol) ={

   (list.take(n) ::: list.drop(n+1), list(n))
    }

//   21th   inserting inside
  def inserting(smb:Symbol, n:Int, list: List[Symbol]): List[Symbol] ={
    //list.splitAt(n) match {case (pre,post) => pre.::(smb) ::: post}
    list.take(n) ::: List(smb) ::: list.drop(n)
  }

//   22th   Create a list containing all integers within a given range
  def interval(m:Int, n:Int): List[Int] ={
   List.range(m,n+1)
  }

  //23th -  picking up

  def pickUp(n:Int, list: List[Symbol]): List[Symbol] = {
    val r = scala.util.Random
    var buf =Seq.fill(n)(r.nextInt(list.length)).distinct.toBuffer
     while ( buf.distinct.length < n){
          buf+=r.nextInt(list.length)
   }
    val numbers = buf.distinct.toList
    numbers.map(list(_))
  }


  //   25th   shufling
  def shuf(list:List[Symbol]): List[Symbol] ={
    val r = scala.util.Random
    r.shuffle(list)
  }

  // 28th  a
  def sortByLength(list:List[List[Symbol]]): List[List[Symbol]] ={
    list.sortBy(_.length)
     }
  // 28th b
  def sortByFreq(list:List[List[Symbol]]): List[List[Symbol]] ={
   list.map(lst => (lst,lst.length)).sortBy(_._2).map(_._1).reverse
  }

  //--------------------------





 } // of test100























