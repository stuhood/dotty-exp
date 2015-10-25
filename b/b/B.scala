package b

import a.A

object B {
  def main(args: Array[String]): Unit = {
    val cache = A.c

    cache.put(1, "1")

    println(cache.getIfPresent(1))
  }
}
