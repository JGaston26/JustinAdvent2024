package Day11

import java.io.File
import java.io.InputStream

fun main() {
    val inputFile : File = File("Day11/Day11_Input")
    val inputStream : InputStream = inputFile.inputStream()
    val fileData = mutableListOf<String>()
    inputStream.bufferedReader().forEachLine {
        fileData.add(it)
    }
    for(i in 0..5){
        blinkCheck(fileData)
    }
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
fun blinkCheck(myList: MutableList<String>) : MutableList<Int>{
    var count = 0;
    val stringData = myList[0]
    val workingList = mutableListOf<Int>()
    val newList = stringData.split(" ").map { it.trim() }
    for( i in newList.indices){
        workingList.add(newList[i].toInt())
    }
    val temp = mutableListOf<Int>()
            val stringForm = workingList[count].toString()

            if (workingList[count] == 0) {
                workingList[count] = 1
                println(workingList)
                count++
            } else if (stringForm.length % 2 == 0) {
                workingList.add(count + 1, stringForm.substring(stringForm.length / 2).toInt())
                workingList.add(count + 1, stringForm.substring(0, stringForm.length / 2).toInt())
                workingList.removeAt(count)
                println(workingList)
                count += 2;
            } else {
                workingList[count] = workingList[count] * 2024
                println(workingList)
                count++
            }
            println(count)
        println(temp)
    return temp
}