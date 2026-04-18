public class Myset implements SimpleSet{
    int size;
    int max_size;
    Object[]arr;

     //初始化
    public Myset(int n) {
        this.max_size =n; // 假设默认大小
        this.arr = new Object[max_size];
        this.size = 0;
    }


    public Object get(int index){

        return this.arr[index];



    }


    public void add(Object obj){
        if(size<max_size){
            arr[size]=obj;
            size++;
        }
        else {
            System.out.println("集合已满");
        }
    }

    public void remove(Object obj){
        for(int i=0;i<size;i++){
            if(arr[i]==obj){
                for(int j=i;j<size-1;j++){
                    arr[j]=arr[j+1];
                }
                size--;
                System.out.println("Sucess!");
                return;
            }
        }
        System.out.println("WRONG:no elements!");


    }

    public Boolean contain(SimpleSet obj) {

        for (int i = 0; i < obj.size(); i++) {

            Object target = obj.get(i);
            boolean res=false;
            for(int j=0;j<size;j++){

                Object value=obj.get(i);
                if(value==this.arr[j]){
                    res=true;
                    break;
                }
            }
            if(!res){
                return false;
            }
        }
        return true;
    }


    public Boolean equals(SimpleSet obj){
        if(this.contain(obj) && obj.contain(this)){

            return true;


        }
        return false;

    }

    public int size(){
        return size;
    }

    public Boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;

    }

}
