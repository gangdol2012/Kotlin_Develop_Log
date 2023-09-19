import kotlin.collections.*
import java.io.*
import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.StandardCopyOption

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

fun write(intext: String,filetext: String){
    File(intext).printWriter().use{it.println(filetext)}
}

fun move(src: File, dest: File) {
    Files.move(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING)
}
