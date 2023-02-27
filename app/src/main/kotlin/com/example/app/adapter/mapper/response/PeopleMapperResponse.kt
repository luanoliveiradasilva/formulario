package com.example.app.adapter.mapper.response

import com.fasterxml.jackson.annotation.JsonProperty

data class PeopleMapperResponse (
    @JsonProperty("data")
    val data: PeopleResponseData
)

data class PeopleResponseData (
    @JsonProperty("name")
    val name: String,

    @JsonProperty("lastname")
    val lastname: String,

    @JsonProperty("age")
    val age: String

)

