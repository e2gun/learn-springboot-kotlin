package com.e2s.sitemanagement.core.site

import org.springframework.stereotype.Service

@Service
class SiteService(private val siteRepository: SiteRepository) {

    fun getAll() = siteRepository.findAll()

    fun getById(id: Long) = siteRepository.findById(id)

    fun save(site: Site) = siteRepository.save(site)

    fun delete(site: Site) = siteRepository.delete(site)

}