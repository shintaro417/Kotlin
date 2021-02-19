/**
 * SAM変換
 * SAM(Single Abstract Method)いんたーふぇーすのことでメソッドを1つしか持たないインターフェース
 * Kotlinでは、SAM型のインターフェースを引数として要求するメソッドにラムダ式を渡すことができる。
 * */

//Kotlin
//ラムダ式の引数が　1つしかないときは省略して代用することができる。
morningBtn.setOnClickListener{
    greetingText.tex = getString(R.string.good_morning_text)
}

//Java
Button btnMorning = findViewById(R.id.morningBtn);
btnMorning.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View v){
        TextView txtGreeting = findViewById(R.id.greetingText);
        txtGreeting.setText(getString(R.string.good_morning_text));
    }
});

fun main() {
    println("Hello, world!!!")
}
