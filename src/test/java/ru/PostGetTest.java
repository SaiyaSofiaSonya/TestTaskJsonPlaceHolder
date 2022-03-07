package ru;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import io.restassured.response.Response;
import org.junit.jupiter.api.Disabled;

public class PostGetTest extends BaseTest {

    @Test
    @Disabled("Дополнить скоуп")
    @Description("Проверяем, что схема ответа валидна")
    public void validSchema() {
        Response response = sendGet(Endpoints.ENDPOINT_POST);
        checkResponseStatusOk(response, 200);
        checkValidSchema(response, "post_schema.json");
    }

    @Test
    @Description("Проверяем, что ответ не пустой")
    public void responseSize() {
        Response response = sendGet(Endpoints.ENDPOINT_POST);
        checkResponseStatusOk(response, 200);
        checkIfResponseNotEmpty(response
                .then()
                .extract()
                .asString());
    }

    @Test
    @Description("Проверяем корректность параметров тела ответа")
    public void responseBodyParams() {
        Response response = sendGet(Endpoints.ENDPOINT_POST);
        checkResponseStatusOk(response, 200);
        checkBodyParams(response);
    }

    @Test
    @Description("Проверяем, что количество постов - 100")
    public void responseHas100Posts() {
        Response response = sendGet(Endpoints.ENDPOINT_POST);
        checkResponseStatusOk(response, 200);
        checkPostNumber(response, 100);
    }
}
