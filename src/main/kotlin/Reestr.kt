interface Reestr<T> where T:Element{
    var items: MutableList<T>

    fun addItem()
}