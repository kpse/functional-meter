package function

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import function.DollarSuffix._
import function.LengthSuffix._

@RunWith(classOf[JUnitRunner])
class MeterTest extends FunSuite {

  test("1m == 1m") {
    assert(1.m == 1.m)
  }

  test("1m == 100cm") {
    assert(1.m == 100.cm)
  }

  test("1m == 1000mm") {
    assert(1.m == 1000.mm)
  }

  test("1m + 1m = 2m") {
    assert(2.m == 1.m + 1.m)
  }

  test("1m + 1cm = 1.01m") {
    assert(1.01.m == 1.m + 1.cm)
  }

  test("1m - 1cm = 0.99m") {
    assert(0.99.m == 1.m - 1.cm)
  }

  test("1m * 2 = 2m") {
    assert(2.m == 1.m * 2)
  }

  test("1m / 5 = 25cm") {
    assert(1.m / 4 == 25.cm)
  }

  test("1m price 5$") {
    assert(1.m.price == 5.$)
  }

  test("1cm price 0.05$") {
    assert(1.cm.price == 0.05.$)
  }

}
