package com.example.app.adapter.mapper

import com.example.app.adapter.mapper.request.PeopleMapperRequest
import com.example.app.adapter.mapper.response.PeopleMapperResponse
import com.example.app.adapter.mapper.response.PeopleResponseData
import com.example.app.domain.model.People
import com.example.app.domain.model.PeopleData
import org.springframework.stereotype.Component

@Component
class PeopleMapper {

    fun toPeople(peopleRequest: PeopleMapperRequest): People {
        return People(
            name = peopleRequest.data.name,
            lastname = peopleRequest.data.lastname
        )
    }

    fun toPeopleResponse(response: PeopleData): PeopleMapperResponse {
        return PeopleMapperResponse(
            data = PeopleResponseData(
                name = response.name,
                lastname = response.lastname,
                age = response.age
            )
        )
    }


}