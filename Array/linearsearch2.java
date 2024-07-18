package Array;

public class linearsearch2 {
    public static int search(String menu[] ,String key){
        for (int i=0;i<menu.length;i++){
            if(menu[i]==(key)){
                return i;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[] = {"dosa" ,"cholebhature" ,"idli" ,"samosa"};
        String key = "samosa";
        
        int index = search(menu, key);


        if(index ==-1){
            System.out.println("not found");
        }
else{
    System.out.println("key is at index" + index);
}
    }
}
