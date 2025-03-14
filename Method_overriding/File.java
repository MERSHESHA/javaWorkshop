class Single {
    public void display(){
        System.out.println("hello world");
    }
}
    class Document extends Single {
       public void display(){
             System.out.println("Mershesha");
            
        }

    }
    
    public class File{
        public static void main(String args[]){
            Document obj=new Document();
            obj.display();
        }
    }
