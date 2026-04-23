import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.http.*

fun main() {
    embeddedServer(Netty, port = 8080) {
        routing {
            get("/") {
                call.respondText("Moekyaw Aung | Senior Android Developer | Kotlin & Compose", ContentType.Text.Html)
            }
            get("/resume.json") {
                call.respondText(
                    """
                    {
                        "name": "Moekyaw Aung",
                        "location": "Bangkok, Thailand",
                        "skills": ["Kotlin", "Jetpack Compose", "MVVM", "Firebase", "AI/ML"],
                        "projects": ["MoekyawTranslator", "SecureChat App"]
                    }
                    """.trimIndent(),
                    ContentType.Application.Json
                )
            }
        }
    }.start(wait = true)
}
