
package Day11.Day11

import java.io.File
import java.io.InputStream

fun main() {
    val inputFile : File = File("src/Day11/Day11_Input")
    val inputStream : InputStream = inputFile.inputStream()
    val fileData = mutableListOf<String>()
    inputStream.bufferedReader().forEachLine {
        fileData.add(it)
    }
    doBlink(fileData,5)
    /*
   val stringData = fileData[0]
    val workingList = mutableListOf<String>()
    val newList = stringData.split(" ").map { it.trim() }
    for( i in newList.indices){
        workingList.add(newList[i])
    }
    print(workingList)
    if(workingList[1].length % 2 == 0) {
        workingList.add(2, workingList[1].substring(workingList[1].length / 2))
        workingList.add(2, workingList[1].substring(0, workingList[1].length / 2))
        workingList.removeAt(1)
    }
    print(workingList)

    ///val newList : MutableList<String> = fileData[0].split(" ").map { it.trim()}.toString()


     */
}
fun doBlink(stoneList: MutableList<String>, blinkCount: Int) {
    for(i in 0..blinkCount){
        blinkCheck(stoneList,i)

    }
}
fun blinkCheck(myList: MutableList<String>, count: Int){
    val stringData = myList[0]
    val workingList = mutableListOf<Int>()
    val newList = stringData.split(" ").map { it.trim() }
    for( i in newList.indices){
        workingList.add(newList[i].toInt())
    }
    val stringForm = workingList[count].toString()

    if (workingList[count] == 0) {
        workingList[count] = 1
        println(workingList)
    } else if (stringForm.length % 2 == 0) {
        workingList.add(count + 1, stringForm.substring(stringForm.length / 2).toInt())
        workingList.add(count + 1, stringForm.substring(0, stringForm.length / 2).toInt())
        workingList.removeAt(count)
        println(workingList)
    } else {
        workingList[count] = workingList[count] * 2024
        println(workingList)
    }
}
