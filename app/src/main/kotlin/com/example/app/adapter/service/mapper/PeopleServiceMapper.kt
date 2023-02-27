package com.example.app.adapter.service.mapper

import com.example.app.adapter.mapper.response.PeopleMapperResponse
import com.example.app.adapter.mapper.response.PeopleResponseData
import com.example.app.domain.model.People
import com.example.app.domain.model.PeopleData
import org.springframework.web.bind.annotation.ControllerAdvice

@ControllerAdvice
object PeopleServiceMapper {
    fun findData(people: PeopleData): PeopleMapperResponse {
        return PeopleMapperResponse(
            data = PeopleResponseData(
                name = people.name,
                lastname = people.lastname,
                age = people.age
            )
        )
    }

    fun toPeopleResponseData(people: People): PeopleData {
        return PeopleData(
            name = people.name,
            lastname = people.lastname,
            age = "1"
        )
    }
}