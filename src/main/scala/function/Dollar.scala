package function

case class Dollar(n: Double)

case class DollarSuffix(n: Double) {
  def $: Dollar = Dollar(n)
}

object DollarSuffix {
  implicit def d2Dollar(n: Double): DollarSuffix = DollarSuffix(n)
  implicit def Int2Dollar(n: Int): DollarSuffix = d2Dollar(n)
}
