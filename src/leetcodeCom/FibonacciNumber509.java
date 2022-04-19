package leetcodeCom;

public class FibonacciNumber509 {
    public static void main(String[] args) {
        FibonacciNumber509 obj = new FibonacciNumber509();
        System.out.println(obj.fib(4));
    }
    public int fib(int n) {
//0  1  1  2  3  5  8  13
if(n < 2){
    return n;
}
int firstNum = 0;
int secondNum = 1;
int nextNum  = 0;
        System.out.print(firstNum + secondNum);
for(int i = 2; i <= n; i++){
    nextNum = firstNum + secondNum;//0 + 1 = 2 .... 1 + 2 = 3
    System.out.println(nextNum);
    firstNum = secondNum;//1 , 2
    secondNum = nextNum;//2 , 3
}
return nextNum;
    }
}