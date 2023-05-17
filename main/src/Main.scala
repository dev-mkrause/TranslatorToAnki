package org.mkrause.TranslatorToAnki
import scala.io.StdIn.readLine

val splitLowerCase: String => List[String] = _.toLowerCase().split(" ").toList

val removePunctuation: String => String = _.trim
  .replaceAll("[^\\p{L}-\\s]", "")
  .replaceAll(" +", " ")

val processInput: String => List[String] = (input) => splitLowerCase(removePunctuation(input))

val translate: (String,String,String) => String = (word,sourceLang,targetLang) => "Not implemented"

@main def main(input: String): Unit = { ??? }
