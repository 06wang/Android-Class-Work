package com.example.middleexam

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable

@Immutable
data class Teacher(
    var tid: Int,
    var tname:String,
    var tage:Int,
    var temail: String,
    var tclass: String
)
@Immutable
data class Student (
    var sid: Int,
    var sname:String,
    var sage:Int,
    var semail: String,
    var sclass: String

)
val teachers = listOf(
    Teacher(1,"王英博",27,"2069488959@qq.com","计算机225班"),
    Teacher(2,"张奕然",27,"2069488959@qq.com","计算机225班"),
    Teacher(3,"张函瑞",27,"12069488959@qq.com","计算机225班")
)
val students = listOf(
    Student(1,"张奕然",21,"123456@qq.com","计算机225班"),
    Student(2,"张奕然",21,"123456@qq.com","计算机225班"),
    Student(3,"张奕然",21,"123456@qq.com","计算机225班"),
    Student(4,"张奕然",21,"123456@qq.com","计算机225班"),
    Student(5,"张奕然",21,"123456@qq.com","计算机225班")
)
