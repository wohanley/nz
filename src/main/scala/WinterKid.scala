package nz

import nz.geometry.Vector
import org.newdawn.slick.GameContainer
import org.newdawn.slick.Image

case class WinterKid(image: Image, position: Vector) extends Agent {
  def update(container: GameContainer) = WinterKid(image, position)
}
