/**
 * スコープ関数
 * */


class Person(val name:String,var age:Int){
    fun selfInfo(){
        println("I'm ${name},${age} years old.")
    }
    fun aged(){
        age++
    }
}

fun main(args: Array<String>){
//     val person = Person("Jhon",20)
//     person.selfInfo()
//     person.aged()
//     person.selfInfo()
/**
 * with関数:同じオブジェクトに対して繰り返し処理をするときに使う
 * */
//     thisは省略可能
	   with(Person("Jhon",20)){
           selfInfo()
           aged()
           selfInfo()
       }
       
       /**
        * apply演算子:対象オブジェクトを戻りとして返すので、メソッドチェーンが可能
        * */
        Person("Jhon",20).apply{
            age = 30
        }.selfInfo()
        
        /**
         * let演算子:安全呼び出し演算子?.とともに使うことで、null許容型を簡潔に扱うことができる
         * ?.とletを一緒に使うとstrがnullの時はnullを返し、null出ないときはletの結果を返す。
         * letの戻り値はラムダ式の最後の値になる
         * 対象オブジェクトをitで参照できる
         * if(hoge != null)が使いたいときに有効
         * */
         val str:String? = "james"
    	 println(str?.let{it.capitalize()})
         
         /**
          * run関数:letとwithの機能を持つ
          * */
          val sample:String? = "mike"
    	println(str?.run{capitalize()})
}

