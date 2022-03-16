package main.scala.chapter3

import org.apache.spark.sql.types._

object Example3_2 {
    def main(args: Array[String]):Unit = {
        val schema = StructType(Array(StructField(author)))
    }
}