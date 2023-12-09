class Notice(override var name: String, var text: String):Element {
fun showNotice(){
    println("------------------------------------------------------------------------")
    println("Заметка")
    println("Наименование: ${this.name}")
    println("Текст: ${this.text}")
    println("------------------------------------------------------------------------")
}

}