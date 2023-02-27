package com.example.app.application.port.output

import com.example.app.domain.model.People
import com.example.app.domain.model.PeopleData

interface PeopleUseCaseOutput {
    fun toPeopleResponse(people: People): PeopleData
}
