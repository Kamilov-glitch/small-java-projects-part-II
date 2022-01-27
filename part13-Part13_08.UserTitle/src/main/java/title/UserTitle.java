package title;
import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;


public class UserTitle extends Application {
    @Override
    public void start(Stage window) {
        Parameters params = getParameters();
        window.setTitle(params.getNamed().get("title"));
        window.show();
    }
}
