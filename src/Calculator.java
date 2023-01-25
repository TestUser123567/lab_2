public class Calculator {
    private int size;
    private double xstep, ystep, zstep;
    private double xstart, ystart, zstart;
    private double[] array;
    Formula formula = new Formula();

    public Calculator(int size, double xstep, double ystep, double zstep){
        this.size = size;
        this.xstep = xstep;
        this.ystep = ystep;
        this.zstep = zstep;
        this.array = new double[size];
    }

    void set(double x, double y, double z){
        xstart = x;
        ystart = y;
        zstart = z;
    }

    void calculate() {
        for (int i = 0; i < array.length; i++)
        {
            formula.set(xstart, ystart, zstart);
            formula.run();
            array[i] = formula.getResultFormula();
            xstart += xstep;
            ystart += ystep;
            zstart += zstep;
        }
    }
    void print(){
        for (int i = 0; i < array.length; i++)
        {
            System.out.println((i+1) + ". F(x) = " + array[i]);
        }
    }
}
