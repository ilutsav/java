package basics;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Utsav");
        System.out.println(sb);

        // char at 0 index

        System.out.println(sb.charAt(0));

        //set char at indes 0 
          sb.setCharAt(0, 'T');
         System.out.println(sb);
        
        //insert at index
         sb.insert(0,'U');
         System.out.println(sb);

         sb.insert(3,'s');
         System.out.println(sb);
        
         //delete at index
        sb.deleteCharAt(1);
        System.out.println(sb);

        sb.delete(3, 4);
        System.out.println(sb);

        String surname = "Bhattarai";
        //append or add string
        sb.append(" "+surname);
        System.out.println(sb);

        //reverse of that string 
        System.out.println(sb.reverse());

        //

        
        }
    
}