public class ArrayVector
{
    private double[] arrVect = {2, 67, 8};
    private double[] anotherVector = {6, 3, 7};

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
        double res;
        res = Math.sqrt(scalarMult());
        return res;
    }

    public void sort()
    {
        for (int i = arrVect.length - 1; i > 0; i--)
        {
                for (int j = 0; j < i; j++)
                {
                    if (arrVect[j] > arrVect[j+1])
                    {
                        double temp = arrVect[j];
                        arrVect[j] = arrVect[j+1];
                        arrVect[j + 1] = temp;
                    }
                }
        }
    }

    public void sum()
    {
        double[] sumVect = new double[3];
        System.out.print("Сложение векторов arrVect и anotherVector: ");
        for (int i = 0; i < arrVect.length; i++)
        {
            sumVect[i] = arrVect[i] + anotherVector[i];
            System.out.print(sumVect[i] + " ");
        }
        System.out.println();
    }

    public void mult(int multer)
    {
        System.out.print("Вектор arrVect, умноженный на " + multer + ": ");
        for (int i = 0; i < arrVect.length; i++)
        {
            arrVect[i] = multer * arrVect[i];
            System.out.print(arrVect[i] + " ");
        }
    }

    public double scalarMult()
    {
        double scalVect = 0;
        for (int i = 0; i < arrVect.length; i++)
        {
            scalVect += arrVect[i] * anotherVector[i];
        }
        System.out.println();
        return scalVect;
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
        vector.sum();
        vector.mult(5);
        System.out.println("Скалярное произведение векторов arrVect и anotherVector: " + vector.scalarMult());
        vector.sort();
    }
}