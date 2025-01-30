package nl.vintik.injectfunctions.config

import nl.vintik.injectfunctions.functions.PublishMessage
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MyConfig {

    @Bean
    @ConditionalOnProperty(
        name = ["cloud.provider"],
        havingValue = "Azure"
    )
    fun publishMessageServiceBus() =
        PublishMessage { message ->
            println("Publishing message on Service Bus: $message")
        }

    @Bean
    @ConditionalOnProperty(
        name = ["cloud.provider"],
        havingValue = "AWS"
    )
    fun publishMessageEventBridge() =
        PublishMessage { message ->
            println("Publishing message on Event Bridge: $message")
        }
}
