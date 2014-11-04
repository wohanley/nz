package nz

package object geometry {

  case class Vector(x: Float, y: Float)

  sealed trait CardinalDirection { def name: String }
  case object North extends CardinalDirection { val name = "north" }
  case object South extends CardinalDirection { val name = "south" }
  case object East extends CardinalDirection { val name = "east" }
  case object West extends CardinalDirection { val name = "west" }
}
