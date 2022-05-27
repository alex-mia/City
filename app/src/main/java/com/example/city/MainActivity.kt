package com.example.city

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var newCity = City("Minsk", capital = true)
        var newDistrict = District("Minsk", capital = true, "Minski")
        var newRegion = Region("Minsk", capital = true, district = "Minski", "Minskay", 1676)
        val  newCountry = Country("Belarus", newCity, newDistrict, newRegion)
        println(newCountry.capital_info())
        println(newCountry.area_info())
        println(newCountry.district_info())
        println(newCountry.region_info())
    }
}
