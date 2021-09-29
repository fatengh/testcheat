package com.example.testcheat

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var btn: Button
    private lateinit var edname: EditText
    private lateinit var ednam2: EditText
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val str = "hello world"
        Log.d("MainActivity","${str.subSequence(2,4)}")// stop befor 4
        Log.d("MainActivity","${str.indexOf("h")}")// stop befor 4
        val num = 10
        Log.d("MainActivity","Enter a number: ")
        try { // Try and cach
            val userNum = readLine()!!.toInt()
            val sum = num + userNum
            Log.d("MainActivity","$sum")
        } catch (e: Exception) {
            Log.d("MainActivity","Please enter numbers only")
        }
            // for
        for(number in 1..5){
            Log.d("MainActivity","$number")
        }
        for(char in str){

        }
        // while
        while (true){
            // user input
            // if
            break
            //else
        }

        // when

        val grade = 50 // supoose user input with to string
        when {
            grade < 60 ->  Log.d("MainActivity","F")
            grade < 70 ->  Log.d("MainActivity","D")
            grade < 80 ->  Log.d("MainActivity","C")
            grade < 90 ->  Log.d("MainActivity","B")
            else ->  Log.d("MainActivity","A")
        }

        val randomNumber = Random.nextInt(11)
        val petsl = listOf("Fluffy", "Snoopy", "Spud")
        val petsa = arrayOf("Fluffy", "Snoopy", "Spud")
        val myArray = arrayOf<Any>("Car", 15, false, 19, "Bike")
        var num2 = myArray.size

        val shoppingList = ArrayList<Int>()
        shoppingList.add(2)
        shoppingList[0] = 5
        shoppingList.remove(2)
        shoppingList.sort()
        for(item in shoppingList){
            Log.d("MainActivity","$item")
        }
        var final = shoppingList.sum() / shoppingList.size// avrage


        //2D aaraylist
        var credentials = arrayListOf<ArrayList<String>>()
        credentials.add(arrayListOf("user1", "12345"))
        credentials.add(arrayListOf("user2", "password"))
        credentials.add(arrayListOf("Bob", "00000"))
        credentials.add(arrayListOf("Tim", "55555"))
        Log.d("MainActivity","${credentials[2][0]}")  // --> Bob
        Log.d("MainActivity","${credentials[0][1]}")  // --> 12345


        // map
        val seats = mapOf(1 to "Sara", 2 to "Jim", 3 to "Jane")
        Log.d("MainActivity","$seats[2]")  // --> Jim
        Log.d("MainActivity","$seats[0]")  // --> null
        seats.getOrDefault(0, "My Default Name") // --> My Default Name
        seats.containsKey(1)  // --> true
        seats.containsValue("Bob")  // --> false


      // multi map
        val numbersMap = mutableMapOf("one" to 1, "two" to 2)
        numbersMap.put("three", 3)
        numbersMap.putAll(setOf("four" to 4, "five" to 5))
        numbersMap["three"] = 3     // calls numbersMap.put("three", 3)
        numbersMap += mapOf("four" to 4, "five" to 5)
        numbersMap.remove("one")
        numbersMap.remove("three", 4)            //doesn't remove anything


          // calling class
        Person("Tom").introduction()  // --> Hi, my name is Tom
        FamilyCar().doors()  // --> This car has 4 doors
        println("The family car is ${FamilyCar().color}.")  // --> The family car is Blue.
        val mySportsCar = SportsCar()
        mySportsCar.doors()  // --> This car has 2 doors
        mySportsCar.color = "Red"
        println("The color of my sports car is ${mySportsCar.color}.")  // --> The color of my sports car is Red.

        // declear UI
        var btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {

        }
        //change color
        //tv.setTextColor(Color.parseColor("#000000"))


        Toast.makeText(
            applicationContext,
            "frist name $mySportsCar and lastname ",
            Toast.LENGTH_LONG
        ).show()


    }

    fun add(num1: Int, num2: Int): Int{
        return num1 + num2
    }
}

class Person(val name: String){
    fun introduction(){
        println("Hi, my name is $name")
    }}






abstract class Vehicle{
    var color = "Blue"
    abstract fun doors()
}
class FamilyCar: Vehicle(){
    override fun doors() {
        println("This car has 4 doors")
    }
}
class SportsCar: Vehicle(){
    override fun doors() {
        println("This car has 2 doors")
    }
}
