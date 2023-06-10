package ex;

public class  Main {
    public static void main(String[] a)
    {

        for(int i=0; i<10; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        int x =4;
        int y =1;
        int z=1;
        while(z<=5)
        {
            y=y * x;
            System.out.println("результат: " + y);
            z++;
        }
        System.out.println(" ");

        int num = 5;
        do{
            System.out.println("результат : " + num);
            num++;
        }
        while (num < 10);
    }

}
