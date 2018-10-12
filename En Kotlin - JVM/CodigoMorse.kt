fun String.codigoMorse(): String {
    val mapCode = mapOf<String, String>(
         "a" to ".-", "b" to "-...", "c" to "-.-.", "d" to "-..", "e" to ".",
         "f" to "..-.","g" to "--.", "h" to "....", "i" to "..", "j" to "·---",
         "k" to "-.-", "l" to ".-..", "m" to "--", "n" to "-.", "ñ" to "--.--",
         "o" to "---", "p" to ".__.", "q" to "--.-", "r" to ".-.", "s" to "...",
         "t" to "-", "u" to "..-", "v" to "...-", "w" to ".--", "x" to "-..-",
         "y" to "-.--", "z" to "--..",

         "0" to "-----", "1" to ".----", "2" to "..---", "3" to "...--",
         "4" to "....-", "5" to ".....", "6" to "-....", "7" to "--...",
         "8" to "---..", "9" to "----.",

         "." to ".-.-.-", "," to "-.-.--", "?" to "..--..", "\"" to ".-..-."
    )

    var aux = ""
    this.toLowerCase().forEach { it ->
        aux += mapCode.getOrDefault(it.toLowerCase().toString(), it.toString())
    }
    
    return aux
}

fun main(args: Array<String>) {
    val texto: String

    print("Ingrese el texto a codificar: ")
    texto = readLine() as String

    println("Texto codificado: ${texto.codigoMorse()}")
}
