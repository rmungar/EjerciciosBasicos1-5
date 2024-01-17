
class person(var peso: Double, var altura: Double){

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

    fun cambiarImc() {
        var pes = 0.0
        var alt = 0.0
        print("Introduzca su nuevo peso: ")
        pes = readln().toDouble()
        if (pes.toString() != "") {
            println("Peso cambiado")
            this.peso = pes
        } else println("Peso no cambiado")
        print("Introduzca su nueva altura: ")
        alt = readln().toDouble()
        if (alt.toString() != "") {
            println("Altura cambiada")
            this.altura = alt
        } else println("Altura no cambiada")
    }
    fun saludar(){
        println("Hola, soy ${this.nombre}, un placer")
    }
    fun descripcion(){
        println("${this.nombre} con altura de ${this.altura}m y un peso de ${this.peso}KG (${saludable()}) ")
    }
   fun saludable(): String {
       var salud = ""
       if (this.imc < 18.5) salud = "Peso insuficiente"
       else if (18.5 < this.imc && this.imc < 24.9) salud = "Peso saludable"
       else if (25.0 < this.imc && this.imc < 29.9) salud = "Sobrepreso"
       else salud = "Obesidad"
       return salud
   }


}

fun main() {

    val persona1 = person(72.00, 180.00)
    val persona2 = person("MMORPG NO LINEAL", 190.00, 1.00)
    val persona3 = person("Anthem", 100.00, 0.78)
    val persona4 = person("Ppe",80.0, 1.70)
    val persona5 = person("pko", 1.75, 0.86)
    persona1.cambiarNombre()
    println("Nombre: ${persona2.nombre}, peso = ${persona2.peso}KG, altura = ${persona2.altura}m")
    persona3.cambiarImc()
    println(persona3.imc)
    persona1.saludar()
    persona1.descripcion()
    persona2.saludar()
    persona2.descripcion()
    persona3.saludar()
    persona3.descripcion()
    persona4.saludar()
    persona4.descripcion()
    persona5.saludar()
    persona5.descripcion()

}