package steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;

public class Engine {


    public Response response;
    public RequestSpecification httpRequest;
    public String bodycadastro = "{\"email\": \"rafao0705@gmail.com\",\"appDescription\": \"testeapi\"}";
    public String urlcadastro = "user/passwordlesssignup";

    String urlvotacao = "/votes/";
    String corpovotacao = "{\"image_id\": \"cvf\", \"value\": \"true\"}";

    String idVotacao;


}
