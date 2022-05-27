package com.example.city

class Country (var nameCountry: String, var citys: City, var district: District, var region: Region,) {
    fun area_info(){
        println("Площадь - ${region.area}")
    }
    fun capital_info() {
        if (citys.capital == true) {
            println("Столица  $nameCountry - ${citys.nameCity}")
        }
    }

    fun region_info(){
        println("Область - ${region.region}")
    }

    fun district_info(){
        println("Районные центры - ${district.district}")
    }

}