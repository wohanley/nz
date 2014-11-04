package nz

import nz.geometry.Vector
import org.newdawn.slick.GameContainer
import org.newdawn.slick.Image

package object models {

  case class GameState(map: LocalMap, agents: List[Agent])

  case class LocalMap(image: Image)

  case class MemberAgent(image: Image, position: Vector) extends Agent {
    def update(container: GameContainer) = MemberAgent(image, position)
  }
}
