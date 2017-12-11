#!/usr/bin/env ruby

listUno = ["Negro", "Blanco", "Verde", "Cafe", "Gris"]
listDos = ["Grande", "Mediano", "Chico"]

listUno.each { |l1| listDos.each { |l2| puts "#{l1}-#{l2}" } }
