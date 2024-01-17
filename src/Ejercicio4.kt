class coche(){
    private var color: String = ""
    fun getColor(): String{
        return this.color
    }
    fun setColor(color: String){
        if (color.isNotEmpty()){
            this.color = color.lowercase()
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    private var marca: String = ""
    fun getMarca(): String{
        return this.marca
    }
    fun setMarca(marca: String){
        if (marca.isNotEmpty()){
            this.marca = marca
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    private var modelo: String = ""

    fun getModelo(): String{
        return this.modelo
    }
    fun setModelo(modelo: String){
        if (modelo.isNotEmpty()){
            this.modelo = modelo
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    private var caballos: Int = 0
    fun getCaballos(): Int{
        return this.caballos
    }
    fun setCaballos(caballos: Int){
        if (caballos in 70..700){
            this.caballos = caballos
        }
        else this.caballos = 0
    }
    //------------------------------------------------------------------------------------------------------------------
    private var matricula: String = ""
    fun getMatricula(): String{
        return this.matricula
    }
    fun setMatricula(matricula: String){
        if (matricula.isNotEmpty()){
            this.matricula = matricula
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    private var puertas: Int = 0
    fun getPuertas(): Int{
        return this.puertas
    }
    fun setPuertas(puertas: Int){
        if (puertas != 0){
            this.puertas = puertas
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    override fun toString(): String {
        return "${this.marca} ${this.modelo} con ${this.puertas} puertas, ${this.caballos} caballos, con matricula: ${this.matricula} y de color ${this.color}"
    }
    //------------------------------------------------------------------------------------------------------------------
    fun cambiarColor(){
        print("¿De que color es tu ${this.marca} ${this.modelo}?: ")
        val colour = readln()
        if (colour != "") this.color = colour.lowercase()
        else {
            println("No se le ha cambiado el color al coche")
            readln()
        }
    }
}

fun main(){
    val coche1 = coche()
    coche1.setMarca("Seat")
    coche1.setModelo("Ateca")
    coche1.setPuertas(4)
    coche1.setCaballos(60)
    coche1.setMatricula("7976 HSD")
    coche1.setColor("Rojo")
    coche1.cambiarColor()
    val coche2 = coche()
    coche2.setMarca("Dodge")
    coche2.setModelo("Charger")
    coche2.setPuertas(2)
    coche2.setCaballos(700)
    coche2.setMatricula("7984 RTY")
    coche2.setColor("Negro")
    println("-----------INFO DE LOS COCHES-----------")
    println(coche1.toString())
    println(coche2.toString())
    println("----------------------------------------")
}