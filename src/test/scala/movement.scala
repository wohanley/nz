import nz.geometry.North
import nz.geometry.East
import nz.geometry.South
import nz.geometry.West
import nz.movement.directionInput
import nz.movement.wasdInput
import org.mockito.Mockito.when
import org.mockito.Mock
import org.newdawn.slick.Input
import org.scalatest.FlatSpec
import org.scalatest.mock.MockitoSugar

class Movement extends FlatSpec with MockitoSugar {

  def mockKeyInput(keyCodes: Int*): Input = {
    val input = mock[Input]
    keyCodes.map(code => when(input.isKeyPressed(code)).thenReturn(true))
    return input
  }

  "directionInput" should "recognize primary directions" in {

    val dir = directionInput(wasdInput)_

    val north = mockKeyInput(Input.KEY_W)
    val south = mockKeyInput(Input.KEY_S)
    val east = mockKeyInput(Input.KEY_D)
    val west = mockKeyInput(Input.KEY_A)

    assert(dir(north) == North.unit)
    assert(dir(south) == South.unit)
    assert(dir(east) == East.unit)
    assert(dir(west) == West.unit)
  }
}
