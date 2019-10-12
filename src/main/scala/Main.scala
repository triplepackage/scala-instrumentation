package com.hi.world.bye.world
import kamon.Kamon

object Main extends App{
  Kamon.init()

  val url = "http://ec2-34-204-247-182.compute-1.amazonaws.com:8080/api/rental/40"
  val result = scala.io.Source.fromURL(url).mkString
  println(result)
}
