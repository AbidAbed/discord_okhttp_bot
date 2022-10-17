import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        OkHttpClient client = new OkHttpClient();
        Request me = new Request.Builder().url("https://discord.com/api/v10/users/@me")
                .header("Authorization",
                        "Bot OTgwMTk1NjU4NDI4NDY1MTYz.GYNn9J.PNtTODXGj55m69feaOI2W8oXPtxboV6HZ3kC7g")
                .build();
        Response response = client.newCall(me).execute();
        System.out.print(response.body().string());
    }

}