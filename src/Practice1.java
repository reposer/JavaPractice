public class Practice1 {
    public static void main(String[] args){
        int row_count = 5;
        int num_blank = 0;
        int num_star = 0;

        for(int i=0;i<row_count;i++){
            num_blank = row_count - i - 1;
            num_star = (i -1) *2 + 1;

            for(int j=0;j<num_blank;j++){
                System.out.print(" ");
            }
            for(int k=0;k<num_star;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
