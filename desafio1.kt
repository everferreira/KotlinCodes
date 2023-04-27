enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

fun matricular(usuario: Usuario) {
    if (!inscritos.contains(usuario)) {
        inscritos.add(usuario)
        println("$usuario matriculado na formação $nome.")
    } else {
        println("$usuario já está matriculado na formação $nome.")
    }
}

fun desmatricular(usuario: Usuario) {
    if (inscritos.contains(usuario)) {
        inscritos.remove(usuario)
        println("$usuario desmatriculado da formação $nome.")
    } else {
        println("$usuario não está matriculado na formação $nome.")
    }
}

fun listarInscritos() {
    if (inscritos.isEmpty()) {
        println("Não há inscritos na formação $nome.")
    } else {
        println("Inscritos na formação $nome:")
        inscritos.forEach { println("- ${it.nome}") }
    }
}

}