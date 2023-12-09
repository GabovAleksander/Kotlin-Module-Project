import java.util.Scanner

object Utils {
    fun enterParameter(parameterName:String):String{
        var parameterValue=""
        while(parameterValue.length==0) {
            println("Введите $parameterName")
            val str = Scanner(System.`in`).nextLine()
            if (str.length > 0) {
                parameterValue = str
            } else {
                println("Параметр \"$parameterName\" не может быть пустым!")
            }
        }
        return parameterValue
    }
}