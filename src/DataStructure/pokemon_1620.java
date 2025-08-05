package DataStructure;

import java.util.*;

class pokemon{
    public HashMap<String,Integer> data = new HashMap<>();// 키,데이터를 저장하기 위한 딕셔너리 구조
    public HashMap<Integer,String> data2 = new HashMap<>();

    private boolean check(String s){//대소문자/길이 체크용 함수

        if(s.length()<2) return false;
        if(s.length()>20) return false;

        char first = s.charAt(0);
        char last = s.charAt(s.length()-1);
        String middle = s.substring(1, s.length()-1);

        boolean isFirstUpper = Character.isUpperCase(first);
        boolean isLastUpper = Character.isUpperCase(last);
        boolean isMiddleLower = middle.chars().allMatch(c->Character.isLowerCase(c));

        return (isFirstUpper || isLastUpper) && isMiddleLower;
    }

    public void putPokemon(String key,Integer value){ //해시맵(딕셔너리)에 집어넣는 함수
        if(check(key)){
            data.put(key,value);
            data2.put(value,key);
        } else System.out.println("무시된 포켓몬"+key);
    }
    public boolean isNumber(String s){
        return s.matches("\\d+");
    }

    public void getPokemon(String s){
        if(isNumber(s)) System.out.println(data2.get(Integer.parseInt(s)));
        else System.out.println(data.get(s));
    }

}

public class pokemon_1620 {
    public static void main(String[] args) {
        pokemon pokemon = new pokemon();
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] split = s.split(" ");
        int n = Integer.parseInt(split[0]);//입력할 데이터 개수
        int m = Integer.parseInt(split[1]);

        for(int i = 0; i<n; i++) {
            String name = sc.nextLine();
            pokemon.putPokemon(name, i + 1);
        }
        for(int i = 1; i<m+1; i++) {
            //System.out.println(i+"번째:"); 디버깅용
            String input = sc.next();
            pokemon.getPokemon(input);
        }
    }
}
