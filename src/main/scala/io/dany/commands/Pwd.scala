package io.dany.commands
import io.dany.filesystem.State

class Pwd extends Command {

  override def apply(state: State): State = {
    state.setMessage(state.wd.path)
  }
}
