public class ContainString {
    public static void main(String[] args){
        if(containWord("ALWorld", "World")){
            System.out.println("word contain");
        }else{
            System.out.print("word not contain");
        }

    }
    public static boolean containWord(String str, String target){
        int strCount = str.length();
        int targetCount = target.length();
        for(int i=0; i<=strCount-targetCount; i++){
            int j;
            for(j=0; j<targetCount; j++){
                if(str.charAt(i+j) != target.charAt(j)){
                    break;
                }
            }
            if(j==targetCount){
                    return true;
                }
        }
        return false;
    }
}
