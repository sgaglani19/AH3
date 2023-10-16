public class FizzBuzz{
    public void fizzBuzz(int n){
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0){
                if(i % 5 == 0){
                    System.out.println("FizzBuzz");
                }
                else{
                    System.out.println("Fizz");
                }
            }
            else if(i % 5 == 0){
                if(i % 3 == 0){
                    System.out.println("FizzBuzz");
                }
                else{
                    System.out.println("Buzz");
                }
            }
            else{
                System.out.println(i);
            }
        }
    }
    public void recursiveFizz(int n,int temp){
        if(n % 3 == 0 && n % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if(n % 3 == 0){
            System.out.println("Fizz");
        }
        else if(n % 5 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(n);
        }
        if(temp > 0){
            n++;
            temp--;
            recursiveFizz(n,temp);
        }
        

    }
    public static void main(String[] args) {
        FizzBuzz fizz = new FizzBuzz();
        fizz.fizzBuzz(15);
        fizz.recursiveFizz(1,14);
    }
}