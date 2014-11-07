import nz.geometry.Vector
import utils.approxEquals
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class Geometry extends FlatSpec with GeneratorDrivenPropertyChecks
  with ShouldMatchers {

  val floatingEquals = approxEquals(0.0001)_

  "Vectors" should "add correctly" in {
    forAll { (a: Double, b: Double, c: Double, d: Double) =>
      val result = Vector(a, b) + Vector(c, d)
      assert(floatingEquals(result.x, a + c))
      assert(floatingEquals(result.y, b + d))
    }
  }
}
