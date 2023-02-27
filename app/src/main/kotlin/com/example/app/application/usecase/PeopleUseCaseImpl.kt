package com.example.app.application.usecase

import com.example.app.application.port.input.PeopleUseCaseInput
import com.example.app.application.port.output.PeopleUseCaseOutput
import com.example.app.domain.model.People
import com.example.app.domain.model.PeopleData
import org.springframework.stereotype.Service

@Service
class PeopleUseCaseImpl(
    private val peopleUseCaseOutput: PeopleUseCaseOutput
) : PeopleUseCaseInput {
    override fun execute(people: People): PeopleData {
        return peopleUseCaseOutput.toPeopleResponse(people)
    }

}