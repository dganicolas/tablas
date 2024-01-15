    fun pedirNum(min:Int, max:Int) : Int {
        var numero = 0
        do {
            try {
                print("dame un número del 1 al 100: ")
                numero = readln().toInt()
                if (numero in 1..100) {
                    return numero
                } else {
                    print("**ERROR** numero no valido (pulse ENTER para continuar...) ")
                    readln()
                }
            }catch (e:Exception) {
                print("**ERROR** numero no valido (pulse ENTER para continuar...) ")
                readln()
            }
        } while (numero < min || numero > max)
        return 0
    }

    /**
     * Realiza una pregunta para contestar con s/si ó n/no
     *
     * @param text String - Texto de la pregunta
     *
     * @return Boolean - true/false dependiendo de la respuesta válida a la pregunta
     */
    fun pregunta(text:String):Boolean {
        var pregunta=true
        do {
            print(text)
            val p = readln()
            when (p) {
                "si" -> pregunta = true
                "no" -> pregunta = false
                else -> {
                    print("**Respuesta no válida** (Pulse ENTER para continuar)")
                    readln()
                }
            }
        } while (p != "si" && p != "no")
        return pregunta
    }

    fun main() {
        val min = 1
        val max = 100
        val text = "¿Desea generar otra tabla de multiplicación? (s/n) "
//TODO: Solicitar la introducción de un número entre 1 y 100 y mostrar su table de multiplicar...
//Hasta que se responda negativamente a la pregunta "¿Desea generar otra tabla de multiplicación? (s/n)"
        do {
            val num = pedirNum(min,max)
            println("La tabla de multiplicar del número $num es: ")
            val tabla = IntArray(10) { i -> i + 1 }
            //val tabla = Array<String>(11) {"$it -> $num x $it = ${it * num}" }
            for (i in tabla) {
                println("$i -> $num x $i = ${i * num}")
                //println(i)
            }
            //tabla.forEach {println(it)}
        } while (pregunta(text))
    }
