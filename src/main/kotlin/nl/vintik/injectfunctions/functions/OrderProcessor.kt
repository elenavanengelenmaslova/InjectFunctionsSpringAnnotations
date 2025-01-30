package nl.vintik.injectfunctions.functions

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

//@Service
//class OrderProcessor(@Qualifier("publishMessageTopLevelFunction") private val publishMessage: (String) -> Unit) {
//    fun process(){
//        println("Processing the order")
//        // process order
//        publishMessage("Order processed")
//    }
//}

//@Service
//class OrderProcessor(@Qualifier("publishMessageLambda") private val publishMessage: (String) -> Unit) {
//    fun process(){
//        println("Processing the order")
//        // process order
//        publishMessage("Order processed")
//    }
//}

//@Service
//class OrderProcessor(@Qualifier("publishMessageFunctionalInterfaceLambda") private val publishMessage: PublishMessage) {
//    fun process(){
//        println("Processing the order")
//        // process order
//        publishMessage("Order processed")
//    }
//}

@Service
class OrderProcessor(@Qualifier("publishMessageFunctionalInterface")private val publishMessage: PublishMessage) {
    fun process() {
        println("Processing the order")
        // process order
        publishMessage("Order processed")
    }
}
