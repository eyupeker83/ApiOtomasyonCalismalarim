import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class C1_GetRequestResponseBodyYazdirma {

    @Test
    public void get01(){
        //1-Request body ve end-point hazırlama
        //
        String url="https://restful-booker.herokuapp.com/booking/10";
        //2- Expected data hazirlama

        //3-Request gönderip  dönen response i kaydetme
        Response response =given().when().get(url);
        //4- Assertion
        response.prettyPrint();

    }

}
