package data

data class CSVDataClass(override val name:String,override val age:String,override val city:String) : JsonObject(name,age,city)
