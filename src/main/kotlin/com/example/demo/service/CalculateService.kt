package com.example.demo.service

import com.example.demo.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CalculateService {
    @Autowired
    lateinit var userRepository: UserRepository

    fun calculateNumber(a:Int,b:Int): Int {
        return a+b
    }

    fun findUserById(id:Long) = userRepository.findById(id)

}