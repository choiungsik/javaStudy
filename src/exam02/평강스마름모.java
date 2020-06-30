package exam02;

public class 평강스마름모 {
   public static void main(String[] args) {
      int[][] arr = new int[7][7];
      int num = 1;
      int cnt=0;
      for(int i=0; i<arr.length;i++) {
         for(int j =0; j<arr.length;j++) {
            
            if(i==0&&j>=3&&j<=3) {
               arr[i][j]=num;
               num++;
               
            }
            if(i==1&&j>=2&&j<=4) {
               arr[i][j]=num;
               num++;
            
            }
            if(i==2&&j>=1&&j<=5) {
               arr[i][j]=num;
               num++;
            
            }
            if(i==3&&j>=0&&j<=6) {
               arr[i][j]=num;
               num++;
               
            }
            if(i==4&&j>=1&&j<=5) {
               arr[i][j]=num;
               num++;
            
            }
            if(i==5&&j>=2&&j<=4) {
               arr[i][j]=num;
               num++;
            }
            if(i==6&&j>=3&&j<=3) {
               arr[i][j]=num;
               num++;
            
            }
         }
      }
      
      
      
      
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr.length; j++) {
            System.out.printf("%2d ",arr[i][j]);

         }System.out.println();
      }
   }
}
/*                           start         end
            0,3               --->     3             3      
        1,2 1,3 1,4                 2            4
    2,1 2,2 2,3 2,4 2,5              1            5   
3,0 3,1 3,2 3,3 3,4 3,5 3,6           0            6   
    4,1 4,2 4,3 4,4 4,5               1             5
        5,2 5,3 5,4                 2            4   
            6,3                         3            3

            0,0
        0,1 0,2 0,3
    0,4 1,0 1,1 1,2 1,3 
1,4 2,0 2,1 2,2 2,3 2,4 3,0 
   3,1 3,2 3,3 3,4 4,0 
      4,1 4,2 4,3
         4,4
*/