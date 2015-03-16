package group.lis.uab.trip2gether.model;

/**
 * Created by davidcara on 14/3/15.
 */
import com.parse.Parse;

public class Application extends android.app.Application {

    //ES CRIDA AL INICIAR LA APP
    public void onCreate() {
        //inicialitzem la BD externa
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "lWa3WC7l4Y7DCZx5qChjsANfUwjclOOlIITaok2Q", "QmI8vQiaF19KvK1S2XrfozsqZ9yjE42ymeojuugx");
    }

}
