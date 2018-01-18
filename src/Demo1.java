import javax.swing.*;

public class Demo1 {

	public static void main(String[] args) 
	{
		String strdeg = JOptionPane.showInputDialog("Please enter temperature in farenheit.");
		double farenheit = Double.parseDouble(strdeg);
		double centigrade = (5.0/9)*(farenheit - 32);
		System.out.println("Temperature is " + centigrade + " degrees centigrade");
		JOptionPane.showMessageDialog(null, "Temperature is " + centigrade + " degrees centigrade" , "Response" , JOptionPane.INFORMATION_MESSAGE);

	}

}
