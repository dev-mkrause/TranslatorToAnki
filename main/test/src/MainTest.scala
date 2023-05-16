import munit.FunSuite
import org.mkrause.TranslatorToAnki._

class MainTests extends FunSuite {
  test("Remove punctuation and numbers") {
    assertEquals(removePunctuation("Do I love petting 12 chickens a day? Yes I do! What about you..."), "Do I love petting chickens a day Yes I do What about you")
  }

  test("Take user input and turn it into a lower case list") {
    assertEquals(splitLowerCase("coOkinG")(0), "cooking", "Input not list of single lower case word")
  }

  test("Take multiple words as input and return them as a lower case List") {
    assertEquals(splitLowerCase("I lOvE PeTtInG cHicKeNs"), List("i", "love", "petting", "chickens"), "Input not list of lower case words")
  }
}
