package com.hllbr.kotlinalertdialog

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        AlertMessages == 2 farklı mesaj türü bulunmakta birincisi ToastMessage ikincisi AlertDialog ile oluşturulan mesajlar

         */
        Toast.makeText(applicationContext,"Welcome!",Toast.LENGTH_LONG).show()
        button.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
                TODO("Not yet implemented")
                Toast.makeText(this@MainActivity,"Test2",Toast.LENGTH_LONG).show()//AlertShow OnClick yapısının devre dışı bırakılması gerekiyor.

            }

        })
    }
    fun AlertShow(view : View){
    val alert =AlertDialog.Builder(this)//Burada istenilen context activitenin kendisi
    alert.setTitle("ALERT SHOWED!")
        alert.setMessage("Are You Sure ?")
        alert.setPositiveButton("DONE"){dialog,which->
            //OnClick Listener
            Toast.makeText(applicationContext,"Saved",Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No"){dialog,which->
            //OnClick Listener
            Toast.makeText(applicationContext,"Not Saved",Toast.LENGTH_LONG).show()
        }
        alert.show()
    }
    /*
    Context = İçerisinde bulunduğumuz durum anlamını taşıyor.Appin içinde bulunduğu güncel durumu göstermek için kullanılan bir yapıdır.
    her objenin/Activitenin birbirleriyle haberleşebilmesi için hangi yapı ne durumda iblinebilmesi için oluşturulmuş bir yapı oalrak ifade eebiliriz.
    Sadece tek bir Contextten oluşmayan 2 farklı Contextten bashediyoruz genelde

    1)Activity Context = Eğer activitenin contexti ile ilgili bir işlemle karşılaşmışsak this anahtar kelimesi yardımıyla bu yapıta erişerek işlemlerimizi gerçekleştiriyoruz

    2)App Context = eğer appin contextini almamız gerekn bir durumla karşılaşırsak bu yapıyı kullanıyoruz

    Bu durumlarla ilgili binlerce Senaryo bulunuyor.
    this anahtar kelimesi herzaman içinde bulunduğu yerin bir üstüne referans veriyor.
    MainActivity.this yapısını JAVA'da kullanabiliyorduk fakat burada buna izin verilmiyor
    Bunun yerine this@MainActivity şeklinde olursa Kotlin yapının kullanımına müsade ediyor


    ***AlertDialog içerisinde applicationContext kullanılması estetik değil ve tercih edilen bir durumda değildir Activite içerisinde kullanıldıkları için this ile ifade tanımlaması yapılır.
    

     */
}