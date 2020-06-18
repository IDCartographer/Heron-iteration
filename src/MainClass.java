import java.util.Scanner;

public class MainClass 
{
	static Scanner in = new Scanner(System.in);
	public static void main(String args[]) 
	{
		String triger;
		String t="y";
	do
     {
         
         Functional.Handler();//Вызов метода для обработки данных
         System.out.println("Для продолжения работы введите y, для завершения любую другую клавишу.");
         triger=in.next();

     } while (t.equals(triger));
}
}
