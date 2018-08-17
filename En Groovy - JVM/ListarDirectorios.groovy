def numDir = 0

new File(".").eachDirRecurse {
    println(it)
    numDir++
}

if(numDir > 1 || numDir == 0)
    println("\nSe han encontrado $numDir directorios!")
else if(numDir == 1)
    println("\nSe ha encontrado $numDir directorio!")
