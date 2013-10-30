/**
 * Created by 10004426 on 30/10/13.
 */
class Point(val x: Int, val y: Int)

class Rectangle(val topLeft: Point, val bottomRight: Point)
  extends Rectangular {
  // other methods...
}

trait Rectangular {
  def topLeft: Point
  def bottomRight: Point
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
  // and many more geometric methods...
}

abstract class Component extends Rectangular {
  // other methods...
}