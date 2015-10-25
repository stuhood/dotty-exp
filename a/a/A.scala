package a

import com.google.common.cache.{CacheBuilder, Cache}

object A {
  val c: Cache[java.lang.Integer, String] =
    CacheBuilder.newBuilder()
      .maximumSize(16)
      .build()
}
