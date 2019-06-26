fun main(args:Array<String>)
{
    print("Factorial !!!!!!!!!!! \n")
    val factResult=fact(5)
    print(factResult)

    val sumof=sumofnthNumber(100000)
    print("sumof "+sumof)
}

tailrec fun sumofnthNumber(a: Int,sum123:Long=0): Long {
    return if(a<=0)
        sum123
    else
        sumofnthNumber(a-1,a+sum123)


}

fun fact(a: Int): Long
{
    return if(a==1)
        a.toLong()

    else
    {
        a*fact(a-1)
        }

}
