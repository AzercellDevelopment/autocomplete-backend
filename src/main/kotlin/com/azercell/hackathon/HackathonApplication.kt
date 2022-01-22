package com.azercell.hackathon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication(scanBasePackages = ["com.azercell.*"])
@EnableJpaRepositories("com.azercell.*")
class HackathonApplication

fun main(args: Array<String>) {
	runApplication<HackathonApplication>(*args)
}
