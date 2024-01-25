package dad.geofx.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LocationService {

    private static final String BASE_URL = "https://ipapi.com/";
    private static IpApiService service;

    public static IpApiService getInstance() {
        if (service == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            service = retrofit.create(IpApiService.class);
        }
        return service;
    }
}
