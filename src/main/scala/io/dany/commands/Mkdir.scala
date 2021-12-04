package io.dany.commands
import io.dany.files.{DirEntry, Directory}
import io.dany.filesystem.State

class Mkdir(name: String) extends CreateEntry(name) {

  override def createSpecificEntry(state: State): DirEntry = {
    Directory.empty(state.wd.path, name)
  }
}
