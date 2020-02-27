package com.berkkilic.kotlinnullsafety

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    var string: String? = "Hello!"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //print(string.length) -> derleyici hatası

        if (string !=null){
            println(string!!.length)

        }


        val a: List<Int?> = listOf(1,2,3,null)
        val b: List<Int> = a.filterNotNull() // Bazı durumlarda ? li olanı soru işaretsiz olana çevirmemiz gerekebilir bu yüzden filterNotNull ı kullandık.

        for (i in b){
            println(i)
        }


        //"Nothing here" değerini döndürür.
        //val value :String = data?.first() ?: "Nothing here"



        //dolu olan string null olan bir değişkene atılabilir. Ama null olan bir değişken nul olmayan yani dolan değişkene atılamaz.

        var c : String? = "Nullable String Value"

        val d : Int = if(c!=null) c.length else -1
        println(d)
        //daha kısası

        val e = c?.length ?: -1

        println(e)

        val myString : String? = "Hello World"
        println(myString?.length)


        val name: String? = null

        println("The length of name is ${name?.length}")


        // name in içindeki değer yalnız null değilse çalışır.
        name?.let{
            println("The length of name is ${name.length}")

        }

        // null gelirse -1 atıcak null değilse name.length değerini atacak.
        val len = name?.length ?: -1

        println(len)


    }
}
