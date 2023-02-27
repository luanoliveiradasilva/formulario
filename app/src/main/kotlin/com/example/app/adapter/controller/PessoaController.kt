package com.example.app.adapter.controller

import com.example.app.adapter.mapper.PeopleMapper
import com.example.app.adapter.mapper.request.PeopleMapperRequest
import com.example.app.adapter.mapper.response.PeopleMapperResponse
import com.example.app.application.usecase.PeopleUseCaseImpl
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/people")
class PessoaController(
    private val peopleMapper: PeopleMapper,
    private val peopleUseCaseImpl: PeopleUseCaseImpl
) {

    @PostMapping
    @ResponseBody
    fun postPeople(@RequestBody body: PeopleMapperRequest): PeopleMapperResponse {

        val request = peopleMapper.toPeople(body)

        val response = peopleUseCaseImpl.execute(request)

        return peopleMapper.toPeopleResponse(response)
    }
}