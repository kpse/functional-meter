package recfun

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CountChangeSuite extends FunSuite {
  import Main.countChange
  test("example from instructions") {
    assert(countChange(4,List(1,2)) === 3)
  }

  test("sorted CHF") {
    assert(countChange(300,List(5,10,20,50,100,200,500)) === 1022)
  }

  test("no pennies") {
    assert(countChange(301,List(5,10,20,50,100,200,500)) === 0)
  }

  test("unsorted CHF") {
    assert(countChange(300,List(500,5,50,100,20,200,10)) === 1022)
  }

  test("1 for [1]") {
    assert(countChange(1,List(1)) === 1)
  }

  test("3 for [1, 2]") {
    assert(countChange(3,List(1, 2)) === 2)
  }

  test("3 for [5, 1]") {
    assert(countChange(3,List(5, 1)) === 1)
  }

  test("3 for [5, 2, 1]") {
    assert(countChange(3,List(5, 2, 1)) === 2)
  }

}
