import converter.ConvertJsonToCSV

fun main(args: Array<String>) {

    val jsonString = """
    {
      "name": "John",
      "age": 30,
      "city": "New York"
    }
  """

    val converter = ConvertJsonToCSV(jsonString)

    converter.generateCVS(converter.converterData())

    println("Prueba")

    println("Program arguments: ${args.joinToString()}")
}