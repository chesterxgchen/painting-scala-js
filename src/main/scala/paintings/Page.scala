package paintings


import scalatags.all._
import tags.{HtmlHelper, AttrsEx}
import scalatags._
import scalatags.Styles.verticalAlign

/**
 *
 * User: chester
 * Date: 2/28/14
 * Time: 7:37 AM
 */
object Page {

  import HtmlHelper._
  import AttrsEx._

  val jsFiles = Seq(
    "js/jquery.min.js"
  )
  val styleFiles = Seq(
    "styles/mainstyle.css"
  )

  val pageDescription=  """
                          |  I was very impressed the first time I saw Yueying Zhong’s works by his powerful
                          |  portraits series of Chinese peasants. These portraits were created during the early
                          |  1980s during the later years of the Cultural Revolution, when Chinese artists were
                          |    sent to the countryside to toil alongside their countrymen. Zhong’s portraits
                          |    capture the personality and circumstances of each of these workers by focusing on
                          |  their etched and wrinkled individual faces and hands. They are masterpieces of
                          |    Twentieth Century portraiture that deserve widespread respect and acclaim."
                          |  Mark Dean Johnson, Professor of Art <BR>
                          |  San Francisco State University, USA
                          |
                        """.stripMargin

  var images = Map(
    "scan0001.jpg" -> "Hebei Villager--1 &nbsp;&nbsp;      44”x35”&nbsp;&nbsp;Ink on xuan paper&nbsp;&nbsp;1982",
    "scan0002.jpg" -> "Hebei Villager--2&nbsp;&nbsp;44”x35”&nbsp;&nbsp;Ink on xuan paper&nbsp;&nbsp; 1982",
    "新相机拍_009.jpg" -> "Silver Beard Man&nbsp;&nbsp;21” x 14”&nbsp;&nbsp;      Ink on Xuan Paper&nbsp;&nbsp;1983",
    "新相机拍_010.jpg" -> "Miner--1&nbsp;&nbsp;&nbsp;&nbsp;25”x14”&nbsp;&nbsp;Ink on xuan paper&nbsp;&nbsp;1983",
    "新相机拍_014.jpg" -> "A Man with Long Beard    21” x 112” &nbsp;&nbsp;     Ink on Xuan Paper&nbsp;&nbsp;1983",
    "新相机拍_032.jpg" -> "Pupil&nbsp;&nbsp;&nbsp;&nbsp;   35 ”x 26” &nbsp;&nbsp;      Ink on Xuan Paper&nbsp;&nbsp;1984",
    "新相机拍_033.jpg" -> "Villager --1&nbsp;&nbsp;    45” x 34”	&nbsp;&nbsp; 	 Ink on Xuan Paper&nbsp;&nbsp;1981",
    "新相机拍_036.jpg" -> "Villager --2&nbsp;&nbsp;    44”x35”&nbsp;&nbsp;Ink on xuan paper&nbsp;&nbsp;1981",
    "新相机拍_037.jpg" -> "Hebei Villager-3&nbsp;&nbsp;45” x 34” &nbsp;&nbsp;     Ink on Xuan Paper&nbsp;&nbsp;1982",
    "新相机拍_038.jpg" -> "Vicissitudes&nbsp;&nbsp;    47” x 33”	&nbsp;&nbsp;     Ink on Xuan Paper&nbsp;&nbsp;1983",
    "新相机拍_041.jpg" -> "Old age&nbsp;&nbsp;&nbsp;&nbsp;47” x 33” &nbsp;&nbsp;     Ink on Xuan Paper&nbsp;&nbsp;1983",
    "新相机拍_043.jpg" -> "Smoking Villager&nbsp;&nbsp;45”x36”&nbsp;&nbsp;Ink on xuan paper&nbsp;&nbsp;1982",
    "新相机拍_045.jpg" -> "Senior&nbsp;&nbsp;&nbsp;&nbsp; 45” x 27” &nbsp;&nbsp;	 Ink on Xuan Paper&nbsp;&nbsp;1984",
    "新相机拍_047.jpg" -> "Miner—2&nbsp;&nbsp;&nbsp;&nbsp;19”x12”&nbsp;&nbsp;Ink on xuan paper&nbsp;&nbsp;1983",
    "新相机拍_048.jpg" -> "Village Pupil&nbsp;&nbsp;   36” x 26” &nbsp;&nbsp; 	 Ink on Xuan Paper&nbsp;&nbsp;1984",
    "新相机拍_051.jpg" -> "Villager --3&nbsp;&nbsp;    44”x35”&nbsp;&nbsp;Ink on xuan paper&nbsp;&nbsp;1981",
    "新相机拍_054.jpg" -> "Villager -4&nbsp;&nbsp;     43” x 34” &nbsp;&nbsp;	     Ink on Xuan Paper&nbsp;&nbsp;1981"
  )

  var thumbPath = "yueying/thumbnails_people"
  def pageHeader = head(
    addTitle("Yueying Zhong's painting"),
    addMeta("keywords", "ink painting"),
    addMeta("description", "Yueying's painting"),
    meta(httpEquiv := "Content-Type", content := "text/html; charset=utf-8"),
    for (s <- styleFiles) yield addStyleLink(s),
    for (js <- jsFiles) yield addJavaScriptFile(js)

  )

  def pageContent = ul(`class` := "publications-table")(segment.toSeq)

  def segment = for (i <- images) yield li(a(img(src := s"$thumbPath/${i._1}")))

  def pageBody =
    body(
      form(name := "painting-1", id := "painting-1")(
        table(id := "outerTable", `class` := "outer-table", width := "100%", cellSpacing := "0",cellPadding := "0",border := "0", height := "100%")(
          tbody(
            tr(
              td(valign := "top", height := "100%", `class` := "mainCell")(
                table(cellSpacing := "0", cellPadding := "0", border := "0", `class` := "mainTable")(
                  tbody(
                   tr(
                     td(id := "TopPane", colspan := "4", `class` := "topPane")(
                       div(`class` := "top page-width")(
                         div(`class` := "logo-company")(
                           a(href := "")(h3(em("Web Page with Scala.js")))
                         ),
                         div(`class` := "push")
                       )
                     )
                   )
                    ,
                    tr(
                      td(id := "ContentPane", verticalAlign := "top", height := "100%", `class` := "contentPane")(
                        div(id := "publications", `class` := "content page-width")(
                          div(`class` := "title-page")(
                            h1("Yueying Zhong's Ink Painting")
                          ),
                          div(id := "publication-table")(
                            ul(`class` := "publications-table")(
                              li("&nbsp;")
                            )
                          )
                        )
                      )
                    ),
                    tr(
                      td(id := "ContentPane2", `class` := "contentPane", verticalAlign := "top")(
                        div(id := "homepage", `class` := "content  page-width")(
                          div(`class` := "content page-width2")(
                            html(
                             pageDescription
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    )

}
