package tags


import scalatags.all._
import scalatags._
/**
 *
 * User: chester
 * Date: 2/28/14
 * Time: 7:51 AM
 */
object HtmlHelper {

  def addTitle(title: String): HtmlTag = {
    Tags2.title(id := "title")(title)
  }

  def addMeta(key: String, value: String): HtmlTag = {
    meta(name := key, value)
  }

  def addStyleLink(styleHref: String): HtmlTag =
    link(href := styleHref, `rel` := "stylesheet")

  def addJavaScriptFile(scriptSrc: String): HtmlTag = {
    script(`type` := "text/javascript", src := scriptSrc)
  }

  def javaScript(scripts: String) : HtmlTag = {
    script(`type` := "text/javascript")(
      raw(scripts)
    )
  }

}
