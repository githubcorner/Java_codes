import java.util.HashMap;
public class countoccurence{
    public static void main(String[] args) {
        String str = "aabbccddee";
        HashMap<Character,Integer>map= new HashMap<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int count = map.get(ch);
                count++;
                map.replace(ch,count);
            }else{
                map.put(ch,1);
            }
        }
        for(Character Key:map.keySet()){
            System.out.println(Key+"-"+map.get(Key));
        }

    }
}

