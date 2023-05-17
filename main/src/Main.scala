package org.mkrause.TranslatorToAnki
import scala.io.StdIn.readLine

val splitLowerCase: String => List[String] = _.toLowerCase().split(" ").toList

val removePunctuation: String => String = _.trim
  .replaceAll("[^\\p{L}-\\s]", "")
  .replaceAll(" +", " ")

val processInput: String => List[String] = (input) => splitLowerCase(removePunctuation(input))
