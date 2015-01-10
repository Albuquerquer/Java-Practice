public class ArrayVector
{
    private static double[] arrVect = {67, 67, 172, 1, 89, 55};
    private static double[] anotherVector = {6, 3, 7};

    public double getElement(int i)
    {
        return arrVect[i];
    }

    public void setElement(int index, double value)
    {
        this.arrVect[index] = value;
    }

    public double getMax()
    {
        double max = 0;
        for (int i = 0; i < arrVect.length; i++)
        {
            if (arrVect[i] > max)
                max = arrVect[i];
        }
        return max;
    }

    public double getMin()
    {
        double min = Double.MAX_VALUE ;
        for (int i = 0; i < arrVect.length; i++)
        {
            if (arrVect[i] < min)
                min = arrVect[i];
        }
        return min;
    }

    public double getSize()
    {
        return arrVect.length;
    }

    public double getNorm()
    {
        return Math.sqrt(Vectors.scalarMult());
    }

    public void sort()
    {
        for(int i = 0; i < arrVect.length - 1; i++)
        {
            for(int j = i + 1; j<arrVect.length; j++)
            {
                if(arrVect[i] > arrVect[j])
                {
                    double tmp = arrVect[i];
                    arrVect[i] = arrVect[j];
                    arrVect[j] = tmp;
                }
            }
        }
        for(int i = 0; i <  arrVect.length; i++) {
            System.out.print(arrVect[i] + "  ");
        }
    }

    public static void main(String[] args)
    {
        ArrayVector vector = new ArrayVector();
        vector.getElement(2);
        vector.setElement(2,78);
        System.out.println("Максимальный элемент массива arrVect: " + vector.getMax());
        System.out.println("Минимальный элемент массива arrVect: " + vector.getMin());
        System.out.println("Длина массива arrVect: " + vector.getSize());
        System.out.println("Евклидова норма: " + vector.getNorm());
        Vectors.sum();
        Vectors.mult(5);
        System.out.println("Скалярное произведение векторов arrVect и anotherVector: " + Vectors.scalarMult());
        vector.sort();
    }
}