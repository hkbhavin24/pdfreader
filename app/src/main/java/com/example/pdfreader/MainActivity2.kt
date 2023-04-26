package com.example.pdfreader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.pdfreader.R.drawable.img1
import com.example.pdfreader.R.drawable.img10
import com.example.pdfreader.R.drawable.img2
import com.example.pdfreader.R.drawable.img3
import com.example.pdfreader.R.drawable.img4
import com.example.pdfreader.R.drawable.img5
import com.example.pdfreader.R.drawable.img6
import com.example.pdfreader.R.drawable.img7
import com.example.pdfreader.R.drawable.img8
import com.example.pdfreader.R.drawable.img9
import com.example.pdfreader.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    var imglist = arrayOf(
        img1,
        img2,
        img3,
        img4,
        img5,
        img6,
        img7,
        img8,
        img9,
        img10
    )
    var titlelist = arrayOf(
        "pdf 1",
        "pdf 2",
        "pdf 3",
        "pdf 4",
        "pdf 5",
        "pdf 6",
        "pdf 7",
        "pdf 8",
        "pdf 9",
        "pdf 10"
    )
    var pdflist = arrayOf(
        "pdf1.pdf",
        "pdf2.pdf",
        "pdf3.pdf",
        "pdf4.pdf",
        "pdf5.pdf",
        "pdf6.pdf",
        "pdf7.pdf",
        "pdf8.pdf",
        "pdf9.pdf",
        "pdf10.pdf",
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rcvlist.layoutManager = GridLayoutManager(this, 2)
        binding.rcvlist.adapter = UserDataAdapter(imglist, titlelist,pdflist)


    }
}