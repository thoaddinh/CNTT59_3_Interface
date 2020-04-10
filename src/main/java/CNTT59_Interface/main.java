
package CNTT59_Interface;

public class main {
    
    public static void main(String[] args){
     
       ICalculator calculator =  new CasioCalculator();
        System.out.println("4 + 5 = "+ calculator.cong(4, 5));
    }
}