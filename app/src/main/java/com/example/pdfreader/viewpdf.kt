package com.example.pdfreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pdfreader.databinding.ActivityViewpdfBinding
import com.rajat.pdfviewer.PdfViewerActivity

class viewpdf : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityViewpdfBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var name = intent.getStringExtra("name")

        binding.pdfViews.fromAsset(name!!).show()

    }
}