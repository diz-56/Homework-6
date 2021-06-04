import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HW {
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECAST = "forecasts";
    private static final String API_VERSION = "v1";
    private static final String FORECAST_TYPE = "daily";
    private static final String FORECAST_PERIOD = "5day";

    private static final String SAINT_PETERBUGG_KEY = "295212_PC";
    private static final String API_KEY = System.getenv("NBu5nYfaJpu0mHRtPHM9tKt0pgl7X7rq");

    public static void main(String[] args)  throws IOException {

        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder ()
                .scheme("http")
                .host(BASE_HOST)
                .addPathSegment(FORECAST)
                .addPathSegment(API_VERSION)
                .addPathSegment(FORECAST_TYPE)
                .addPathSegment(FORECAST_PERIOD)
                .addPathSegment(SAINT_PETERBUGG_KEY)
                .addQueryParameter("apikey",API_KEY)
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metrie", "true")
                .build();
    }
}
