fun main(args: Array<String>)
{
    var a:String ="3"
   // var b=a.toInt()

    print("enter a number 1st  ")
    val b= Integer.valueOf(readLine())
    print("enter a number 2nd number   ")
    val c= Integer.valueOf(readLine())

    val rsult=if(c>b) {
        "$c is grater than $b"
    }
    else {
       "$b is grater than $c"
    }

    print(rsult)
   // println("Hello World!a="+ a+"   b="+b )


}
