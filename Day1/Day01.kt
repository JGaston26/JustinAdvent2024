package Day01.Day1
import java.io.File
import java.io.InputStream

fun main(){
    val inputFile = File("C:\\Users\\BT_4N2_02\\IdeaProjects\\Advent\\src\\Day1\\Day01_Input");
    val inputFileStream: InputStream =  inputFile.inputStream();
    val fileData = mutableListOf<String>();
    val leftNums = mutableListOf<String>()
    val rightNums = mutableListOf<String>()
    inputFileStream.bufferedReader().forEachLine {
        fileData.add(it);
    }
    for (i in 0..fileData.size-1){
       leftNums.add(fileData[i].substringBefore(" "))
    }
    for (i in 0..fileData.size-1){
        rightNums.add(fileData[i].substringAfter("   "))
    }
    /*
    for( i in 0..fileData.size-1){
        leftNums[i].toInt()
        rightNums[i].toInt()
    }

     */
    leftNums.map { it.toInt()}
    rightNums.map { it.toInt()}

    println(leftNums[1]+5)
}
