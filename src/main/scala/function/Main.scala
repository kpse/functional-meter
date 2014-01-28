package function

import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (r == 0) 1
    else if (c == 0) 1
    else if (r == c) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balance_level(chars: List[Char], level: Int): Boolean = {
      if (chars.isEmpty) level == 0
      else if (chars.head == '(') balance_level(chars.tail, level + 1)
      else if (chars.head == ')' && level == 0) false
      else if (chars.head == ')' && level > 0) balance_level(chars.tail, level - 1)
      else balance_level(chars.tail, level)
    }

    balance_level(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    val sorted_coins = coins.sortWith(_ < _)
    if (coins.isEmpty) 0
    else if (money <= 0) 0
    else if (money == sorted_coins.head) 1
    else countChange(money, sorted_coins.tail) + countChange(money - sorted_coins.head, sorted_coins)
  }
}
