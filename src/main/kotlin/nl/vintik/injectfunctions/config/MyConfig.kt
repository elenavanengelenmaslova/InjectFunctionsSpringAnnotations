package nl.vintik.injectfunctions.config

import nl.vintik.injectfunctions.functions.PublishMessage
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

fun publishMessage(message: String) {
    println("Publishing message: $message")
}

@Configuration
class MyConfig {

    @Bean("publishMessageTopLevelFunction")
    fun publishMessageTopLevelFunction(): (String) -> Unit =
        ::publishMessage


    @Bean("publishMessageLambda")
    fun publishMessageLambda(): (String) -> Unit =
        { message ->
            println("Publishing message: $message")
            // Actual Service Bus logic here
        }

    @Bean("publishMessageFunctionalInterfaceLambda")
    fun publishMessageFunctionalInterface() =
        PublishMessage { message ->
            println("Publishing message: $message")
        }
}
