package MyFirstPackage;

public class MySecondClass
{
    private int i, j;

    public MySecondClass()
    {
        this.i = 1;
        this.j = 1;
    }

    public void setI (int newI)
    {
        this.i = newI;
    }

    public void setJ (int newJ)
    {
        this.j = newJ;
    }
	
    public int sum()
    {
        return i+j;
    }
}
