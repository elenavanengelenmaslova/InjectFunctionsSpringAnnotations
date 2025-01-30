package nl.vintik.injectfunctions.functions

import org.springframework.stereotype.Service

@Service
class OrderProcessor(private val publishMessage: PublishMessage) {
    fun process() {
        println("Processing the order")
        // process order
        publishMessage("Order processed")
    }
}
