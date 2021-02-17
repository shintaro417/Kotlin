fun main(args: Array<String>) {
    
    //
    val person = Person("Jhon",20)
    println(person.name)
    println(person.age)
    println(person.isStudent)
    
    //varで定義したプロパティは、値を変更することができる。
    person.age = 18
    person.isStudent = true
    println(person.age)
    println(person.isStudent)
}

//プロパティ：Javaのフィールドにゲッターとセッターの機能を追加したようなもの
class Person(val name: String,var age: Int){
    var isStudent: Boolean = false
}
