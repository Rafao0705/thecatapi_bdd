package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

// steps definitions commit
// testando merge de branch
// testando merge com pull request
public class StepCadastro extends Engine{

    @Dado("que acesse a pagina de cadastro")
    public void que_acesse_a_pagina_de_cadastro() {
        };

    @Quando("eu faço o cadastro de um email")
    public void eu_faco_o_cadastro_de_um_email( ) {
        RestAssured.baseURI = "https://api.thecatapi.com/v1/";
        httpRequest =
                given()
                        .contentType(ContentType.JSON)
                        .body(bodycadastro);
        response = httpRequest.post(urlcadastro);
        response.then()
                .statusCode(200);

    }

    @Então("serei cadastrado com sucesso")
    public void serei_cadastrado_com_sucesso(){

        response.then()
                .body("message", containsString("SUCCESS"))
                .statusCode(200);

        }


}
