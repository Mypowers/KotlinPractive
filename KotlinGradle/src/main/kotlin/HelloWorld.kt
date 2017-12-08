import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    println("hello world");
    println(SimpleDateFormat("yyyy-MM-dd").format(Date()));
    val x = (1 shl 2) and 0x000FF000;
    print(x);
    val  c: Char = 'a';
    println(c::class.java);
    val ch: String = "abc";
    println(ch::class.java);
}