package b

import a.A

object B {
  def main(args: Array[String]): Unit = {
    val cache = A.c

    println(A.x)

    cache.put(1, "1")

    println(A.x)
  }
}
