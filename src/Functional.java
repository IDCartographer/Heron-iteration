import java.util.Scanner;


public class Functional 
{
	static Scanner in = new Scanner(System.in);
	public static double Iterator(double data)//����� ���������� �� ������������ �������
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
    public static void Handler()//����� �������������� �������� ������
    {
    	System.out.println("������� ����� ��� ������ ��� �����");
        double data;
        try
        {
            data = in.nextDouble();;


            if (data > 0)//�������� �������� ������
            {
                data = Iterator(data);
                System.out.println("������ �������� �����=" + data);
            }
            else
            {
                if (data == 0)
                {
                	System.out.println("������ �� 0 ������ 0");
                }
                else
                {
                	System.out.println("��� ������� ����� �� ��������� �����");
                }

            }
        }
        
        catch (Exception e)
        {
        	System.out.println("����������� ������");
        }
    }
}
