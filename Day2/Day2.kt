package Day2
import java.io.File
import java.io.InputStream

fun main(){
    val inputFile = File("src/input")
    val inputFileStream : InputStream = inputFile.inputStream()
    val fileData = mutableListOf<String>()
    inputFileStream.bufferedReader().forEachLine {
        fileData.add(it)
    }
    val splitList = fileData.map { it.split( " ")}
    println(fileData)
    println(splitList)

}

fun doFloorMath(myList : MutableList<String>) {
    val splitList: List<List<String>> = myList.map { it.split( " ")}
    var count = 0;
    for(i in splitList.indices){
        for(j in splitList[i].indices){
            if(splitList[i][j].toInt() < splitList[i][j+1].toInt()){

            }
        }
    }
}

