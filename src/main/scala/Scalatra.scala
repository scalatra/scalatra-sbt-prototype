import com.example.app._
import org.scalatra._

class Scalatra extends LifeCycle {
  override def init(context: ApplicationContext) {
    context.mount(new MyScalatraServlet, "/*")
  }
}
