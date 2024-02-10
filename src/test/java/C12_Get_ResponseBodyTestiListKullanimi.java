import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C12_Get_ResponseBodyTestiListKullanimi {
    /*
            http://dummy.restapiexample.com/api/v1/employees url'ine
            bir GET request yolladigimizda
                donen Response'in
                    status code'unun 200,
                    ve content type'inin Aplication.JSON,
                    ve response body'sindeki
                    employees sayisinin 24
                    ve employee'lerden birinin "Ashton Cox"
                    ve girilen yaslar icinde 61,21 ve 35 degerinin oldugunu test edin.
         */

    @Test
    public void test01(){
        String url ="http://dummy.restapiexample.com/api/v1/employees";

        Response response =given().when().get(url);

        response.then()
                .assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("data.id", Matchers.hasSize(24))
                .body("data.employee_name",Matchers.hasItem("Ashton Cox"))
                .body("data.employee_age",Matchers.hasItems(61,21,35));


    }
}
