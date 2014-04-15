package paintings

import org.scalajs.dom


object PaintingSite {

  def main(): Unit = {
    import Page._

    dom.document.head.innerHTML = pageHeader.toString()
    dom.document.body.innerHTML = pageBody.toString()
    dom.document.getElementById("publication-table").innerHTML = pageContent().toString()


  }
}
