import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainPoint {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Координаты точки x: ");
    int x = Integer.parseInt(br.readLine().toUpperCase());

    System.out.print("Координаты точки y: ");
    int y = Integer.parseInt(br.readLine().toUpperCase());
  }
}

