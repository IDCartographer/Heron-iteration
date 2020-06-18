import java.util.Scanner;


public class Functional 
{
	static Scanner in = new Scanner(System.in);
	public static double Iterator(double data)//Метод отвечающий за итерационную формулу
    {

        double potential = 3;
        double data_potential = 1;
        boolean flag = true;

        do
        {
            data_potential = (0.5 * (potential + (data / potential)));
            if (potential == data_potential)
            {
                flag = false;
            }
            else
            {
                potential = data_potential;
            }
            if (flag == false)
            {
                break;
            }
        } while (flag);

        return potential;


    }
    public static void Handler()//Метод обрабатывающий введённые данные
    {
    	System.out.println("Введите число для поиска его корня");
        double data;
        try
        {
            data = in.nextDouble();;


            if (data > 0)//Проверка введённых данных
            {
                data = Iterator(data);
                System.out.println("Корень заданого числа=" + data);
            }
            else
            {
                if (data == 0)
                {
                	System.out.println("Корень из 0 всегда 0");
                }
                else
                {
                	System.out.println("Для данного числа не существет корня");
                }

            }
        }
        
        catch (Exception e)
        {
        	System.out.println("Неизвестная ошибка");
        }
    }
}
