package com.example.librarycatalog

import jakarta.persistence.*

@Entity
@Table(name = "book")
class Book (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var title: String,
    var author: String,
    var isbn: String,
    var IsAvailable: Boolean = true

)