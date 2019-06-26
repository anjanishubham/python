import java.util.*

fun main(args : Array<String>)
{

   /* print("enter your number ??:=")
    val input=Scanner(System.`in`)
    var num1=input.nextInt();
    var num2=input.nextFloat();
    print("num1=" +num1+ "num2 :"+num2)*/

    var numArray= arrayOf(10,20,30,40,50,60,70)
    for(item in numArray)
    {
        println(item)
    }
    // retrive through index
    for(item in numArray.indices)
    {
        println("numArray[$item]=="+ numArray[item])
    }


    println("\n range in kotlin Array !!!!!!!!!!!!!\n")
    for(i in 1..10)
        print(i)

    println("\n test\n")
    for(i in 1..50 step 5)
        print(i)

    println("\n test\n")
    for(i in 40 downTo 0 step 4)
        print(i)


    println("\n test\n")
    for(i in 10 downTo  0)
        print(i)


}