package com.example.app.adapter.service

import com.example.app.adapter.mapper.PeopleMapper
import com.example.app.adapter.service.mapper.PeopleServiceMapper
import com.example.app.application.port.output.PeopleUseCaseOutput
import com.example.app.domain.model.People
import com.example.app.domain.model.PeopleData
import org.springframework.context.annotation.DependsOn

@DependsOn("people-service")
class PeopleServiceImpl(
    private val peopleMapper: PeopleMapper
): PeopleUseCaseOutput {

    override fun toPeopleResponse(people: People): PeopleData {
        val peopleResponseData = PeopleServiceMapper.toPeopleResponseData(people)

        val response = PeopleServiceMapper.findData(peopleResponseData)

        return peopleResponseData
    }
}