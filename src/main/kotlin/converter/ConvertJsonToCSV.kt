package converter

import com.github.doyaaaaaken.kotlincsv.dsl.csvWriter
import data.CSVDataClass
import org.json.JSONObject


class ConvertJsonToCSV(val jsonData: String) : Converter {

    override fun converterData(): CSVDataClass {
        val json = JSONObject(jsonData)
        return CSVDataClass(json.getString("name"),json.getInt("age").toString(),json.getString("city"))
    }

    fun generateCVS(csvData: CSVDataClass) {
        val rows = listOf(listOf(csvData.name, csvData.age, csvData.city))
        csvWriter().writeAll(rows, "test1.csv")
    }
}