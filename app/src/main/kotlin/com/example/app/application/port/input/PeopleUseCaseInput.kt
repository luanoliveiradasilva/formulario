package com.example.app.application.port.input

import com.example.app.domain.model.People
import com.example.app.domain.model.PeopleData

interface PeopleUseCaseInput {
    fun execute(people: People): PeopleData
}