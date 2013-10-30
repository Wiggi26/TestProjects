/**
 * Created by 10004426 on 23/10/13.
 */

import ChecksumAccumulator.calculate

object Summer {
  def main(args: Array[String]){
    for (arg <- args)
      println( arg + ": " + calculate(arg))

  }

}
