package nz

import org.newdawn.slick.GameContainer

trait Agent {
  def update(container: GameContainer): Agent
}
