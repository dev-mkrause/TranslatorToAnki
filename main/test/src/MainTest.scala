import munit.FunSuite
import org.mkrause.TranslatorToAnki._

class InputTests extends FunSuite {

  test("Remove punctuation and numbers") {
    assertEquals(removePunctuation("Do I love petting 12 chickens a day? Yes I do! What about you..."), "Do I love petting chickens a day Yes I do What about you")
  }

  test("Take user input and turn it into a lower case list") {
    assertEquals(splitLowerCase("coOkinG")(0), "cooking", "Input not list of single lower case word")
  }

  test("Take multiple words as input and return them as a lower case List") {
    assertEquals(splitLowerCase("I lOvE PeTtInG cHicKeNs"), List("i", "love", "petting", "chickens"), "Input not list of lower case words")
  }

  test("format input for processing") {
    val input = "Do I love petting 12 chickens a day? Yes I do! What about you..."
    assertEquals(processInput(input), List("do", "i", "love", "petting", "chickens", "a", "day", "yes", "i", "do", "what", "about", "you"))
  }

  test("Keep Special characters, accents and diacritical marks in input") {
    val input = "Hállö, wørld! Café ànd pâté."
    assertEquals(processInput(input), List("hállö", "wørld", "café", "ànd", "pâté"))
  }
}


class TranslationTests extends FunSuite {
   test("Translate a single word input") {
     assertEquals(translate("dog", "Englisch", "Deutsch"), "Hund")
   }
}
