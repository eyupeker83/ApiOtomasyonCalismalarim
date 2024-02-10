import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class C10_JsonPathKullanimi {
    @Test
    public void method1(){

        JSONObject kisiBilgileriJsonObj= new JSONObject();

        JSONObject adresJsonObj= new JSONObject();

        JSONArray telefonBilgileriArr =new JSONArray();
        JSONObject cepTelJson=new JSONObject();
        JSONObject evTelJson =new JSONObject();

        adresJsonObj.put("streetAddress","naist street");
        adresJsonObj.put("city","Nara");
        adresJsonObj.put("postalCode","630-192");

        cepTelJson.put("type","iphone");
        cepTelJson.put("number","0123-4567-8888");

        evTelJson.put("type","home");
        evTelJson.put("number","0123-4567-8910");
        telefonBilgileriArr.put(cepTelJson);
        telefonBilgileriArr.put(evTelJson);

        kisiBilgileriJsonObj.put("firstName","John");
        kisiBilgileriJsonObj.put("lastName","doe");
        kisiBilgileriJsonObj.put("age",26);
        kisiBilgileriJsonObj.put("address",adresJsonObj);
        kisiBilgileriJsonObj.put("phoneNumbers",telefonBilgileriArr);


        System.out.println(kisiBilgileriJsonObj);
    }
}
