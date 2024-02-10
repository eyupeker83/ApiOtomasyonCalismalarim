import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class C09_Get_TestYaparkenTekrarlardanKurtulma {

            /*
        https://restful-booker.herokuapp.com/booking/10 url’ine
        bir GET request gonderdigimizde donen Response’un,
 	        status code’unun 200,
	        ve content type’inin application-json,
	        ve response body’sindeki
            "firstname“in,"Susan",
            ve "lastname“in, "Jackson",
            ve "totalprice“in,1000'den kucuk oldugu,
            ve "depositpaid“in,false,
            ve "additionalneeds“in,bos biralkilmadigini
            oldugunu test edin
         */

    @Test
    public void test01(){

        String url ="https://restful-booker.herokuapp.com/booking/10";


        Response response =given().with().get(url);
        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("firstname",equalTo("Susan"),
                        "lastname", equalTo("Ericsson"),
                        "totalprice",lessThan(1000),
                        "depositpaid",equalTo(true),
                        "additionalneeds",nullValue());
    }
}
