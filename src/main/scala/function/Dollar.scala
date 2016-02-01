package function

case class Dollar(n: Double) {
  def $ = Dollar.to_$(n)
}

object Dollar {
  def meterPrice(length: Double) = length * 5
  def centimeterPrice(length: Double) = length * 2
  def millimeterPrice(length: Double) = length * 1

  def to_$(n: Double) = n

  implicit def d2Dollar(n: Double): Dollar = new Dollar(n)
}
