package nz

import org.newdawn.slick.GameContainer
import org.newdawn.slick.Image

package object models {

  case class Vector(x: Int, y: Int)

  case class GameState(map: LocalMap, agents: List[Agent])

  case class LocalMap(image: Image)

  case class MemberAgent(image: Image, position: Vector) extends Agent {
    def update(container: GameContainer) = MemberAgent(image, position)
  }

  case class WinterKid(image: Image, position: Vector) extends Agent {
    def update(container: GameContainer) = WinterKid(image, position)
  }
}
