package _01_StringBuilder;


public class _03_StringBuilder {
    
    public static String append(String str, char[] characters) {
        StringBuilder builder = new StringBuilder(str);
        builder.append(characters).toString();
    	return builder.toString();
    }
    
    public static String reverse(String str) {
    	StringBuilder builder = new StringBuilder(str);
    	builder.reverse().toString();
    	return builder.toString();
    }
    
    public static String insert(String str, int index, char newChar) {
    	StringBuilder builder = new StringBuilder(str);
    	builder.insert(index, newChar);	
    	return builder.toString();
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
    	StringBuilder builder = new StringBuilder(str);
    	builder.delete(startIndex, endIndex);
    	return builder.toString();
    }
}