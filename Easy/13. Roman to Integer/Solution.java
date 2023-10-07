class Solution {
    static int num(int i){
        int l=0;
           switch(i){
	               case 'I' : l= 1;
	               break;
	               case 'V' : l= 5;
	               break;
	               case 'X' : l= 10;
	               break;
	               case 'L' : l= 50;
	               break;
	               case 'C' : l= 100;
	               break;
	               case 'D' : l= 500;
	               break;
	               case 'M' : l= 1000;
	               break;
           }
           return l;
    }
    public int romanToInt(String s) {
        int k1,k2;
        k1= num(s.charAt(s.length()-1));
        int k =k1;
        for(int i = s.length()-2;i>=0;i--){
            k2 = num(s.charAt(i));
            if(k2<k1){
                k=k-k2;
            }else{
                k = k+k2;
            }
            k1=k2;
        }
        return k;
    }
}
