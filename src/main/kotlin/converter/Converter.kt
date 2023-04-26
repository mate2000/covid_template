package converter

import data.JsonObject

interface Converter {
    fun converterData():JsonObject
}