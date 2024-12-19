package Day3

import java.io.File
import java.io.InputStream

fun main(){
    val inputFile = File("src/Day3_Input")
    val inputFileStream : InputStream = inputFile.inputStream()
    val fileData = mutableListOf<String>()
    inputFileStream.bufferedReader().forEachLine {
        fileData.add(it)
    }
    //println(mulFinder(fileData))
}
/*
fun mulFinder(myList : MutableList<String>): MutableList<String> {
    val mulList = mutableListOf<String>()
    for(i in myList.indices){
        val mulPart = myList[i].substring(0,4)
        for(j)
           if(mulPart.equals("mul(")){
           mulList.add(mulPart)
        }
    }
    return mulList
}

 */