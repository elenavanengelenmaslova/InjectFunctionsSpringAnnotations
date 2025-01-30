package nl.vintik.injectfunctions.functions

fun interface PublishMessage {
    operator fun invoke(message: String)
}