import java.io.File
import java.io.InputStream

fun main() {
    val inputFile : File = File("src/Day11_Input")
    val inputStream : InputStream = inputFile.inputStream()
    val fileData = mutableListOf<String>()
    inputStream.bufferedReader().forEachLine {
        fileData.add(it)
    }
   val stringData = fileData[0]
    val workingList = mutableListOf<String>()
    val newList = stringData.split(" ").map { it.trim() }
    for( i in newList.indices){
        workingList.add(newList[i])
    }

    ///val newList : MutableList<String> = fileData[0].split(" ").map { it.trim()}.toString()

}
fun blinkCheck(myList: MutableList<String>): String{
    val count = 0;
    val stringData = myList[0]
    val workingList = mutableListOf<Int>()
    val newList = stringData.split(" ").map { it.trim() }
    for( i in newList.indices){
        workingList.add(newList[i].toInt())
    }
    while(count != 6){
        for(i in workingList.indices){
            if(workingList[i].toString().length % 2 == 0){
                workingList[i] = workingList[i] % 10
                workingList.
            }

        }
    }
}