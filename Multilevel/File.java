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
    class Letter extends Document{
        void help(){
            display();
        }
    }
    public class File{
        public static void main(String args[]){
            Letter obj=new Letter();
            obj.help();
        }
    }
