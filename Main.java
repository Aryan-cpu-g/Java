class Main{
    public static void main(String args[]){
        String str="computer";//static
        String stri=new String(" Applications");//dynamic
        System.out.println(str.indexOf('e'));
        System.out.println(str.charAt(2));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(1,4));
        System.out.println(str.replace('C','y'));
        System.out.println(str.concat(stri));
        System.out.println(str+stri);
        String strin="       Computer     ";
        // System.out.println(strin.trim());
        String abc=strin.trim();
        System.out.println(str==abc);
        System.out.println(str.equals(abc));
        System.out.println(str.equalsIgnoreCase(abc));
        


    
        
    }
}