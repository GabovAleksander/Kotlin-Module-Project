import Utils.enterParameter

class Storage(override var name: String):Reestr<Archive>,Element {
    override var items= mutableListOf<Archive>()
    override fun addItem() {
        val name=enterParameter("наименование")
        items.add(Archive(name))
    }

}