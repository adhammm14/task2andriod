import java.util.*

fun main() {
   log_in()
}
fun log_in(){
    val scn = Scanner(System.`in`)
    print("Enter Size Of List: ")
    val size = scn.nextInt()
    scn.nextLine()
    var counter = 0

    val mylist = mutableListOf<String>()

    while (counter<size){
        print("Enter Element: ")
        mylist.add(scn.nextLine())
        counter++
    }

    val filterlist = mylist.filter {
        it.lowercase().contains("a")
        it.lowercase().contains("m")
    }

    for (item in filterlist){
        println(item.uppercase())
    }
}