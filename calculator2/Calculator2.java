public class Calculator2 {
    private double nnum1;
    private double nnum2;
    private double result ;
    private String Operation;
    // getter
    
    
    // setter
    public void setNumberOne(double num1) {
        this.nnum1 = num1;
    }
    public double getNumberOne() {
        return nnum1; 
    }
    // getter
   
    // setter
    public void setNumberTwo(double num2) {
        this.nnum2 = num2;        // 1
    }
    public double getNumberTwo() {
        return nnum2; 
    }
    public void performOperation() {
     
        if(this.Operation=="+"){
            this.result=this.nnum1+this.nnum2;
        }
        if(this.Operation=="*"){
            this.result=this.nnum1*this.nnum2;
        }
        if(this.Operation=="-"){
            this.result=this.nnum1-this.nnum2;
        }
        if(this.Operation=="/"){
            this.result=this.nnum1/this.nnum2;
                }        // 1
    }
    public void getOperation() {
        System.out.print(this.result);
    }
    public void setOperation(String x) {
        this.Operation=x;
    }
}