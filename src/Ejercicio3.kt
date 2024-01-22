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


    override fun toString(): String {
        return "Rectángulo con area = ${this.area} cms y perimetro = ${this.perimetro} cms"
    }
}

fun main(){
    val rectangulo1 = rectangulo(12.0, 12.0)
    val rectangulo2 = rectangulo(19.0, 20.0)
    val rectangulo3 = rectangulo(9.0, 1.0)
    val rectangulo4 = rectangulo(7.0, 15.0)
    rectangulo1.calcularArea()
    rectangulo1.calcularPerimetro()
    rectangulo2.calcularArea()
    rectangulo2.calcularPerimetro()
    rectangulo3.calcularArea()
    rectangulo3.calcularPerimetro()
    rectangulo4.calcularArea()
    rectangulo4.calcularPerimetro()
    println(rectangulo1.toString())
    println(rectangulo2.toString())
    println(rectangulo3.toString())
    println(rectangulo4.toString())

}