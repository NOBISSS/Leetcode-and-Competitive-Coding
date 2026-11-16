public class GCD{
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int findGCD(int arr[]){
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            result=gcd(result,arr[i]);
            System.out.println(result);
            if(result==1) break; 
        }
        return result;
    }
    public static void main(String args[]){
        int arr[]={2,4,7,10,12};
        
        System.out.println("GCD = :"+findGCD(arr));

    }
}