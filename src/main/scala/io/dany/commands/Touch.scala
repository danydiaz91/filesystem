package io.dany.commands
import io.dany.files.{DirEntry, File}
import io.dany.filesystem.State

class Touch(name: String) extends CreateEntry(name) {

  override def createSpecificEntry(state: State): DirEntry = {
    File.empty(state.wd.path, name)
  }
}
