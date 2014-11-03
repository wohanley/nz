package nz

import org.newdawn.slick.GameContainer
import org.newdawn.slick.Image

package object models {

  case class Vector(x: Int, y: Int)

  case class GameState(map: LocalMap, agents: List[Agent])

  case class LocalMap(image: Image)

  case class Agent(image: Image, position: Vector)

  implicit object UpdateableAgent extends Updateable[Agent] {
    def update(agent: Agent, container: GameContainer): Agent = agent
  }

  class WinterKid(image: Image, position: Vector) extends Agent(image, position)

  implicit object UpdateableWinterKid extends Updateable[WinterKid] {
    def update(kid: WinterKid, container: GameContainer): WinterKid = kid
  }
}
