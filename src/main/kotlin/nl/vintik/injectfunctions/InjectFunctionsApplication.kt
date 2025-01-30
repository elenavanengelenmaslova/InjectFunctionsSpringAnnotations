package nl.vintik.injectfunctions

import nl.vintik.injectfunctions.functions.OrderProcessor
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class InjectFunctionsApplication

fun main(args: Array<String>) {
    runApplication<InjectFunctionsApplication>(*args)
}

@Component
class OrderProcessorRunner(
    private val orderProcessor: OrderProcessor
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("--- Invoking OrderProcessor ---")
        orderProcessor.process()
    }
}