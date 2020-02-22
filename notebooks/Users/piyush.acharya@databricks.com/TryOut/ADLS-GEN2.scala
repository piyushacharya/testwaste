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

// To set scope 
// Go to URL https://westus2.azuredatabricks.net/?o=6935536957980197#secrets/createScope
//set resource /subscriptions/6369c148-f8a9-4fb5-8a9d-ac1b2c8e756e/resourcegroups/piyush_west_us/providers/Microsoft.KeyVault/vaults/piyushkv

val secret= dbutils.secrets.get("piyushScope","admin123")




// COMMAND ----------

 p = dbutils.notebook.entry_point.getDbutils().notebook().getContext().apiToken().get()
        v = ""
        i=0
        last = ""
        for c in p:
            if(i<len(p)-1):
                i = i +1 
                v = v+c
            else:
                last = c
        token = v + last

// COMMAND ----------

