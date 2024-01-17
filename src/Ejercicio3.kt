class rectangulo(var base: Double, var altura: Double){

    var perimetro:Double = 0.0
    var area : Double = 0.0
    fun calcularPerimetro(): Double {
        perimetro = ((2*this.base)+(2*this.altura))
        return perimetro
    }
    fun calcularArea(): Double {
        area = (this.base*this.altura)
        return area
    }
}

fun main(){
    val rectangulo1 = rectangulo(12.0, 12.0)
    val rectangulo2 = rectangulo(19.0, 20.0)
    val rectangulo3 = rectangulo(9.0, 1.0)
    val rectangulo4 = rectangulo(7.0, 15.0)
    println("Perimetro del rectangulo 1 -> ${rectangulo1.calcularPerimetro()}cms")
    println("Área del rectangulo 1 -> ${rectangulo1.calcularArea()}cms")
    println("Perimetro del rectangulo 2 -> ${rectangulo1.calcularPerimetro()}cms")
    println("Área del rectangulo 2 -> ${rectangulo1.calcularArea()}cms")
    println("Perimetro del rectangulo 3 -> ${rectangulo1.calcularPerimetro()}cms")
    println("Área del rectangulo 3 -> ${rectangulo1.calcularArea()}cms")
    println("Perimetro del rectangulo 4 -> ${rectangulo1.calcularPerimetro()}cms")
    println("Área del rectangulo 5 -> ${rectangulo1.calcularArea()}cms")

}