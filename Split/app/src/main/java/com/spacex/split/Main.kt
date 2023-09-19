import kotlin.collections.*

fun input(intext:String): String {
    print(intext)
    var retur=readLine().toString()
    return retur
}

fun split(intext:String): MutableList<String>{
    var list = mutableListOf<String>()
    var stringlit = ""
    var InfinityAddVac=0
    for (i: Int in 0..intext.length-1) {
        if (intext[i].toChar() == ' ') {
            if (InfinityAddVac==0){
                list.add(stringlit)
                stringlit = ""
                InfinityAddVac = 1
            }
        }else{
            stringlit+=intext[i]
            InfinityAddVac=0
        }
    }
    list.add(stringlit)
    stringlit=""
    return list
}

fun main(){
    println("")
    println("Fuck you, Google addsense. Google addsense make to watch contents for adult to 11 years old student!!!")
    println("")
    println(split(input("input text : ")))
}