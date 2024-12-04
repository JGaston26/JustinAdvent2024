package Day01.Day1
import java.io.File
import java.io.InputStream

fun main(){
    val inputFile = File("Day1/Day01_Input");
    val inputFileStream: InputStream =  inputFile.inputStream();
    val fileData = mutableListOf<String>();
    val leftNums = mutableListOf<String>()
    val leftNumsInt = mutableListOf<Int>()
    val rightNumsInt = mutableListOf<Int>()
    val rightNums = mutableListOf<String>()

    inputFileStream.bufferedReader().forEachLine {
        fileData.add(it);
    }
    for (i in 0..<fileData.size){
        leftNums.add(fileData[i].substringBefore(" "))
    }
    for (i in 0..<fileData.size){
        rightNums.add(fileData[i].substringAfter("   "))
    }
    for( i in 0..<fileData.size){
        leftNumsInt.add(leftNums[i].toInt())
        rightNumsInt.add(rightNums[i].toInt())

    }
    val sortedLeft = leftNumsInt.sorted()
    val sortedRight = rightNumsInt.sorted()
    var finalCount = 0;
    /* Solution to Part One
    for(i in sortedLeft.indices){
        finalCount += abs(sortedLeft[i] - sortedRight[i])
    }
    println(sortedRight)
    println(sortedLeft)
    println(finalCount)

     */

    //Part 2 Solution
    for(i in sortedLeft.indices){
        finalCount += frequencyCounter(sortedLeft[i],sortedRight) * sortedLeft[i]
    }
    println(finalCount)
}
fun frequencyCounter(num: Int, arr: List<Int>) : Int{
    var count = 0;
    for(i in arr.indices){
        if (arr[i] == num) {
            count++
        }
    }
    return count
}
