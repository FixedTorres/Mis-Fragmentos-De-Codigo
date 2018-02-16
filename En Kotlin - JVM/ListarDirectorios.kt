/*
 * Created by fixedtorres.
 */

package listDirectorios

import java.io.File

fun main(Args: Array<String>) {
    var numDirs = 0

    File(".").walkTopDown().forEach { when {
            it.isDirectory -> { println(it)
                numDirs++
            }
        }
    }
    println("\nNumero de directorios encontrados: ${numDirs}")
}
