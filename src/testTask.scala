/**
  * Created by george on 12/13/16.
  */

object testTask {

  def main(args: Array[String]): Unit = {

    val lst: List[Int] = List(1, 2, 3, 2, 1)
    // val listToFlatt: List[List(1, 1), List(3, List(5, 8))]

    val testList = List(List("a","b","c"),List("1","2"))


    println
    print(" The first test : find the last element of the List")
    println(" -  " + theLast(lst))

    println
    print(" The second test : ")
    println(" -  " + combinationList(testList))
    println(" ---------------------------  " )

    val hd=testList.head
    println(testList.tail.flatten.map(te=> hd.map(hel=>(hel,te)))
           .flatten.map(el=>List(el._1,el._2)))


  }
  // 1st
  def theLast(list: List[Int]): Int = {
    list.last
  }

  def combinationList[T](ls:List[List[T]]): List[List[T]] =

    ls match {
    case Nil => List(List.empty) //we need list of empty lists here
    // for flatMap to attach to head
    case head :: tail => {
      combinationList[T](tail).flatMap(r => head.map(t => t :: r))
    }
  }
//
//  def combo2[T](ls:List[List[T]]): List[List[T]] ={
//    ls.tail.flatten.map(tel => ls.head.map(hel => tel::hel)
//  }
}
