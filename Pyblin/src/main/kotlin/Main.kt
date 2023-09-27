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


fun makeFile(intextSrc: String): File{
    File(intextSrc).printWriter().use{it.println("")}
    return File(intextSrc)
}

fun moveSub(src: File, dest: File) {
    Files.move(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING)
}

fun move(intextSrc: String,intextDest:String){
    moveSub(makeFile(intextSrc),makeFile(intextDest))
}

fun main(){
    makeFile("./hyeon.txt")
    move("./hyeon.txt","./src/main/kotlin/a.txt")
}