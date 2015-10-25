package a

import com.google.common.cache.{CacheBuilder, Cache}

object A {
  val c: Cache[java.lang.Integer, String] =
    CacheBuilder.newBuilder()
      .maximumSize(16)
      .build()

  def x: (Float | Long) = if (c.getIfPresent(1) ne null) 1.01f else 2L
}
