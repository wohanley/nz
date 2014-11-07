package nz

package object movement {

  import org.newdawn.slick.Input
  import nz.geometry.CardinalDirection
  import nz.geometry.North
  import nz.geometry.South
  import nz.geometry.East
  import nz.geometry.West
  import nz.geometry.Vector

  case class DirectionKeyInput(north: Boolean, south: Boolean, east: Boolean,
    west: Boolean)

  val wasdInput = Map(
    Input.KEY_W -> North,
    Input.KEY_S -> South,
    Input.KEY_A -> West,
    Input.KEY_D -> East
  )

  def directionInput(keymap: Map[Int, CardinalDirection])(input: Input):
    Vector = {
    keymap.foldLeft(Vector(0, 0))((vector, mapping) =>
      if (input.isKeyPressed(mapping._1))
        vector + mapping._2.unit
      else
        vector
    )
  }
}
