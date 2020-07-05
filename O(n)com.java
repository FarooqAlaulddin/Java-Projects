// Question 6 
// O(n)

//				   _____________________________
//                 | ****** Question #6*******  |
//                 |____________________________|

public class q6 {

    public static void main(String[] args) {

        
        String legs=("(((())");
        
        char f='(', b=')';
        int countBackLegs=0  , countFrontLegs=0;

        for(int i=0;i<legs.length()-1;++i){

            if(legs.charAt(i) ==f && legs.charAt(i+1)==f){
            	countBackLegs++;
            }
            if(legs.charAt(i) ==b && legs.charAt(i+1)==b){
            	countFrontLegs+=countBackLegs;
            }
        }
        
        System.out.println(" Question #5 O(N)");
        System.out.println(" The given string is     : ( ( ( ( ) )");
        System.out.println(" Total possible legs are :   " +countFrontLegs);

    }

}






















/*

//q6

public class q6 {

    public static void main(String[] args) {


    	
        String legs="(((())";
        
        String f="(";
    	String b=")";

       int countback = 0  , countFTotal= 0 ;
       try {
    	   for(int x=0;x<=legs.length();++x){
	            if(legs.substring(x, x+1).contains(f)){
	            	x+=2;
	            	countback++;
	            }
	            if(legs.substring(x, x+1).contains(b)){
	            	x+=2;
	            	countFTotal+=countback ;
	            } 
	          ++x;  
	    
	          
	        }
       }catch(StringIndexOutOfBoundsException e){
    	   System.out.println("err");
       }
   
        
    	//System.out.println(" The given string is     : ( ( ) ) ( ( ) ) ( ( ) )");
        System.out.println(" Total possible legs are :   " +countFTotal*2);
    }

}




*/