public class Vectors {

    private static double[] arrVect = {67, 67, 172, 1, 89, 55};
    private static double[] anotherVector = {6, 3, 7};

    public static void sum()
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

    public static void mult(int multer)
    {
        System.out.print("Вектор arrVect, умноженный на " + multer + ": ");
        for (int i = 0; i < arrVect.length; i++)
        {
            arrVect[i] = multer * arrVect[i];
            System.out.print(arrVect[i] + " ");
        }
    }

    public static double scalarMult()
    {
        double scalVect = 0;
        for (int i = 0; i < arrVect.length; i++)
        {
            scalVect += arrVect[i] * anotherVector[i];
        }
        System.out.println();
        return scalVect;
    }

}
