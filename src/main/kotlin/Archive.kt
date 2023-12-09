
import Utils.enterParameter

class Archive(override var name: String) : Reestr<Notice>,Element {
   override var items= mutableListOf<Notice>()
   override fun addItem() {
      val name=enterParameter("наименование")
      val text=enterParameter("текст")
      items.add(Notice(name, text))
   }
}