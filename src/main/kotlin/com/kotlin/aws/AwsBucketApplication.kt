package com.kotlin.aws

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AwsBucketApplication

fun main(args: Array<String>) {
    runApplication<AwsBucketApplication>(*args)
}
