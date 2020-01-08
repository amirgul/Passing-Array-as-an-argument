public class Main
{

    public static void main(String[] args)
    {
        double[] an = new double[10];
        double[] values = values(an);
        for(int i = 0; i<values.length; i++)
        {
            System.out.print(values[i] +" ");
        }



    }
    public static double[] values(double[] anArray)
    {
        double[] temp = new double[anArray.length];
        for(int i = 0; i<temp.length; i++)
        {
            temp[i] = i * 2 + 5;
        }
        return  temp;
    }


}
