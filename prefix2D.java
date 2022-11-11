public class prefix1D {
    public static void main(String[] args) {
        int[][] a={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int[][] ap=new int[a.length][a.length];
        ap[0][0]=a[0][0];
        for(int j=0;j<a.length;j++){
            if(j-1>=0)ap[0][j]=ap[0][j-1]+a[0][j];
        }

        for(int i=0;i<a.length;i++){
            if(i-1>=0)ap[i][0]=ap[i-1][0]+a[i][0];
        }
        for(int i=1;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                ap[i][j]=ap[i-1][j]+ap[i][j-1]+a[i][j]-ap[i-1][j-1];
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println();
            for (int j=0;j<a.length;j++){
                System.out.print(" "+ap[i][j]);
            }
        }

    }
}
