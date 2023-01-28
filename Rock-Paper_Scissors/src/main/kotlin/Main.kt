fun main(args: Array<String>) {
    var check = true
    var start: String
    var rand = ""
        while (check) {
            println("Если хотите продолжить игру - нажмите 1. Иначе игра заканчивается")
            var choiceVal = readln()
            if (choiceVal == "1") {
            println("Выберите: Камень, Ножницы или Бумага")
            choiceVal = readln()
            println("Ваш выбор: " + choiceVal)
            val options = arrayOf("Камень", "Ножницы", "Бумага")
            if (choiceVal in options) {
                rand = options.random()
            }
            println("Выбор программы: " + rand)
            if (rand == "Ножницы" && choiceVal == "Бумага")
                println("Программа выиграла!")
            if (rand == "Камень" && choiceVal == "Ножницы")
                println("Программа выиграла!")
            if (rand == "Бумага" && choiceVal == "Камень")
                println("Программа выиграла!")

            if (rand == "Бумага" && choiceVal == "Ножницы")
                println("Пользователь выиграл!")
            if (rand == "Ножницы" && choiceVal == "Камень")
                println("Пользователь выиграл!")
            if (rand == "Камень" && choiceVal == "Бумага")
                println("Пользователь выиграл!")

            if (rand == "Камень" && choiceVal == "Камень")
                println("Ничья!")
            if (rand == "Бумага" && choiceVal == "Бумага")
                println("Ничья!")
            if (rand == "Ножницы" && choiceVal == "Ножницы")
                println("Ничья!")
        }
    }
}
