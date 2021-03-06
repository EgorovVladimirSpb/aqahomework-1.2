package ru.netology.rest;

import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

class MobileBankApiTestV4MofidiedForHomework {
    @Test
    void shouldReturnDemoAccounts() {
      // Given - When - Then
      // Предусловия
      given()
          .baseUri("http://localhost:9999/api/v1")
      // Выполняемые действия
      .when()
          .get("/demo/accounts")
      // Проверки
      .then()
              .statusCode(200)
              .body(matchesJsonSchemaInClasspath("accounts.schema.json"))
      ;
    }
}
