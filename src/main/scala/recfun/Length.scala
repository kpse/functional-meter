package recfun


object extendBuiltins extends App {
  def to_m(meter: Double) = 1000 * meter

  def to_cm(centi: Double) = 10 * centi

  def to_mm(milli: Double) = milli

  def meter_price(length: Double) = length * 5
  def centimeter_price(length: Double) = length * 2
  def millimeter_price(length: Double) = length * 1

  class Length(n: Double) {
    def m = to_m(n)

    def cm = to_cm(n)

    def mm = to_mm(n)

  }

  def to_$(n: Double) = n

  class Dollar(n: Double) {
    def $ = to_$(n)
  }

  implicit def d2Meter(n: Double) = new Length(n)

  implicit def d2Dollar(n: Double) = new Dollar(n)

}