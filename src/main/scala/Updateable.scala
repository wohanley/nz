package nz

trait Updateable[T] {

  import org.newdawn.slick.GameContainer

  def update(x: T, container: GameContainer): T
}
