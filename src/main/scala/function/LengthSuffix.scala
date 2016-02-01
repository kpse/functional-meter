package function

case class Length(milli: Double) {
  def price = 5
  def +(other: Length) = Length(milli + other.milli)
  def -(other: Length) = Length(milli - other.milli)
  def *(times: Double) = Length(milli * times)
  def /(parts: Double) = Length(milli / parts)
}
case class LengthSuffix(n: Double) {
  def m = LengthSuffix.fromM(n)

  def cm = LengthSuffix.fromCM(n)

  def mm = LengthSuffix.fromMM(n)
}

object LengthSuffix {
  def fromM(meter: Double) = Length(1000 * meter)

  def fromCM(centi: Double) = Length(10 * centi)

  def fromMM(milli: Double) = Length(milli)

  implicit def d2Meter(n: Double): LengthSuffix = new LengthSuffix(n)

}

