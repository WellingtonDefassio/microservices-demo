package com.microservices.demo.twitter.to.kafka.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "twitter-to-kafka-service")
class TwitterToKafkaServiceConfigData {
    lateinit var twitterKeywords: List<String>
    lateinit var welcomeMessage: String
}