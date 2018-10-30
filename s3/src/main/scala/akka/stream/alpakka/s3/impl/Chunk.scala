/*
 * Copyright (C) 2016-2018 Lightbend Inc. <http://www.lightbend.com>
 */

package akka.stream.alpakka.s3.impl

import akka.stream.scaladsl.Source
import akka.NotUsed
import akka.util.ByteString

private[alpakka] abstract class Chunk(val size: Int) {

  def data: Source[ByteString, NotUsed]
}
