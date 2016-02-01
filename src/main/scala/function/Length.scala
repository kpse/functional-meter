package function

case class Length(n: Double) {
  def m = Length.to_m(n)

  def cm = Length.to_cm(n)

  def mm = Length.to_mm(n)

}

object Length {
  def to_m(meter: Double) = 1000 * meter

  def to_cm(centi: Double) = 10 * centi

  def to_mm(milli: Double) = milli

  implicit def d2Meter(n: Double): Length = new Length(n)

}

