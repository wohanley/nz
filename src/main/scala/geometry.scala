package nz

package object geometry {

  case class Vector(x: Double, y: Double) {
    def +(that: Vector): Vector = {
      Vector(this.x + that.x, this.y + that.y)
    }
  }

  trait CardinalDirection {
    def name: String
    def unit: Vector
  }

  case object North extends CardinalDirection {
    val name = "north"
    val unit = Vector(0, -1)
  }

  case object South extends CardinalDirection {
    val name = "south"
    val unit = Vector(0, 1)
  }

  case object East extends CardinalDirection {
    val name = "east"
    val unit = Vector(1, 0)
  }

  case object West extends CardinalDirection {
    val name = "west"
    val unit = Vector(-1, 0)
  }
}
