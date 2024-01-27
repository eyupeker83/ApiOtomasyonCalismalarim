import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.path.json.JsonPath.*;

public class C03_GetRequest_ResponseDegerleriniOtomasyonIleTestEtme {
    @Test
    public void test01(){

        /*
        https://restful-booker.herokuapp.com/booking/10 url’ine
        bir GET request gonderdigimizde donen Response’un,
        status code’unun 200,
        ve content type’inin application/json; charset=utf-8,
        ve Server isimli Header’in degerinin Cowboy,
        ve status Line’in HTTP/1.1 200 OK
        ve response suresinin 5 sn’den kisa oldugunu manuel olarak test ediniz
         */
        String url ="https://restful-booker.herokuapp.com/booking/10";
        Response response =given().when().get(url);
        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json")
                .header("Server","Cowboy")
                .statusLine("HTTP/1.1 200 OK");


    }
}
