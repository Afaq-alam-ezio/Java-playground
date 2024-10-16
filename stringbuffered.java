public class stringbuffered {

    public static void main(String args[]){

        StringBuffer s = new StringBuffer("Hello");

        System.out.println(s.length());
        s.setLength(20);

        System.out.println(s.capacity());   // here the default capacity was 16 and ectra 5 added due to "Hello"
        System.out.println(s.charAt(4));
        System.out.println(s.append(" World"));     // string got changed due to append
        System.out.println(s);
        
        System.out.println(s.deleteCharAt(1));
        System.out.println(s.insert(1, "o"));
        
    }
    
}
