public class ExceptionHandle {
    void add(int[] a,int[] b) throws IndexOutOfBoundsException{
        if(a.length!=b.length){
            throw new IndexOutOfBoundsException("out of range");
        }
        else{
            for(int i=0;i<a.length;i++){
                System.out.println(a[i]+b[i]);
            }
        }
    }
    public static void main(String args[]){
        ExceptionHandle h= new ExceptionHandle();
        int[] a={1,3,4,5,6};
        int[] b={0,0,1,2,3};
        try{
            h.add(a,b);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("caught"+e);
        }
        finally{
            System.out.println("Bye");
        }
    }
}
