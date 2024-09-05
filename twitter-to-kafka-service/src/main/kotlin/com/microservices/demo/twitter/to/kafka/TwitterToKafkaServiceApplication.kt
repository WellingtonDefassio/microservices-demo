package com.microservices.demo.twitter.to.kafka

import com.microservices.demo.twitter.to.kafka.config.TwitterToKafkaServiceConfigData
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TwitterToKafkaServiceApplication(
    val twitterToKafkaServiceConfigData: TwitterToKafkaServiceConfigData
) : CommandLineRunner {

    private val logger = LoggerFactory.getLogger(TwitterToKafkaServiceApplication::class.java)

    override fun run(vararg args: String?) {
        logger.info("App starts...")
        logger.info(twitterToKafkaServiceConfigData.twitterKeywords.toString())
        logger.info(twitterToKafkaServiceConfigData.welcomeMessage)
    }
}

fun main(args: Array<String>) {
    runApplication<TwitterToKafkaServiceApplication>(*args)
}
