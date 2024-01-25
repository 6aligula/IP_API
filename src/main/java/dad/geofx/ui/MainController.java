package dad.geofx.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.geofx.api.IpApiService;
import dad.geofx.api.LocationService;
import dad.geofx.model.LocationModel;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainController implements Initializable {

	// controllers

	private LocationController locationController = new LocationController();
	private ConnectionController connectionController = new ConnectionController();
	private SecurityController securityController = new SecurityController();

	@FXML
	private Tab connectionTab;

	@FXML
	private Tab locationTab;

	@FXML
	private Tab securityTab;

	@FXML
	private VBox view;
	
	@FXML
  	private TextField ipText;
	
	private IpApiService service;

	public MainController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		locationTab.setContent(locationController.getView());
		connectionTab.setContent(connectionController.getView());
		securityTab.setContent(securityController.getView());
	}

	@FXML
	void onCheckIpAction(ActionEvent event) {
		
		String ip = ipText.getText();

		System.out.println("IP: " + ip);

		service = LocationService.getInstance();
		service.getLocationByIp(ip).enqueue(new Callback<LocationModel>() {
			@Override
			public void onResponse(Call<LocationModel> call, Response<LocationModel> response) {
				if (response.isSuccessful()) {
					LocationModel location = response.body();
					System.out.println(location);
					// Actualiza la vista con la información de location
					Platform.runLater(() -> {
						locationController.updateView(location);
					});

				}
			}

			@Override
			public void onFailure(Call<LocationModel> call, Throwable throwable) {
				throwable.printStackTrace();
			}
		});
	}

	public VBox getView() {
		return view;
	}

}
