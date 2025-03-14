class Single {
    public void add(){
        System.out.println("hello world");
    }
}
    class Document extends Single {
        void display(){
            add();
        }

    }
    public class File{
        public static void main(String args[]){
            Document obj=new Document();
            obj.display();
        }
    }
