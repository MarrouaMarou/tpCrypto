import java.math.BigInteger;
class Main{
    public static BigInteger [] euclideetendu(BigInteger a , BigInteger b){
        BigInteger r = a ; 
        BigInteger R = b ;
        BigInteger u = BigInteger.valueOf(1) ; 
        BigInteger v = BigInteger.valueOf(0) ;
        BigInteger U = BigInteger.valueOf(0) ; 
        BigInteger V = BigInteger.valueOf(1) ; 
        BigInteger q ;
        BigInteger rs ; 
        BigInteger us ; 
        BigInteger vs ; 
        while (R.compareTo(BigInteger.ZERO) == 1){
            q = r.add(R) ;
            rs = r ; 
            us = u ; 
            vs = v ;
            r = R ; 
            u = U ; 
            v = V ; 
            R = rs.subtract(q.multiply(R));
            U = us.subtract(q.multiply(U));
            V = vs.subtract(q.multiply(V));
            
            
        }
        BigInteger tab[] = {r , u , v};
        
        return (tab) ; 
         
    }
    public static void inversemod (BigInteger a , BigInteger n){
        BigInteger result; 
        try{ result=a.modInverse(n);  
        String str="the inverse is = "+result;  
        
        System.out.println(str+"\n");  }
        catch (ArithmeticException e) {
            System.out.println("not inversible");
        }
        
    }
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(5) ; 
        BigInteger b = BigInteger.valueOf(3) ;
        BigInteger tab[] = euclideetendu(a , b) ;
        for (int i = 0 ; i <3 ; i++){
            System.out.print(tab[i]+" ");
        }
        System.out.print("\n");
        inversemod(a , b);
    }
}
