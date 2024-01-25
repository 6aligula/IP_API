package dad.geofx.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.geofx.model.LocationModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class LocationController implements Initializable {

  @FXML
  private Label callingCodeText;

  @FXML
  private Button checkIpButton;

  @FXML
  private Label cityStateText;

  @FXML
  private Label currencyText;
  @FXML
  private Label countryText;

  @FXML
  private ImageView flagImage;

  @FXML
  private Label ipLocationText;

  @FXML
  private TextField ipText;

  @FXML
  private Label languageText;

  @FXML
  private Label latitudeText;

  @FXML
  private Label longitudeText;

  @FXML
  private Label timeZoneText;

  @FXML
  private VBox view;

  @FXML
  private Label zipCodeText;

  public void updateView(LocationModel location) {
    // Este método actualizará las etiquetas con la información de la ubicación
    latitudeText.setText(String.valueOf(location.getLatitude()));
    longitudeText.setText(String.valueOf(location.getLongitude()));
    cityStateText.setText(location.getCity() != null ? location.getCity() : "");
    zipCodeText.setText(location.getZip() != null ? location.getZip() : "");
    countryText.setText(location.getCountryName() != null ? location.getCountryName() : "");
    // languageText.setText(location.getLanguage() != null ? location.getLanguage()
    // : "");
    if (location.getTime_zone() != null) {
      timeZoneText.setText(location.getTime_zone().getCode() != null ? location.getTime_zone().getCode() : "");
    } else {
      timeZoneText.setText("");
    }

    // callingCodeText.setText(location.getLocation().getCallingCode());
    // currencyText.setText(location.getCurrency().getName() + " (" +
    // location.getCurrency().getSymbol() + ")");

    // // Para la imagen de la bandera, necesitarás cargar la imagen desde la URL
    // Image flag = new Image(location.getLocation().getCountryFlag(), true); //
    // true para cargar en segundo plano
    // flagImage.setImage(flag);
    // ... actualiza el resto de las etiquetas
  }

  public LocationController() throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LocationView.fxml"));
    loader.setController(this);
    loader.load();
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    // TODO Auto-generated method stub

  }

  public VBox getView() {
    return view;
  }

}
