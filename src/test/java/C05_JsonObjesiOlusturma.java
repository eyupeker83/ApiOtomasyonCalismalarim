import io.restassured.path.json.JsonPath;
import org.json.JSONObject;
import org.junit.Test;

public class C05_JsonObjesiOlusturma {
    @Test
    public void test01(){
        /*
        "firstname":"Jim",
        "additionalneeds":"Breakfast",
        "Bookingdates":{
                        "checkin":"2018-01-01"
                        "checout":"2019-01-01"
                        },
        "totalprice":111,
        "depositpaid":true,
        "lastname":"Brown

        }

         */
        //Once inner json object olusturulur
        JSONObject dateObject =new JSONObject();
        dateObject.put("checkin","2018-01-01");
        dateObject.put("checout","2019-01-01");
        //sonra outer json object olusturulup yeri geldiginde inner object koyalim
        JSONObject requestBody=new JSONObject();
        requestBody.put("firstname","Jim");
        requestBody.put("additionalneeds","Breakfast");
        requestBody.put("Bookingdates",dateObject);
        requestBody.put("totalprice",111);
        requestBody.put("depositpaid",true);
        requestBody.put("lastname","Brown");
        System.out.println(requestBody);

        /*
        {
        "firstname":"Jim",
        "additionalneeds":"Breakfast",
        "totalprice":111,
        "depositpaid":true,
        "Bookingdates":
                        {"checkin":"2018-01-01",
                        "checout":"2019-01-01"
                         },

        "lastname":"Brown"}

         */

    }
}
