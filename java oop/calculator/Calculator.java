class Calculator implements java.io.Serializable {
    private double n1;
    private double n2;
    private String operator;
    private double result;



void setOperandOne(double num1){
    this.n1 = num1;
}

void setOperandTwo(double num2){
    this.n2 = num2;
}

void setOperation(String operator){
    if (this.operator == "+"){
    this.result = n1 + n2;
    }

    if (this.operator == "-"){
     this.result = n1 - n2;
    }

}



double getResult(){
    System.out.println(this.result);
    return result;
}

}
