public class multidimensionalaray {
    public static void main(String[] args) {
        int [] marks;       //this is a 1-D array
        int [][] flats=new int[2][3];//this is a 2-D array
        flats[0][0]=1;
        flats[0][1]=2;
        flats[1][1]=3;
        flats[1][2]=5;
        flats[0][2]=60;
        flats[1][0]=75;

        //displating a 2-d array
        System.out.println("printing a 2-d array using for loop");
        for(int i=0;i< flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
