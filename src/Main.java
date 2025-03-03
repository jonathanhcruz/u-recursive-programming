import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("Ingrese un número para calcular la suma:");
    int number = Integer.parseInt(input);

    int res = suma(number);

    JOptionPane.showMessageDialog(null, "El resultado de la suma hasta " + number + " es: " + res);
  }

  public static int suma(int number) {
    if(number < 1) return 0;

    return number + suma(number - 1);
  }
}