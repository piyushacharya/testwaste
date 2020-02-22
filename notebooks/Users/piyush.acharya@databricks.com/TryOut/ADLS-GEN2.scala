// Databricks notebook source
val storageAccountName = "piyushadls2"
val fileSystem = "piyushadlsfs1"
val storageAccountAccessKey = "d74/WlJQdUXjIlxgi3eKkQFlKf7PwP/F248oBqdf7W0mPkYXBfX2EqAS3Y/Rroit+ykL/9NiaYkSLWziyMBEVw=="



// This has to be once for file system not per notebooks 
spark.conf.set("fs.azure.createRemoteFileSystemDuringInitialization", "true")
spark.conf.set("fs.azure.createRemoteFileSystemDuringInitialization", "false")
spark.conf.set("fs.azure.account.key.piyushadls2.dfs.core.windows.net",storageAccountAccessKey)

//dbutils.fs.ls("abfss://piyushadlsfs1@piyushadls2.dfs.core.windows.net/")

//dbutils.fs.ls("abfss://piyushadlsfs1@piyushadls2.dfs.core.windows.net/")

spark.read.csv("abfss://piyushadlsfs1@piyushadls2.dfs.core.windows.net/update_data.csv.csv").collect()



// COMMAND ----------

val df = spark.read.parquet("abfss://<file-system-name>@<storage-account-name>.dfs.core.windows.net/<directory-name>")


// COMMAND ----------

spark.range(1,1000000).count()

// COMMAND ----------



 display(csvRDD.toDF())

// COMMAND ----------

