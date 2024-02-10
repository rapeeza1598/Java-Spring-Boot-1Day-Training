package com.example.demo.configuration

import com.example.demo.entity.User
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer
import org.springframework.web.servlet.config.annotation.CorsRegistry

@Configuration
class ExposeEntityIdRestConfiguration : RepositoryRestConfigurer{
    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration,cors: CorsRegistry) {
        config.exposeIdsFor(User::class.java)
    }
}