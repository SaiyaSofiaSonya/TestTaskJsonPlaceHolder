package apis;

import com.github.javafaker.Faker;
import io.restassured.response.Response;
import java.util.Random;

public class PostApi {
    private int userId;
    private int id;
    private String title;
    private String body;

    public PostApi() {
    }

    public PostApi(int userId, String title, String body) {
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
