package org.mkrause.TranslatorToAnki
import scala.io.StdIn.readLine

val splitLowerCase: String => List[String] = _.toLowerCase().split(" ").toList

val removePunctuation: String => String = _.trim
  .replaceAll("[^a-zA-Z\\s-]", "")
  .replaceAll(" +", " ")

@main def main(): Unit = { ??? }
