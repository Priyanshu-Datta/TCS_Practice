package TCS_Practice;


public class colunmdelete {
    public void columnchecker(String[] strs){
        int n = strs.length;
        int k = strs[0].length();
        int count =0;

        for(int i=0;i<n;i++){
            for(int j=1;j<k;j++){
                if(strs[j].charAt(i) < strs[j-1].charAt(i)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        colunmdelete col = new colunmdelete();

        String[] strs = {"cba","daf","ghi"};

        col.columnchecker(strs);
    }
}
