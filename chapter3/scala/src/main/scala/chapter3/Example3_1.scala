package main.scala.chapter3

import org.apache.spark.sql.functions.avg
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types._

object Example3_1{
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("DataFrameExample")
      .getOrCreate()

    val dataDF = spark.createDataFrame(Seq(("Brooke", 20), ("Brooke", 25), ("Denny", 31), ("Jules", 30), ("TD", 35)))
      .toDF("name", "age")

    // Group the same names together, aggregate their ages, and compute an average
    val avgDF = dataDF.groupBy("name").agg(avg("age"))

    avgDF.show()
  }
}
