import java.util.List;
import java.util.ArrayList;


public class Sp_Matrix  {

    public static void main(String[] args){

        Sparse_Matrix A=new Sparse_Matrix(3,2,4);
        Sparse_Matrix B=new Sparse_Matrix(3,2,5);


        A.addElement(1,1,7);
        A.addElement(2,2,4);
        A.addElement(3,1,9);
        A.addElement(3,2,2);
        System.out.println("---以下是A矩阵---");
        A.print();


        B.addElement(1,1,5);
        B.addElement(1,2,2);
        B.addElement(2,1,8);
        B.addElement(2,2,3);
        B.addElement(3,2,1);
        System.out.println("---以下是B矩阵---");
        B.print();


        //实现两个矩阵相加S
        Sparse_Matrix C=new Sparse_Matrix(3,2,6);

        int l=0;int r=0;

        while(l<A.dNum && r<B.dNum){
            if(A.v.get(l).row<B.v.get(r).row || (A.v.get(l).row==B.v.get(r).row && A.v.get(l).col<B.v.get(r).col)){

                C.addElement(A.v.get(l).row+1,A.v.get(l).col+1,A.v.get(l).value);
                    l+=1;

            } else if (A.v.get(l).row==B.v.get(r).row && A.v.get(l).col==B.v.get(r).col) {
                if(A.v.get(l).value+B.v.get(r).value!=0){
                    C.addElement(A.v.get(l).row+1,A.v.get(l).col+1,A.v.get(l).value+B.v.get(r).value);
                }
                l+=1;r+=1;

            }


            else{

                C.addElement(B.v.get(r).row+1,B.v.get(r).col+1,B.v.get(r).value);
                r+=1;
            }
        }
        while (l < A.dNum) {
            C.addElement(A.v.get(l).row + 1, A.v.get(l).col + 1, A.v.get(l).value);
            l++;
        }
        while (r < B.dNum) {
            C.addElement(B.v.get(r).row + 1, B.v.get(r).col + 1, B.v.get(r).value);
            r++;
        }



        //输出相加后的矩阵
        System.out.println("---以下是C矩阵---");
        C.print();







    }

}











//矩阵类

class Sparse_Matrix {

    int rows;
    int cols;
    int dNum;
    ArrayList<Three> v;


    Sparse_Matrix(int r,int c,int n){
        rows=r;
        cols=c;
        dNum=n;
        this.v = new ArrayList<>();

    }

    public void addElement(int r, int c, int val) {
        if (val != 0) {
            v.add(new Three(r-1, c-1, val));
        }
    }


    //输出矩阵：
    public void print(){

        int k=0;//指向非零矩阵中的当前位置
        for(int i =0;i<this.rows;i++){
            for(int j =0;j<this.cols;j++){
                if(k<this.dNum && this.v.get(k).row==i && this.v.get(k).col==j){
                    System.out.print(this.v.get(k).value+"\t");
                    k+=1;

                }
                else{
                    System.out.print(0+"\t");
                }

            }
            System.out.println();
        }
    }






}

//三元组类
class Three{

    public int row;//行下标
    public int col;
    public int value;

    Three(int r,int c,int v){
        row=r;
        col=c;
        value=v;
    }

}