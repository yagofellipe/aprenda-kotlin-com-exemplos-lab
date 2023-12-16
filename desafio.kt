class Usuario(val name: String)

data class ConteudoEducacional(val nome: String, var duracao: Int = 60)

data class Formacao(
    val nome: String,
    var conteudos: List<ConteudoEducacional>,
    var nivel: String
) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.name} matriculado na formação $nome")
        inscritos.forEach{println(it.name)}
    }
}

fun main() {
    var usu = Usuario("Yago")
    var algoritmos = ConteudoEducacional("Algoritmo")
    var formacaoDev = Formacao("Desenvolvedor", listOf(algoritmos), "Intermediário")
    formacaoDev.matricular(usu)
    println("${formacaoDev.nivel}")
}
