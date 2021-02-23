package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class StepVotacao extends Engine {
    @Dado("que esteja na tela principal")
    public void que_esteja_na_tela_principal(){

    }

    @Quando("efetua votação em uma imagem")
    public void efetuaVotaçãoEmUmaImagem( ) {
        RestAssured.baseURI = "https://api.thecatapi.com/v1/";
        httpRequest =
                given()
                        .contentType(ContentType.JSON)
                        .body(corpovotacao);
        response = httpRequest.post(urlvotacao);
        response.then()
                .statusCode(200);

        idVotacao = response.jsonPath().getString("id");
        System.out.println(idVotacao);
    }

    @Então("votação efetuada com sucesso")
    public void votaçãoEfetuadaComSucesso( ) {
        response.then()
                .body("message", containsString("SUCCESS"))
                .statusCode(200);
    }

    @Dado("que tenha efetuado uma votação")
    public void que_tenha_efetuado_uma_votação() {
        efetuaVotaçãoEmUmaImagem();
    }

    @Quando("efetua a exclusão da votação")
    public void efetua_a_exclusão_da_votação() {
        RestAssured.baseURI = "https://api.thecatapi.com/v1/";


    }

    @Então("exclusao da votação efetuada com sucesso")
    public void exclusao_da_votação_efetuada_com_sucesso() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
