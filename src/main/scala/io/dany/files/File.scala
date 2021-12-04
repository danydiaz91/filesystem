package io.dany.files

import io.dany.filesystem.FilesystemException

class File(override val parentPath: String, override val name: String, contents: String)
  extends DirEntry(parentPath, name) {

  override def asDirectory: Directory = throw new FilesystemException("A file cannot be converted to a directory!")

  override def asFile: File = this

  override def getType: String = File.TYPE
}

object File {
  val TYPE = "File"

  def empty(parentPath: String, name: String): File = {
    new File(parentPath, name, "")
  }
}
