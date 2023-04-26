package com.example.pdfreader

class UserModel {
    lateinit var title: String
    var imgid = 0


    constructor(title: String, imgid: Int) {
        this.title = title
        this.imgid = imgid

    }
    constructor()
}