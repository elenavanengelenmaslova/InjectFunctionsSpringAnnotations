package nl.vintik.injectfunctions.functions

import org.springframework.stereotype.Component

fun interface PublishMessage {
    operator fun invoke(message: String)
}

@Component("publishMessageFunctionalInterface")
class PublishMessageToServiceBus : PublishMessage {
    override operator fun invoke(message: String) {
        println("Publishing message: $message")
    }
}