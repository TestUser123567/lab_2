public class Formula {
    private double x, y, z, result;

    Formula(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.result = 0;
    }

    void set(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void run(){
        this.result = Math.log(Math.pow(y, - (Math.sqrt(Math.abs(x)))))*(this.x - this.y / 2) +
                Math.pow(Math.sin(Math.atan(this.z)), 2);
    }
//    void run(){
//        this.result = (Math.exp(Math.abs(this.x - this.y)) * Math.pow(Math.abs(this.x - this. y), (this.x + this.y)))/
//               (Math.atan(this.x) + Math.atan(this.z)) + Math.cbrt(Math.pow(this.x, 6) + Math.pow(Math.log(this.y), 2));
//    }
    
    void print(){
        System.out.println("ф = " + this.result);
    }

    public double getResultFormula(){
        return result;
    }
}
