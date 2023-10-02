package com.e2s.sitemanagement.core.job

import org.springframework.stereotype.Service

@Service
class JobService(private val jobRepository: JobRepository) {

    fun getById(id: Long): Job? = jobRepository.findById(id).orElse(null)

    fun delete(job: Job) = jobRepository.delete(job)

    fun getAll(): List<Job> = this.jobRepository.findAll()

    fun save(job: Job) = jobRepository.save(job)
}