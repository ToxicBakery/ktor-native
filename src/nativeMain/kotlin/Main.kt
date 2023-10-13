import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(CIO, 8080, module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    routing {
        get("/") {
            call.respondText("Hello, World!", ContentType.Text.Plain, HttpStatusCode.OK)
        }
    }
}