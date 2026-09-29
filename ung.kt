class Pet(
    val nome: String,
    private var fome: Int = 0,
    private var felicidade: Int = 100,
    private var cansaco: Int = 0,
    private var idade: Int = 0
) {

    // Contadores usados para determinar alguns finais secretos
    private var quantidadeBrincadeiras = 0
    private var quantidadeDescansos = 0
    private var quantidadeAlimentacoes = 0

    // ---------------- ALIMENTAR ----------------

    fun alimentar() {

        fome -= 20

        if (fome < 0) {
            fome = 0
        }

        quantidadeAlimentacoes++

        println()
        println("$nome comeu.")
        println("Comida. Finalmente.")
        println("Você descobriu que animais precisam ser alimentados.")
        println()
    }

    // ---------------- BRINCAR ----------------

    fun brincar() {

        felicidade += 15
        cansaco += 10

        quantidadeBrincadeiras++

        if (felicidade > 100) {
            felicidade = 100
        }

        if (cansaco > 100) {
            cansaco = 100
        }

        println()
        println("$nome decidiu brincar.")
        println("Pelo menos você ainda é útil para alguma coisa.")
        println()
    }

    // ---------------- DESCANSAR ----------------

    fun descansar() {

        cansaco -= 30

        quantidadeDescansos++

        if (cansaco < 0) {
            cansaco = 0
        }

        println()
        println("$nome foi descansar.")
        println("Ele merece.")
        println("Provavelmente mais do que você.")
        println()
    }

    // ---------------- PASSAGEM DO TEMPO ----------------

    fun passarTempo() {

        fome += 3
        felicidade -= 3
        cansaco += 10
        idade++

        if (fome > 100) {
            fome = 100
        }

        if (felicidade < 0) {
            felicidade = 0
        }

        if (cansaco > 100) {
            cansaco = 100
        }

        println("O tempo passou.")
        println("Porque aparentemente o mundo não gira em torno do seu pet.")
        println()
    }

    // ---------------- STATUS ----------------

    fun verificarStatus() {

        println()
        println("========== STATUS ==========")
        println("Nome: $nome")
        println("Idade: $idade anos")
        println("Fome: $fome/100")
        println("Felicidade: $felicidade/100")
        println("Cansaço: $cansaco/100")
        println("============================")

        // Comentários diferentes dependendo da situação

        if (fome >= 80) {
            println("$nome está com muita fome.")
            println("Você sabe que existem outras coisas no mundo além de esquecer a comida, certo?")
        }

        if (cansaco >= 80) {
            println("$nome está exausto.")
            println("Ele está cansado. Você também estaria se tivesse que lidar com você.")
        }

        if (felicidade <= 20) {
            println("$nome não parece muito feliz.")
            println("Ele está olhando para o vazio.")
        }

        if (fome < 30 && felicidade >= 80 && cansaco < 30) {
            println("$nome está muito bem.")
            println("Estranhamente, você está fazendo um bom trabalho.")
        }

        println()
    }

    // ---------------- DERROTA ----------------

    fun perdeu(): Boolean {

        return fome >= 100 ||
                cansaco >= 100 ||
                felicidade <= 0
    }

    // ---------------- VITÓRIA ----------------

    fun venceu(): Boolean {

        return idade >= 50
    }

    // ---------------- FINAL DO JOGO ----------------

    fun finalDoJogo() {

        println()
        println("================================")
        println("          FINAL DO JOGO")
        println("================================")

        // Finais de derrota

        if (fome >= 100) {

            println("$nome chegou ao fim.")
            println()
            println("Você esqueceu de alimentar o animal.")
            println("Era literalmente uma das três necessidades principais.")
            println("Parabéns.")
        }

        else if (cansaco >= 100) {

            println("$nome não aguentou mais.")
            println()
            println("Você tratou o pet como se ele tivesse energia infinita.")
            println("Spoiler: não tinha.")
        }

        else if (felicidade <= 0) {

            println("$nome perdeu toda a felicidade.")
            println()
            println("Parabéns.")
            println("Você conseguiu transformar um animal virtual em uma crise existencial.")
        }

        // ---------------- FINAIS SECRETOS ----------------

        else if (
            idade >= 50 &&
            felicidade >= 90 &&
            fome <= 20 &&
            cansaco <= 20
        ) {

            println("FINAL SECRETO: O PET MAIS MIMADO")
            println()
            println("$nome chegou aos 50 anos.")
            println("Está alimentado, descansado e extremamente feliz.")
            println()
            println("Basicamente, ele viveu melhor que a maioria das pessoas.")
        }

        else if (
            idade >= 50 &&
            fome >= 80
        ) {

            println("FINAL SECRETO: SOBREVIVENTE")
            println()
            println("$nome chegou aos 50 anos.")
            println("Sobreviveu.")
            println()
            println("Mas aparentemente nunca deixou de estar com fome.")
            println("Talvez ele só estivesse esperando a próxima refeição.")
        }

        else if (
            idade >= 50 &&
            quantidadeBrincadeiras >= 15
        ) {

            println("FINAL SECRETO: ATLETA")
            println()
            println("$nome chegou aos 50 anos.")
            println("Passou a vida inteira brincando.")
            println()
            println("O veterinário chamou de atividade física.")
            println("Você chamou de 'dar trabalho'.")
        }

        else if (
            idade >= 50 &&
            quantidadeDescansos >= 15
        ) {

            println("FINAL SECRETO: PROFISSIONAL DO SONO")
            println()
            println("$nome chegou aos 50 anos.")
            println("Passou boa parte da vida descansando.")
            println()
            println("Talvez ele tenha descoberto o verdadeiro sentido da vida.")
            println("Dormir.")
        }

        else if (
            idade >= 50 &&
            fome >= 70 &&
            cansaco >= 70 &&
            felicidade <= 30
        ) {

            println("FINAL SECRETO: VOCÊ NÃO APRENDEU NADA")
            println()
            println("$nome chegou aos 50 anos.")
            println("Mas terminou com fome, cansado e infeliz.")
            println()
            println("Tecnicamente você venceu.")
            println("Moralmente... melhor não conversarmos sobre isso.")
        }

        // ---------------- FINAIS NORMAIS ----------------

        else if (
            idade >= 50 &&
            felicidade >= 80
        ) {

            println("FINAL: UMA VIDA FELIZ")
            println()
            println("$nome chegou aos 50 anos.")
            println("E ainda está feliz.")
            println()
            println("Contra todas as expectativas, você cuidou bem dele.")
        }

        else if (
            idade >= 50 &&
            cansaco >= 70
        ) {

            println("FINAL: APOSENTADORIA")
            println()
            println("$nome chegou aos 50 anos.")
            println("Está velho e cansado.")
            println()
            println("Ele provavelmente só quer uma cama confortável.")
            println("E que você pare de incomodá-lo.")
        }

        else if (idade >= 50) {

            println("FINAL: UMA VIDA COMPLETA")
            println()
            println("$nome chegou aos 50 anos.")
            println("Uma vida inteira passou.")
            println()
            println("Não foi perfeita.")
            println("Mas pelo menos você tentou.")
        }

        println()
        println("================================")
    }
}


// ==================================================
//                     PROGRAMA
// ==================================================

fun main() {

    print("Digite o nome do seu pet: ")
    val nome = readln()

    val pet = Pet(nome)

    println()
    println("$nome foi adotado.")
    println("Boa sorte.")
    println("Você vai precisar.")
    println()

    while (!pet.perdeu() && !pet.venceu()) {

        println("========== MENU ==========")
        println("1 - Alimentar")
        println("2 - Brincar")
        println("3 - Descansar")
        println("4 - Verificar status")
        println("5 - Sair")
        println("==========================")
        print("Escolha uma opção: ")

        val opcao = readln().toInt()

        when (opcao) {

            1 -> {

                pet.alimentar()
                pet.passarTempo()
            }

            2 -> {

                pet.brincar()
                pet.passarTempo()
            }

            3 -> {

                pet.descansar()
                pet.passarTempo()
            }

            4 -> {

                pet.verificarStatus()
            }

            5 -> {

                println()
                println("$nome ficou olhando para você.")
                println("Ele provavelmente esperava mais de você.")
                println()
                println("Jogo encerrado.")

                return
            }

            else -> {

                println()
                println("Opção inválida.")
                println("Nem o $nome conseguiu entender o que você tentou fazer.")
                println()
            }
        }
    }


    pet.finalDoJogo()
}