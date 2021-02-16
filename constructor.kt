fun main(args: Array<String>) {
    println("Hello, world!")
    val person = Person("Jhon",20)
}

//クラスpersonの定義 val name: String, var age: Intがコンストラクター(プライマリーコンストラクター)
class Person(val name: String,var age: Int){
    //クラスからインスタンスを生成した時点で実行したい処理
    init{
        println("I,m ${name}.")
    }
}
