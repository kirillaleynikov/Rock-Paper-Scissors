fun main(args: Array<String>) {
    var check = true
    var start: String
    var rand =""
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
                val result = if(options.indexOf(choiceVal)==options.indexOf(rand)-1||options.indexOf(choiceVal)-options.indexOf(rand)==-2) 0
                else if (choiceVal == rand) 1 else 2
            if (result ==2)
                println("Программа выиграла!")
            if (result ==0)
                println("Пользователь выиграл!")
            if (result ==1)
                println("Ничья!")
        }
    }
}
