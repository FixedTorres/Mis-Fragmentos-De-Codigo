#!/usr/bin/env ruby

codigos = {
  "a" => ".-", "b" => "-...", "c" => "-.-.",
  "d" => "-..", "e" => ".", "f" => "..-.",
  "g" => "--.", "h" => "....", "i" => "..",
  "j" => "·---", "k" => "-.-", "l" => ".-..",
  "m" => "--", "n" => "-.", "ñ" => "--.--",
  "o" => "---", "p" => ".__.", "q" => "--.-",
  "r" => ".-.", "s" => "...", "t" => "-",
  "u" => "..-", "v" => "...-", "w" => ".--",
  "x" => "-..-", "y" => "-.--", "z" => "--..",

  "0" => "-----", "1" => ".----", "2" => "..---",
  "3" => "...--", "4" => "....-", "5" => ".....",
  "6" => "-....", "7" => "--...", "8" => "---..", "9" => "----.",

  "." => ".-.-.-", "," => "-.-.--", "?" => "..--..", "\"" => ".-..-."
}

texto_codificado = ""

print "Ingrese un texto a codigicar: "
texto = gets().chomp()

texto.downcase!
texto.each_char { |chr|
  if codigos.keys.include?(chr) && chr != " "
    texto_codificado << codigos[chr]
  else
    texto_codificado << chr
  end
}

puts "Texto codificado: #{texto_codificado}"