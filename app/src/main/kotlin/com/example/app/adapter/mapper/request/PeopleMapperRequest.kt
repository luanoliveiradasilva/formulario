package com.example.app.adapter.mapper.request

import com.fasterxml.jackson.annotation.JsonProperty

data class PeopleMapperRequest (
    @JsonProperty("data")
    val data: PeopleRequest
)

data class PeopleRequest (
    @JsonProperty("name")
    val name: String,
    @JsonProperty("lastname")
    val lastname: String
)
