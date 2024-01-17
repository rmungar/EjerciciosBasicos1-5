import kotlin.math.roundToInt

class persona(var peso: Double, var altura: Double){

    var nombre: String = ""
    var imc:Double = 0.00
    init {
        this.imc = (this.peso/(this.altura * this.altura))
    }

    constructor(nombre:String, peso: Double, altura: Double) : this(peso, altura){
        this.nombre = nombre
    }

    fun cambiarNombre(){
        var nom = ""
        print("Ingresa el nuevo nombre: ")
        nom = readln()
        if (nom != this.nombre) {
            this.nombre = nom
            println("Nombre cambiado a $nom")
        }
        else println("Nombre no modificado")
    }

    fun cambiarImc(){
        var pes = 0.0
        var alt = 0.0
        print("Introduzca su nuevo peso: ")
        pes = readln().toDouble()
        if (pes.toString() != ""){
            println("Peso cambiado")
            this.peso = pes
        }
        else println("Peso no cambiado")
        print("Introduzca su nueva altura: ")
        alt = readln().toDouble()
        if (alt.toString() != ""){
            println("Altura cambiada")
            this.altura = alt
        }
        else println("Altura no cambiada")
    }
}

fun main() {
    val persona1 = persona(72.00, 180.00)
    val persona2 = persona("MMORPG NO LINEAL", 190.00, 170.00)
    val persona3 = persona("Anthem", 100.00, 78.00)
    persona1.cambiarNombre()
    println("Nombre: ${persona2.nombre}, peso = ${persona2.peso}KG, altura = ${persona2.altura}cms")
    persona3.cambiarImc()
    println(persona3.imc)
}