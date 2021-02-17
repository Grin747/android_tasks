package com.example.opossumtask.logic

class Opossum(_age : Int, _height : Int, _gender : String) {
    private var age : Int = _age;
    private var height : Int = _height;
    private var gender : String = _gender;

    val info = "$gender,\n $age y.o. / $height cm";
}