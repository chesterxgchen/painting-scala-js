package tags

import scalatags._

/**
 *
 * User: chester
 * Date: 2/28/14
 * Time: 8:02 AM
 */

object AttrsEx extends AttrsEx

trait AttrsEx extends Attrs{

  /**
     todo: need documentation
   */
  val httpEquiv = "http-equiv".attr

  val cellSpacing = "cellspacing".attr

  val cellPadding = "cellpadding".attr

  val colspan = "colspan".attr

  val valign = "valign".attr

}
