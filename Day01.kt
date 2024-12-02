package Day01
import java.io.File
import java.io.InputStream

fun main(){
    val inputFile = File("C:\\Users\\BT_4N2_02\\IdeaProjects\\AdventDay01\\src\\Day01\\Day01_Input");
    val inputFileStream: InputStream =  inputFile.inputStream();
    val fileData = mutableListOf<String>();
    inputFileStream.bufferedReader().forEachLine {
        fileData.add(it);
    }

}
/*
Split list by 
 */