# -*- coding: utf-8 -*-

class PrimeraVocal:
  def __init__(self):
     self.check = True
     self.leng = 1
  def vocal(self, palabra):
    for p in palabra:
      if p.lower() == 'a' or p.lower() == 'á':
         print("La primera vocal es: {0}".format(p))
         break
      elif p.lower() == 'e' or p.lower() == 'é':
         print("La primera vocal es: {0}".format(p))
         break
      elif p.lower() == 'i' or p.lower() == 'í':
         print("La primera vocal es: {0}".format(p))
         break
      elif p.lower() == 'o' or p.lower() == 'ó':
         print("La primera vocal es: {0}".format(p))
         break
      elif p.lower() == 'u' or p.lower() == 'ú':
         print("La primera vocal es: {0}".format(p))
         break
      elif self.check:
         if self.leng == len(palabra):
           print("Lo sentimos, no hay vocales!!")
         self.leng += 1

palabra = input("Ingrese la palabra a evaluar: ")

buscar = PrimeraVocal()
buscar.vocal(palabra)
