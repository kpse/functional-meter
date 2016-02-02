package function

case class Length(milli: Double) {
  def price: Dollar = Dollar(0.005 * milli)
  def +(other: Length) = Length(milli + other.milli)
  def -(other: Length) = Length(milli - other.milli)
  def *(times: Double) = Length(milli * times)
  def /(parts: Double) = Length(milli / parts)
}
case class LengthSuffix(n: Double) {
  def m = Length(1000 * n)

  def cm = Length(10 * n)

  def mm = Length(n)
}

object LengthSuffix {
  implicit def d2Meter(n: Double): LengthSuffix = LengthSuffix(n)
  implicit def Int2Meter(n: Int): LengthSuffix = d2Meter(n)
}

