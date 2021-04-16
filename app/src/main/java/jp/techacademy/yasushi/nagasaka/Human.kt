package jp.techacademy.yasushi.nagasaka

import  android.util.Log


open class Human: Animal, Thinkable {

    var hobby: String


    constructor(name: String, age: Int, hobby: String): super(name, age) {

        this.hobby = hobby
    }

    override fun say(){
        Log.d("test", "私の名前は" + this.name + "です。歳は" + this.age + "歳です。" )
    }

    override fun think() {
        Log.d("test", "「私は" + this.hobby + "について考える。」")
    }

}