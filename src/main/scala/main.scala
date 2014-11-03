package nz

import nz.models.Agent
import nz.models.GameState
import nz.models.LocalMap
import nz.models.UpdateableAgent
import nz.models.UpdateableWinterKid
import nz.models.Vector
import nz.models.WinterKid
import org.newdawn.slick.AppGameContainer
import org.newdawn.slick.BasicGame
import org.newdawn.slick.GameContainer
import org.newdawn.slick.Graphics
import org.newdawn.slick.Image

class SlickGame(title: String) extends BasicGame(title) {

  private var gameState = None: Option[GameState]

  override def init(container: GameContainer): Unit = {
    this.gameState = Some(GameState(
      LocalMap(new Image("res/winter.png")),
      List(new WinterKid(new Image("res/winterkid.png"), Vector(0, 0)))))
  }

  override def update(container: GameContainer, i: Int): Unit = {

    def updateAgent[T](agent: T)(implicit up: Updateable[T]): T = {
      up.update(agent, container)
    }

    this.gameState.map(state => state.agents.map(updateAgent))
  }

  override def render(container: GameContainer, graphics: Graphics): Unit = {
    
  }
}

object Main {
  def main(args: Array[String]) = {
    val container = new AppGameContainer(new SlickGame("Hello"))
    container.setDisplayMode(640, 480, false)
    container.start()
  }
}

