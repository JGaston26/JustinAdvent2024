package Day2
import java.io.File
import java.io.InputStream

fun main(){
    val inputFile = File("Day2/Day2_input")
    val inputFileStream : InputStream = inputFile.inputStream()
    val fileData = mutableListOf<String>()
     inputFileStream.bufferedReader().forEachLine {
         fileData.add(it)
     }
    println(fileData)
    val noSpaces = mutableListOf<String>()

}

fun doFloorMath(myList : MutableList<String>) : Boolean{
    var j =2
    for(j in myList.indices){
        j+=2
        val floorString =
    }
}


