class multhread extends Thread {
    int[][] M1;
    int[][] M2;
    int[][] M3;
    int rig,col,dim;


    public multhread(int rig, int col,int dim_com,int[][] a,int[][] b,int[][] c)
    {   this.rig=rig;
        this.col=col;
        this.dim=dim_com;
        this.M1=a;
        this.M2=b;
        this.M3=c;

    }

    public void run()
    { try{
        for(int i=0;i<dim;i++){
             M3[rig][col]+=M1[rig][i]*M2[i][col];
        }
        System.out.println(Thread.currentThread().getName());
    }
    catch (Exception e)
    {
        System.out.println("Exception Handled ");
    }
    }
}
