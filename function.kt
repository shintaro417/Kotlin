/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
    hello("Mayumi")
    
    //ラムダ織式：無名関数を表現する方法の1つ
    //ラムダは変数に代入できる.
    //変数plusは関数型の変数として呼ばれる。引数と戻り値の肩が指定されている場合は、ラムダ式の中では型の指定を省略できる。
    var plus = {x: Int,y: Int -> x + y}
    println(plus(8,4))
    
    //Int型の引数を受け取り、Int型の戻り値を返す。引数が一つしかない場合は引数の指定を省略して、暗黙引数itを使うことができる.
    //
    var square:(Int) -> Int = {x -> x * x}
    
    fun multi(x: Int,l:(Int) -> Int) = l(x)
    
    println(multi(5,{it * it}))
    println(multi(5,{it * 2}))
    
}

//関数が有用な値を返さない場合は戻り値の肩をUnitに指定する(=void)
fun hello(name:String?): Unit{
    if(name != null)
    	println("Helo ${name}")
    else
    	println("Hi there!")
}
