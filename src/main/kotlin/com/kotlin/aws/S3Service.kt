package com.kotlin.aws

interface S3Service {

    fun getBucketNames(): List<String>
}