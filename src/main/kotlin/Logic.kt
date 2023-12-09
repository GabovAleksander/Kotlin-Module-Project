import java.util.Scanner

class Logic{
    fun <T,S> menu(m:T) where T: Reestr<S>,S:Element  {
        while (true){

            if(m is Archive) {
                println("Список заметок в архиве \"${m.name}\":")
                println("0. Создать заметку")
            } else {
                println("Список архивов:")
                println("0. Создать Архив")
            }
            if(m.items!=null) {
                for (cnt in 0..m.items.size - 1) {
                    println((cnt + 1).toString() + ". " + m.items[cnt].name)
                }
            }
            println((m.items.size+1).toString()+". "+"Выход")
            val str= Scanner(System.`in`).nextLine();
            if(str.toIntOrNull()!=null) {
                when (str.toInt()) {
                    (m.items.size + 1) -> break
                    0 -> {
                        m.addItem();
                    }
                    in 1..m.items.size -> {
                        if(m.items[str.toInt()-1] is Notice) {
                            (m.items[str.toInt()-1] as Notice).showNotice()
                        }else{
                            val logic=Logic()
                            logic.menu(m.items[str.toInt()-1] as Reestr<S>)
                        }
                    }
                    else ->{
                        println("Введите корректное значение")
                    }
                }
            }
            else
            {
                println("Введите номер пункта")
            }
        }
    }
}