package com.poorna.customvalidatorannotation

class Person {

    var id: Long? = null
    var name: String? = null
    @CustomRole
    var role: String? = null
}