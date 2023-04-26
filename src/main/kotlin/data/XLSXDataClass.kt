package data

data class XLSXDataClass(override val name:String,override val age:String,override val city:String,val tagVersion:Int):JsonObject(name,age,city)
