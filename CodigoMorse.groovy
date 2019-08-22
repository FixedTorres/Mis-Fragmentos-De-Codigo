final def input = new Scanner(System.in)

final def mapCode = [
        "a": ".-", "b": "-...", "c": "-.-.",
        "d": "-..", "e": ".", "f": "..-.",
        "g": "--.", "h": "....", "i": "..",
        "j": "·---", "k": "-.-", "l": ".-..",
        "m": "--", "n": "-.", "ñ": "--.--",
        "o": "---", "p": ".__.", "q": "--.-",
        "r": ".-.", "s": "...", "t": "-",
        "u": "..-", "v": "...-", "w": ".--",
        "x": "-..-", "y": "-.--", "z": "--..",

        "0": "-----", "1": ".----", "2": "..---",
        "3": "...--", "4": "....-", "5": ".....",
        "6": "-....", "7": "--...", "8": "---..", "9": "----.",

        ".": ".-.-.-", ",": "-.-.--", "?": "..--..", "\"": ".-..-."
]

print("Ingrese la palabra que desea codificar: ")
def texto = input.nextLine()

def texto_codificado = ""
texto.toLowerCase().each {
    texto_codificado += mapCode.getOrDefault(it, it)
}

println("Texto codificado: ${texto_codificado}")
