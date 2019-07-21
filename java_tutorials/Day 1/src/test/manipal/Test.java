package test.manipal;

public class Test {
	int t1;
    public Test(){
       t1 = 100;
    }
    public Test(int t1){
        this.t1 = t1;
     }
     public static void main(String [] args) {
         int t1 = 50;
         Test obj = new Test();
         System.out.println(obj.t1);
    }
}
