public class File{
    public String concatenator(String name1,String name2){
        String name=name1+" "+name2;
        return name;
    }
    public static void main(String args[]){
    File obj=new File();
    String c=obj.concatenator("mershesha","moses");
    System.out.println(c);
}
}