package com.example.app.adapter.service.config

import com.example.app.adapter.mapper.PeopleMapper
import com.example.app.adapter.service.PeopleServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PeopleConfig {

    @Bean("people-service")
    fun peopleConfig(
        peopleResponse: PeopleMapper
    ):PeopleServiceImpl{
        return PeopleServiceImpl(peopleResponse)
    }
}