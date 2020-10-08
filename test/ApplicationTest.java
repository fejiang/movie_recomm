import org.junit.*;
import play.test.*;
import play.mvc.*;
import play.mvc.Http.*;
import models.*;

public class ApplicationTest extends FunctionalTest {

    @Test
    public void testThatIndexPageWorks() {
        Response response = GET("/");
        assertIsOk(response);
        assertContentType("text/html", response);
        assertCharset(play.Play.defaultWebEncoding, response);
    }
    
    @Test
    public void testMovieRecomm() {
        String userId = "1";
        Response response = GET("/movierecomm/"+userId);
        assertIsOk(response);
        assertContentType("application/json", response);
        assertCharset(play.Play.defaultWebEncoding, response);
    }
}
