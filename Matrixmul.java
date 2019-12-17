import java.util.Scanner;
public class Matrixmul {

    public static void main(String[] args) throws InterruptedException {
        Scanner In=new Scanner(System.in);

        System.out.print("Enter the no of rows of Matrix A: ");
        int rmat1=In.nextInt();
        System.out.print("Enter the no of Column of Matrix A: ");
        int cmat1=In.nextInt();
        System.out.print("Enter the no of Row of Matrix B: ");
        int rmat2=In.nextInt();
        System.out.print("Enter the no of Column of Matrix B: ");
        int cmat2=In.nextInt();
        System.out.println();

        if(cmat1!=rmat2)
        {
            System.out.println("Enter a valid dimension for the calculation !");
            System.exit(-1);
        }
        int[][] Mat1=new int[rmat1][cmat2];
        int[][] Mat2=new int[rmat1][cmat2];
        int[][] Mat3=new int[rmat1][cmat2];
        multhread[][] res= new multhread[rmat1][cmat2];

        System.out.println("Insert Matrix 1:");
        System.out.println();
        for(int i=0;i<rmat1;i++)
        { for(int j=0;j<cmat2;j++)
            {
                System.out.print(i+","+j+" = ");
                Mat1[i][j]=In.nextInt();
            }
        }
        System.out.println();
        System.out.println("Insert Matrix 2:");
        System.out.println();
        for(int i=0;i<rmat2;i++)
        {
            for(int j=0;j<cmat2;j++)
            {
                System.out.print(i+","+j+" = ");
                Mat2[i][j]=In.nextInt();
            }
        }
        System.out.println();

        for(int i=0;i<rmat2;i++)
        {
            for(int j=0;j<cmat2;j++)
            {
               res[i][j]= new multhread(i,j,cmat1,Mat1,Mat2,Mat3);
               res[i][j].start();
            }
        }
        for(int i=0;i<rmat1;i++)
        {
            for(int j=0;j<cmat2;j++)
            {
                res[i][j].join();

            }
        }

        System.out.println("Result matrix");

        for(int i=0;i<rmat1;i++)
        {
            for(int j=0;j<cmat2;j++)
            {
                System.out.print(Mat3[i][j]+" ");
            }
            System.out.println();
        }

}
}
