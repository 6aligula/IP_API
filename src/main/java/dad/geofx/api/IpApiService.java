package dad.geofx.api;

import dad.geofx.model.LocationModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IpApiService {
    @GET("/ip_api.php")
    Call<LocationModel> getLocationByIp(@Query("ip") String ip);
}
