public interface Figurable {


    static void draw(){
        System.out.println("interface draw");
    }
    default void def(){
        System.out.println("def");
    }

    class Figure{
        int size;
       Figure (int size){
           this.size = size;
       }
       public int getSize(){
           return size;
       }


    }
}
