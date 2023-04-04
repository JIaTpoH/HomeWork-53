import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainPoint {


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Point point = Point.read(br);
    System.out.println(point.coordinatesFind());
  }
}
