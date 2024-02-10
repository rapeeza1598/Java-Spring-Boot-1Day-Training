package com.example.demo.entity

import jakarta.persistence.*
import kotlin.random.Random

@Entity
@Table(name = "Account")
data class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,

    @Column(name="accountNo")
    var accountno: Long? = null,

    @Column(name="firstName")
    var firstName: String? = null,

    @Column(name="lastName")
    var lastName: String? = null,

    @Column(name="gender")
    var gender: String? = null,

    @Column(name="age")
    var age: Int? = null,

    @Column(name="tel")
    var tel: String? = null,

    @Column(name="amount")
    var amount: Double? = null
) {
    init {
        // Initialize accountno using random number generation
        accountno = Random.nextLong(1000000000, 9999999999)
    }
}