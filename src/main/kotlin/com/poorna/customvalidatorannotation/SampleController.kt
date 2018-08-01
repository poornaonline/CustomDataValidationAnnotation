package com.poorna.customvalidatorannotation

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class SampleController {

    @PostMapping("/")
    fun sample(@Valid @RequestBody person: Person): Person {
        return person;
    }
}