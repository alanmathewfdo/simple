public class FrequentChar{
    public static void main(String[] args){
        fruqChars("java");
    }
    public static void fruqChars(String str){
        str = str.toUpperCase();
        int[] frqu = new int[126];
        
        for(char ch : str.toCharArray()){
            frqu[ch]++;
        }
        for(char ch : str.toCharArray()){
            if(frqu[ch] > 1){
                System.out.println(ch +" " +frqu[ch]);
                frqu[ch] = 0;
            }
        }
    }
}