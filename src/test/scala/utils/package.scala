package object utils {
  def approxEquals(tolerance: Double)(x: Double, y: Double): Boolean =
    Math.abs(x - y) < tolerance
}
