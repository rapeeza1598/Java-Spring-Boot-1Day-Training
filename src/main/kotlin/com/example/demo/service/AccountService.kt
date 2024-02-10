package com.example.demo.service

import com.example.demo.repository.UserRepository
import com.example.demo.entity.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AccountService {
    @Autowired
    lateinit var userRepository: UserRepository
    fun createAccount(firstName:String,lastName:String,gender:String,age:Int,tel:String,amount:Double): Any {
        if (age < 10){
            return "You are too young to create an account"
        }
        if (amount < 1000){
            return "You need at least 1000 to create an account"
        }
        val user = userRepository.save(com.example.demo.entity.User(
            firstName = firstName,
            lastName = lastName,
            gender = gender,
            age = age,
            tel = tel,
            amount = amount
        ))
        return user
    }
    fun findAccountByName(firstName: String): User{
        return userRepository.findByFirstName(firstName)[0]
    }
}