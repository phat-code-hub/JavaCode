import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Poker_Hand {
    static final String[] RANK = {"Four of a Kind","Full House","Three of a Kind","Two Pairs","One Pair",
                                   "High Card","Straight","Flush","Straight Flush","Royal Flush" };
    static final String[] CARDS={"1","2","3","4","5","6","7","8","9","10","J","Q","K","A"}; 
    static String[] cards=null;
    static String[] suits=null;
    static boolean isAllSuits;
    static boolean isContinous;
    static  int minIndex;
    static Map<String,Integer> map=new HashMap<>();
    static List<Integer> ord;
    //-----------------------------------------------------------------------------------
    //Take Info from input string
    static void splitInfo(String card_str){
        String[] temp ;
        temp=card_str.trim().split(" ");
        cards =new String[5];
        suits =new String[5];
        int i=0;
        do {
            if (temp[i].length() ==2) {
                cards[i]=temp[i].substring(0,1).toUpperCase();
                suits[i]=temp[i].substring(1).toUpperCase();
            } 
            else {// card =10
                cards[i]=temp[i].substring(0,2).toUpperCase(); 
                suits[i]=temp[i].substring(2).toUpperCase();
            }
        } while(++i < temp.length);
    }
    //-----------------------------------------------------------------------------------
    //Check the same suit of cards
    static void checkSuit(){
        isAllSuits=true;
        for (int i=1; i<suits.length-1;i++){
            isAllSuits =suits[0].equals(suits[i]);
            if (!isAllSuits) break;
        }
    }
     //-----------------------------------------------------------------------------------
    //Extract other information
    static void card_OtherInfo(){
        List<String> temp=Arrays.asList(CARDS);
        ord=Stream.of(cards).map(x->temp.indexOf(x))
                            .sorted()
                            .collect(Collectors.toList());
        //Find min of cards
        minIndex=ord.stream().min((a,b)->a.compareTo(b)).get().intValue();
        //Check continous of cards
        List<Integer> sub_ord=ord.subList(1,5);
        List<Boolean> bool_list=new ArrayList<>();
        for (int i=0;i<ord.size()-1;i++){
            bool_list.add((sub_ord.get(i)-ord.get(i)==1));
        }
        isContinous= bool_list.stream().allMatch(b-> b==true);
    }
    //-----------------------------------------------------------------------------------
    //Count repeatable card value
    static void cardsInfo(){
        int i=0;
        String key;
        do {
            key=cards[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            } else {
                map.put(key, 1);
            }
        }while (++i <cards.length);
        // Check the same of suit
        checkSuit();
        card_OtherInfo();
    }
    //-----------------------------------------------------------------------------------
    //Classifiy Ranking
    static void showRank(){
        int index=0;
        switch (map.size()){
            case 5: // Not duplicate
            {
                if (isAllSuits) { // 5 cards have same suit
                    //5 cards are continous
                    if (isContinous) {
                        // check whether highest 5 cards or not
                        index=(minIndex ==9)? 9:8; // Royal Flush or  Straight Flush
                    } else  index =7; // Flush 
                // not same suit
                } else index=isContinous?6:5; // Straight or High Card       
                break;
            }
            case 4:{
                index=4;// One Pair
                break;
            }
            case 3:{
                if (map.containsValue(3)) index=2; //Three of a Kind
                else index =3; // Two Pair
                break;
            }
            case 2:{
                if (map.containsValue(4)) index=0; // Four of a Kind
                else index =1; // Full House
                break;
            }
        } 
        System.out.println(RANK[index]);
    }
    //-----------------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            String shaped_card=sc.nextLine().trim();
            if (shaped_card.length()>0) {
               splitInfo(shaped_card);
                cardsInfo();
                showRank();
                card_OtherInfo(); 
            }
        }finally{
            sc.close();
        }
    }
}